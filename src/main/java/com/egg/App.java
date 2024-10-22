package com.egg;

import com.egg.entidades.Cliente;
import com.egg.persistencias.ClienteDAO;
import com.egg.servicios.ClienteServicio;
import com.egg.servicios.EmpleadoServicio;
import com.egg.servicios.OficinaServicio;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("viveroPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
    }


}
