/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.TipoComprobante;
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
public class TipoComprobanteJpaController implements Serializable {

    public TipoComprobanteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(TipoComprobante tipoComprobante) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(tipoComprobante);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TipoComprobante tipoComprobante) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            tipoComprobante = em.merge(tipoComprobante);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = tipoComprobante.getCodigo();
                if (findTipoComprobante(id) == null) {
                    throw new NonexistentEntityException("The tipoComprobante with id " + id + " no longer exists.");
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
            TipoComprobante tipoComprobante;
            try {
                tipoComprobante = em.getReference(TipoComprobante.class, id);
                tipoComprobante.getCodigo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tipoComprobante with id " + id + " no longer exists.", enfe);
            }
            em.remove(tipoComprobante);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TipoComprobante> findTipoComprobanteEntities() {
        return findTipoComprobanteEntities(true, -1, -1);
    }

    public List<TipoComprobante> findTipoComprobanteEntities(int maxResults, int firstResult) {
        return findTipoComprobanteEntities(false, maxResults, firstResult);
    }

    private List<TipoComprobante> findTipoComprobanteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TipoComprobante.class));
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

    public TipoComprobante findTipoComprobante(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TipoComprobante.class, id);
        } finally {
            em.close();
        }
    }

    public int getTipoComprobanteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TipoComprobante> rt = cq.from(TipoComprobante.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
