package com.egg.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "gama_producto")
public class Gama_producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_gama")
    private int idGama;

    @Column(name = "gama")
    private String gama;

    @Column(name = "descripcion_texto")
    private String descripcionTexto;

    @Column(name = "descripcion_html")
    private String descripcionHtml;

    @Column(name = "imagen")
    private String imagen;

    public Gama_producto(int idGama, String gama, String descripcionTexto, String descripcionHtml, String imagen) {
        this.idGama = idGama;
        this.gama = gama;
        this.descripcionTexto = descripcionTexto;
        this.descripcionHtml = descripcionHtml;
        this.imagen = imagen;
    }

    public Gama_producto(String gama, String descripcionTexto, String descripcionHtml, String imagen) {
        this.gama = gama;
        this.descripcionTexto = descripcionTexto;
        this.descripcionHtml = descripcionHtml;
        this.imagen = imagen;
    }

    public Gama_producto() {
    }

    public int getIdGama() {
        return idGama;
    }

    public void setIdGama(int idGama) {
        this.idGama = idGama;
    }

    public String getGama() {
        return gama;
    }

    public void setGama(String gama) {
        this.gama = gama;
    }

    public String getDescripcionTexto() {
        return descripcionTexto;
    }

    public void setDescripcionTexto(String descripcionTexto) {
        this.descripcionTexto = descripcionTexto;
    }

    public String getDescripcionHtml() {
        return descripcionHtml;
    }

    public void setDescripcionHtml(String descripcionHtml) {
        this.descripcionHtml = descripcionHtml;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
