package com.egg.persistencias;

import com.egg.entidades.Oficina;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class OficinaDAO {

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("viveroPU");
    private final EntityManager em = emf.createEntityManager();

    public void guardarOficina(Oficina oficina)throws Exception {
        em.getTransaction().begin();
        em.persist(oficina);
        em.getTransaction().commit();
    }
}
