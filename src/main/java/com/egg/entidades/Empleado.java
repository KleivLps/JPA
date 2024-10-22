package com.egg.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private int idEmplado;

    @Column(name = "codigo_empleado")
    private int codigoEmpleado;

    @Column(name = "nombre", length = 50)
    private String nombre;

    @Column(name = "apellido", length = 50)
    private String apellido;

    @Column(name = "extension", length = 10)
    private String extension;

    @Column(name = "email", length = 100)
    private String email;

    @ManyToOne
    @JoinColumn(name = "id_oficina")//enlazo oficina con id_oficina
    private Oficina oficina;

    @Column(name = "id_jefe")
    private int idJefe;

    @Column(name = "puesto")
    private String puesto;

    public Empleado(int idEmplado, int codigoEmpleado, String nombre, String apellido, String extension, String email, Oficina oficina, int idJefe, String puesto) {
        this.idEmplado = idEmplado;
        this.codigoEmpleado = codigoEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.extension = extension;
        this.email = email;
        this.oficina = oficina;
        this.idJefe = idJefe;
        this.puesto = puesto;
    }

    public Empleado(int codigoEmpleado, String nombre, String apellido, String extension, String email, Oficina oficina, int idJefe, String puesto) {
        this.codigoEmpleado = codigoEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.extension = extension;
        this.email = email;
        this.oficina = oficina;
        this.idJefe = idJefe;
        this.puesto = puesto;
    }

    public Empleado() {
    }

    public int getIdEmplado() {
        return idEmplado;
    }

    public void setIdEmplado(int idEmplado) {
        this.idEmplado = idEmplado;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    public int getIdJefe() {
        return idJefe;
    }

    public void setIdJefe(int idJefe) {
        this.idJefe = idJefe;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}
