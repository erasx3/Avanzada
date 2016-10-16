/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.ActividadTecnica;
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
public class ActividadTecnicaJpaController implements Serializable {

    public ActividadTecnicaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(ActividadTecnica actividadTecnica) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(actividadTecnica);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(ActividadTecnica actividadTecnica) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            actividadTecnica = em.merge(actividadTecnica);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = actividadTecnica.getCodigo();
                if (findActividadTecnica(id) == null) {
                    throw new NonexistentEntityException("The actividadTecnica with id " + id + " no longer exists.");
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
            ActividadTecnica actividadTecnica;
            try {
                actividadTecnica = em.getReference(ActividadTecnica.class, id);
                actividadTecnica.getCodigo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The actividadTecnica with id " + id + " no longer exists.", enfe);
            }
            em.remove(actividadTecnica);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<ActividadTecnica> findActividadTecnicaEntities() {
        return findActividadTecnicaEntities(true, -1, -1);
    }

    public List<ActividadTecnica> findActividadTecnicaEntities(int maxResults, int firstResult) {
        return findActividadTecnicaEntities(false, maxResults, firstResult);
    }

    private List<ActividadTecnica> findActividadTecnicaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(ActividadTecnica.class));
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

    public ActividadTecnica findActividadTecnica(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(ActividadTecnica.class, id);
        } finally {
            em.close();
        }
    }

    public int getActividadTecnicaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<ActividadTecnica> rt = cq.from(ActividadTecnica.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
