/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.DetalleCompraVenta;
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
public class DetalleCompraVentaJpaController implements Serializable {

    public DetalleCompraVentaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public DetalleCompraVentaJpaController() {
        this.emf = Persistence.createEntityManagerFactory("programa_avanzadaPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(DetalleCompraVenta detalleCompraVenta) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(detalleCompraVenta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(DetalleCompraVenta detalleCompraVenta) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            detalleCompraVenta = em.merge(detalleCompraVenta);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = detalleCompraVenta.getCodigo();
                if (findDetalleCompraVenta(id) == null) {
                    throw new NonexistentEntityException("The detalleCompraVenta with id " + id + " no longer exists.");
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
            DetalleCompraVenta detalleCompraVenta;
            try {
                detalleCompraVenta = em.getReference(DetalleCompraVenta.class, id);
                detalleCompraVenta.getCodigo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The detalleCompraVenta with id " + id + " no longer exists.", enfe);
            }
            em.remove(detalleCompraVenta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<DetalleCompraVenta> findDetalleCompraVentaEntities() {
        return findDetalleCompraVentaEntities(true, -1, -1);
    }

    public List<DetalleCompraVenta> findDetalleCompraVentaEntities(int maxResults, int firstResult) {
        return findDetalleCompraVentaEntities(false, maxResults, firstResult);
    }

    private List<DetalleCompraVenta> findDetalleCompraVentaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(DetalleCompraVenta.class));
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

    public DetalleCompraVenta findDetalleCompraVenta(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(DetalleCompraVenta.class, id);
        } finally {
            em.close();
        }
    }

    public int getDetalleCompraVentaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<DetalleCompraVenta> rt = cq.from(DetalleCompraVenta.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
