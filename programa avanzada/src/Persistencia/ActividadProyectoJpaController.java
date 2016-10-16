/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.ActividadProyecto;
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
public class ActividadProyectoJpaController implements Serializable {

    public ActividadProyectoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(ActividadProyecto actividadProyecto) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(actividadProyecto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(ActividadProyecto actividadProyecto) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            actividadProyecto = em.merge(actividadProyecto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = actividadProyecto.getCodigo();
                if (findActividadProyecto(id) == null) {
                    throw new NonexistentEntityException("The actividadProyecto with id " + id + " no longer exists.");
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
            ActividadProyecto actividadProyecto;
            try {
                actividadProyecto = em.getReference(ActividadProyecto.class, id);
                actividadProyecto.getCodigo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The actividadProyecto with id " + id + " no longer exists.", enfe);
            }
            em.remove(actividadProyecto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<ActividadProyecto> findActividadProyectoEntities() {
        return findActividadProyectoEntities(true, -1, -1);
    }

    public List<ActividadProyecto> findActividadProyectoEntities(int maxResults, int firstResult) {
        return findActividadProyectoEntities(false, maxResults, firstResult);
    }

    private List<ActividadProyecto> findActividadProyectoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(ActividadProyecto.class));
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

    public ActividadProyecto findActividadProyecto(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(ActividadProyecto.class, id);
        } finally {
            em.close();
        }
    }

    public int getActividadProyectoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<ActividadProyecto> rt = cq.from(ActividadProyecto.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
