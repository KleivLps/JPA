package com.egg.persistencias;

import com.egg.entidades.Empleado;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EmpleadoDAO {
    private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("viveroPU");
    private final EntityManager entityManager = entityManagerFactory.createEntityManager();

    public void eliminarEmpleado(int idEmpleado) throws Exception {
        Empleado empleado = buscarEmpleado(idEmpleado);
        entityManager.getTransaction().begin();
        entityManager.remove(empleado);
        entityManager.getTransaction().commit();
    }

    public Empleado buscarEmpleado(int idEmpleado) {
        return entityManager.find(Empleado.class, idEmpleado);
    }
}
