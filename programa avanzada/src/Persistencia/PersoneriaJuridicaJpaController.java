/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.PersoneriaJuridica;
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
public class PersoneriaJuridicaJpaController implements Serializable {

    public PersoneriaJuridicaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(PersoneriaJuridica personeriaJuridica) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(personeriaJuridica);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(PersoneriaJuridica personeriaJuridica) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            personeriaJuridica = em.merge(personeriaJuridica);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = personeriaJuridica.getCodigo();
                if (findPersoneriaJuridica(id) == null) {
                    throw new NonexistentEntityException("The personeriaJuridica with id " + id + " no longer exists.");
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
            PersoneriaJuridica personeriaJuridica;
            try {
                personeriaJuridica = em.getReference(PersoneriaJuridica.class, id);
                personeriaJuridica.getCodigo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The personeriaJuridica with id " + id + " no longer exists.", enfe);
            }
            em.remove(personeriaJuridica);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<PersoneriaJuridica> findPersoneriaJuridicaEntities() {
        return findPersoneriaJuridicaEntities(true, -1, -1);
    }

    public List<PersoneriaJuridica> findPersoneriaJuridicaEntities(int maxResults, int firstResult) {
        return findPersoneriaJuridicaEntities(false, maxResults, firstResult);
    }

    private List<PersoneriaJuridica> findPersoneriaJuridicaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(PersoneriaJuridica.class));
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

    public PersoneriaJuridica findPersoneriaJuridica(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(PersoneriaJuridica.class, id);
        } finally {
            em.close();
        }
    }

    public int getPersoneriaJuridicaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<PersoneriaJuridica> rt = cq.from(PersoneriaJuridica.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
