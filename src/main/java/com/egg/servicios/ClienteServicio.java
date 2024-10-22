package com.egg.servicios;

import com.egg.entidades.Cliente;
import com.egg.persistencias.ClienteDAO;

public class ClienteServicio {
    private final ClienteDAO clienteDAO;

    public ClienteServicio(){
        this.clienteDAO = new ClienteDAO();
    }

  public void crearCliente(int codigoCliente, String nombreCliente, String nombreContacto, String apellidoContacto, String telefono, String fax, String ciudad, String region, String pais, String codigoPostal, int idEmpleado, double limiteCredito) {
        try {
            Cliente clienteNuevo = new Cliente();

            clienteNuevo.setCodigoCliente(codigoCliente);
            clienteNuevo.setNombreCliente(nombreCliente);
            clienteNuevo.setNombreContacto(nombreContacto);
            clienteNuevo.setApellidoContacto(apellidoContacto);
            clienteNuevo.setTelefono(telefono);
            clienteNuevo.setFax(fax);
            clienteNuevo.setCiudad(ciudad);
            clienteNuevo.setRegion(region);
            clienteNuevo.setPais(pais);
            clienteNuevo.setCodigoPostal(codigoCliente);
            clienteNuevo.setIdCliente(idEmpleado);
            clienteNuevo.setLimiteCredito(limiteCredito);

            clienteDAO.guardarCliente(clienteNuevo);
        } catch (Exception e) {
            System.out.println(e.toString() + "No se guardo el cliente de manera correcta");
        }
  }

  //metodo para buscar cliente x codigo
    public ClienteDAO buscarCliente(int idCliente) {
        ClienteDAO cliente = clienteDAO.buscarCliente(idCliente);
        try {
            if(cliente == null) {
                System.out.println("No eciste un cliente con el ID proporcionado: " + idCliente);
            }

            return cliente;
        } catch (Exception e) {
            System.out.println("Ocurrio un error al buscar el cliente: " + e.getMessage());
        }
        return null;
    }
}
