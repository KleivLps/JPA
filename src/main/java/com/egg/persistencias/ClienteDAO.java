package com.egg.persistencias;

import com.egg.entidades.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ClienteDAO {
    private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("viveroPU");
    private final EntityManager entityManager = entityManagerFactory.createEntityManager();

    //creando persistencias
    public void guardarCliente(Cliente clienteDAO) throws Exception {
        entityManager.getTransaction().begin();
        entityManager.persist(clienteDAO);
        entityManager.getTransaction().commit();
    }

    //buscando cliente x ID

    public ClienteDAO buscarCliente(int idCliente) {
        return entityManager.find(ClienteDAO.class, idCliente);
    }

    public void eliminarCliente(int id) throws Exception {
        ClienteDAO clienteDAO = buscarCliente(id);
        entityManager.getTransaction().begin();
        entityManager.remove(clienteDAO);
        entityManager.getTransaction().commit();
    }
}
