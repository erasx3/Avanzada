/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.TipoLiquidacion;
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
public class TipoLiquidacionJpaController implements Serializable {

    public TipoLiquidacionJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(TipoLiquidacion tipoLiquidacion) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(tipoLiquidacion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TipoLiquidacion tipoLiquidacion) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            tipoLiquidacion = em.merge(tipoLiquidacion);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = tipoLiquidacion.getCodigo();
                if (findTipoLiquidacion(id) == null) {
                    throw new NonexistentEntityException("The tipoLiquidacion with id " + id + " no longer exists.");
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
            TipoLiquidacion tipoLiquidacion;
            try {
                tipoLiquidacion = em.getReference(TipoLiquidacion.class, id);
                tipoLiquidacion.getCodigo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tipoLiquidacion with id " + id + " no longer exists.", enfe);
            }
            em.remove(tipoLiquidacion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TipoLiquidacion> findTipoLiquidacionEntities() {
        return findTipoLiquidacionEntities(true, -1, -1);
    }

    public List<TipoLiquidacion> findTipoLiquidacionEntities(int maxResults, int firstResult) {
        return findTipoLiquidacionEntities(false, maxResults, firstResult);
    }

    private List<TipoLiquidacion> findTipoLiquidacionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TipoLiquidacion.class));
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

    public TipoLiquidacion findTipoLiquidacion(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TipoLiquidacion.class, id);
        } finally {
            em.close();
        }
    }

    public int getTipoLiquidacionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TipoLiquidacion> rt = cq.from(TipoLiquidacion.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
