/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.Detalle;
import Persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Facundo
 */
public class DetalleJpaController implements Serializable {

    public DetalleJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public DetalleJpaController() {
        this.emf = Persistence.createEntityManagerFactory("programa_avanzadaPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Detalle detalle) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(detalle);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Detalle detalle) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            detalle = em.merge(detalle);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = detalle.getCodigo();
                if (findDetalle(id) == null) {
                    throw new NonexistentEntityException("The detalle with id " + id + " no longer exists.");
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
            Detalle detalle;
            try {
                detalle = em.getReference(Detalle.class, id);
                detalle.getCodigo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The detalle with id " + id + " no longer exists.", enfe);
            }
            em.remove(detalle);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Detalle> findDetalleEntities() {
        return findDetalleEntities(true, -1, -1);
    }

    public List<Detalle> findDetalleEntities(int maxResults, int firstResult) {
        return findDetalleEntities(false, maxResults, firstResult);
    }

    private List<Detalle> findDetalleEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Detalle.class));
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

    public Detalle findDetalle(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Detalle.class, id);
        } finally {
            em.close();
        }
    }

    public int getDetalleCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Detalle> rt = cq.from(Detalle.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
