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
    /*public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("viveroPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
    }*/
    public static void main(String[] args) {
        OficinaServicio oficinaServicio = new OficinaServicio();
        //instancia a oficinaservicio para acceder a los metodos
        ClienteServicio clienteServicio = new ClienteServicio();
        EmpleadoServicio empleadoServicio = new EmpleadoServicio();

        //llamando al metodod del servicio para crear una nueva oficina

        oficinaServicio.createOficina("OFI04", "Mendoza","Argentina", "Cuyo", "05212345641", "CP5000");

        //creando un nuevo cliente

        clienteServicio.crearCliente(28,"PruebaCliente", "PruebaCliente1","apellidoPruebaContacto", "5654421345", "51584521", "CiudadDePrueba","RegionDePrueba", "PaisDePrueba", "CodigoPostalDePrueba", 2, 5000);
        ClienteDAO cliente = clienteServicio.buscarCliente(5);
        System.out.println(cliente.toString());
        ClienteDAO cliente1 = clienteServicio.buscarCliente(800);

        empleadoServicio.eliminar(1);
    }

}
