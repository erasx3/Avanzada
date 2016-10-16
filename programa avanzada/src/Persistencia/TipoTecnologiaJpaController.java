/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.TipoTecnologia;
import Persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Facundo
 */
public class TipoTecnologiaJpaController implements Serializable {

    public TipoTecnologiaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(TipoTecnologia tipoTecnologia) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(tipoTecnologia);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TipoTecnologia tipoTecnologia) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            tipoTecnologia = em.merge(tipoTecnologia);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = tipoTecnologia.getCodigo();
                if (findTipoTecnologia(id) == null) {
                    throw new NonexistentEntityException("The tipoTecnologia with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TipoTecnologia tipoTecnologia;
            try {
                tipoTecnologia = em.getReference(TipoTecnologia.class, id);
                tipoTecnologia.getCodigo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tipoTecnologia with id " + id + " no longer exists.", enfe);
            }
            em.remove(tipoTecnologia);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TipoTecnologia> findTipoTecnologiaEntities() {
        return findTipoTecnologiaEntities(true, -1, -1);
    }

    public List<TipoTecnologia> findTipoTecnologiaEntities(int maxResults, int firstResult) {
        return findTipoTecnologiaEntities(false, maxResults, firstResult);
    }

    private List<TipoTecnologia> findTipoTecnologiaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TipoTecnologia.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public TipoTecnologia findTipoTecnologia(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TipoTecnologia.class, id);
        } finally {
            em.close();
        }
    }

    public int getTipoTecnologiaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TipoTecnologia> rt = cq.from(TipoTecnologia.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
