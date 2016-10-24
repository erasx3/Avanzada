/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.OrdenTrabajo;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Logica.Turno;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Facundo
 */
public class OrdenTrabajoJpaController implements Serializable {

    public OrdenTrabajoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public OrdenTrabajoJpaController() {
        this.emf = Persistence.createEntityManagerFactory("programa_avanzadaPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(OrdenTrabajo ordenTrabajo) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Turno unTurno = ordenTrabajo.getUnTurno();
            if (unTurno != null) {
                unTurno = em.getReference(unTurno.getClass(), unTurno.getCodigo());
                ordenTrabajo.setUnTurno(unTurno);
            }
            em.persist(ordenTrabajo);
            if (unTurno != null) {
                unTurno.getUnaOrdenTrabajo().add(ordenTrabajo);
                unTurno = em.merge(unTurno);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(OrdenTrabajo ordenTrabajo) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            OrdenTrabajo persistentOrdenTrabajo = em.find(OrdenTrabajo.class, ordenTrabajo.getCodigo());
            Turno unTurnoOld = persistentOrdenTrabajo.getUnTurno();
            Turno unTurnoNew = ordenTrabajo.getUnTurno();
            if (unTurnoNew != null) {
                unTurnoNew = em.getReference(unTurnoNew.getClass(), unTurnoNew.getCodigo());
                ordenTrabajo.setUnTurno(unTurnoNew);
            }
            ordenTrabajo = em.merge(ordenTrabajo);
            if (unTurnoOld != null && !unTurnoOld.equals(unTurnoNew)) {
                unTurnoOld.getUnaOrdenTrabajo().remove(ordenTrabajo);
                unTurnoOld = em.merge(unTurnoOld);
            }
            if (unTurnoNew != null && !unTurnoNew.equals(unTurnoOld)) {
                unTurnoNew.getUnaOrdenTrabajo().add(ordenTrabajo);
                unTurnoNew = em.merge(unTurnoNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = ordenTrabajo.getCodigo();
                if (findOrdenTrabajo(id) == null) {
                    throw new NonexistentEntityException("The ordenTrabajo with id " + id + " no longer exists.");
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
            OrdenTrabajo ordenTrabajo;
            try {
                ordenTrabajo = em.getReference(OrdenTrabajo.class, id);
                ordenTrabajo.getCodigo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The ordenTrabajo with id " + id + " no longer exists.", enfe);
            }
            Turno unTurno = ordenTrabajo.getUnTurno();
            if (unTurno != null) {
                unTurno.getUnaOrdenTrabajo().remove(ordenTrabajo);
                unTurno = em.merge(unTurno);
            }
            em.remove(ordenTrabajo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<OrdenTrabajo> findOrdenTrabajoEntities() {
        return findOrdenTrabajoEntities(true, -1, -1);
    }

    public List<OrdenTrabajo> findOrdenTrabajoEntities(int maxResults, int firstResult) {
        return findOrdenTrabajoEntities(false, maxResults, firstResult);
    }

    private List<OrdenTrabajo> findOrdenTrabajoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(OrdenTrabajo.class));
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

    public OrdenTrabajo findOrdenTrabajo(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(OrdenTrabajo.class, id);
        } finally {
            em.close();
        }
    }

    public int getOrdenTrabajoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<OrdenTrabajo> rt = cq.from(OrdenTrabajo.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
