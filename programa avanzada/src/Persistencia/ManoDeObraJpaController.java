/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.ManoDeObra;
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
public class ManoDeObraJpaController implements Serializable {

    public ManoDeObraJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public ManoDeObraJpaController() {
        this.emf = Persistence.createEntityManagerFactory("programa_avanzadaPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(ManoDeObra manoDeObra) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(manoDeObra);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(ManoDeObra manoDeObra) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            manoDeObra = em.merge(manoDeObra);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = manoDeObra.getCodigo();
                if (findManoDeObra(id) == null) {
                    throw new NonexistentEntityException("The manoDeObra with id " + id + " no longer exists.");
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
            ManoDeObra manoDeObra;
            try {
                manoDeObra = em.getReference(ManoDeObra.class, id);
                manoDeObra.getCodigo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The manoDeObra with id " + id + " no longer exists.", enfe);
            }
            em.remove(manoDeObra);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<ManoDeObra> findManoDeObraEntities() {
        return findManoDeObraEntities(true, -1, -1);
    }

    public List<ManoDeObra> findManoDeObraEntities(int maxResults, int firstResult) {
        return findManoDeObraEntities(false, maxResults, firstResult);
    }

    private List<ManoDeObra> findManoDeObraEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(ManoDeObra.class));
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

    public ManoDeObra findManoDeObra(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(ManoDeObra.class, id);
        } finally {
            em.close();
        }
    }

    public int getManoDeObraCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<ManoDeObra> rt = cq.from(ManoDeObra.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
