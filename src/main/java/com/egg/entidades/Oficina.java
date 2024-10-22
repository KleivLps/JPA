package com.egg.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "Oficina")
public class Oficina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_oficina")
    private int idOficina;

    @Column(name = "ciudad", length = 30)
    private String ciudad;

    @Column(name = "codigo_postal", length = 10)
    private String codigoPostal;

    @Column(name = "codigo_oficina", length = 10)
    private String codigoOficina;

    @Column(name = "pais", length = 50)
    private String pais;

    @Column(name = "region", length = 50)
    private String region;

    @Column(name = "telefono", length = 20)
    private String telefono;

    public void setCodigoOficina(String codigoOficina) {
    }

    public void setCiudad(String ciudad) {
    }

    public void setPais(String pais) {
    }

    public void setRegion(String region) {
    }

    public void setTelefono(String telefono) {
    }

    public void setCodigoPostal(String codigoPostal) {

    }
}
