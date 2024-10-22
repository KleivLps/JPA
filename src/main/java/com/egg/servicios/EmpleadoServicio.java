package com.egg.servicios;

import com.egg.persistencias.EmpleadoDAO;

public class EmpleadoServicio {
    private final EmpleadoDAO empleadoDAO;

    public EmpleadoServicio(){
        this.empleadoDAO = new EmpleadoDAO();
    }

    public void eliminar(int id) {
        try {
            empleadoDAO.eliminarEmpleado(id);
            System.out.println("EMPLEADO ELIMINADO CON EXITO");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("NO SE ENCONTRO EL EMPLEADO PARA ELIMINAR");
        }
    }



}
