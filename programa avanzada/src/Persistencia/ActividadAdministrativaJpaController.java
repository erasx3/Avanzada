/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.ActividadAdministrativa;
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
public class ActividadAdministrativaJpaController implements Serializable {

    public ActividadAdministrativaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public ActividadAdministrativaJpaController() {
        this.emf = Persistence.createEntityManagerFactory("programa_avanzadaPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(ActividadAdministrativa actividadAdministrativa) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(actividadAdministrativa);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(ActividadAdministrativa actividadAdministrativa) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            actividadAdministrativa = em.merge(actividadAdministrativa);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = actividadAdministrativa.getCodigo();
                if (findActividadAdministrativa(id) == null) {
                    throw new NonexistentEntityException("The actividadAdministrativa with id " + id + " no longer exists.");
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
            ActividadAdministrativa actividadAdministrativa;
            try {
                actividadAdministrativa = em.getReference(ActividadAdministrativa.class, id);
                actividadAdministrativa.getCodigo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The actividadAdministrativa with id " + id + " no longer exists.", enfe);
            }
            em.remove(actividadAdministrativa);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<ActividadAdministrativa> findActividadAdministrativaEntities() {
        return findActividadAdministrativaEntities(true, -1, -1);
    }

    public List<ActividadAdministrativa> findActividadAdministrativaEntities(int maxResults, int firstResult) {
        return findActividadAdministrativaEntities(false, maxResults, firstResult);
    }

    private List<ActividadAdministrativa> findActividadAdministrativaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(ActividadAdministrativa.class));
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

    public ActividadAdministrativa findActividadAdministrativa(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(ActividadAdministrativa.class, id);
        } finally {
            em.close();
        }
    }

    public int getActividadAdministrativaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<ActividadAdministrativa> rt = cq.from(ActividadAdministrativa.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
