package com.egg.servicios;

import com.egg.entidades.Oficina;
import com.egg.persistencias.OficinaDAO;

public class OficinaServicio {
    private final OficinaDAO oficinaDAO;

    public OficinaServicio() {
        this.oficinaDAO = new OficinaDAO();
    }

    public void createOficina(String codigoOficina, String ciudad, String pais, String region, String telefono, String codigoPostal) {
        try {
            Oficina oficinaNueva = new Oficina();
            oficinaNueva.setCodigoOficina(codigoOficina);
            oficinaNueva.setCiudad(ciudad);
            oficinaNueva.setPais(pais);
            oficinaNueva.setRegion(region);
            oficinaNueva.setTelefono(telefono);
            oficinaNueva.setCodigoPostal(codigoPostal);

            oficinaDAO.guardarOficina(oficinaNueva);
        } catch (Exception e) {
            System.out.println(e.toString() + "No se guardo la nueva oficina de manera correcta");
        }
    }
}
