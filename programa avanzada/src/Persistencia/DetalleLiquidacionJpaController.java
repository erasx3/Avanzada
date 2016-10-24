/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.DetalleLiquidacion;
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
public class DetalleLiquidacionJpaController implements Serializable {

    public DetalleLiquidacionJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public DetalleLiquidacionJpaController() {
        this.emf = Persistence.createEntityManagerFactory("programa_avanzadaPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(DetalleLiquidacion detalleLiquidacion) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(detalleLiquidacion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(DetalleLiquidacion detalleLiquidacion) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            detalleLiquidacion = em.merge(detalleLiquidacion);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = detalleLiquidacion.getCodigo();
                if (findDetalleLiquidacion(id) == null) {
                    throw new NonexistentEntityException("The detalleLiquidacion with id " + id + " no longer exists.");
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
            DetalleLiquidacion detalleLiquidacion;
            try {
                detalleLiquidacion = em.getReference(DetalleLiquidacion.class, id);
                detalleLiquidacion.getCodigo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The detalleLiquidacion with id " + id + " no longer exists.", enfe);
            }
            em.remove(detalleLiquidacion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<DetalleLiquidacion> findDetalleLiquidacionEntities() {
        return findDetalleLiquidacionEntities(true, -1, -1);
    }

    public List<DetalleLiquidacion> findDetalleLiquidacionEntities(int maxResults, int firstResult) {
        return findDetalleLiquidacionEntities(false, maxResults, firstResult);
    }

    private List<DetalleLiquidacion> findDetalleLiquidacionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(DetalleLiquidacion.class));
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

    public DetalleLiquidacion findDetalleLiquidacion(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(DetalleLiquidacion.class, id);
        } finally {
            em.close();
        }
    }

    public int getDetalleLiquidacionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<DetalleLiquidacion> rt = cq.from(DetalleLiquidacion.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
