package com.egg.entidades;

import jakarta.persistence.*;

import java.util.Date;

public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPago;
    private String forma_pago;
    private String id_transaccion;

    @Temporal(TemporalType.DATE)
    private Date fecha_pago;
    private double total;

    public Pago(int idPago, String forma_pago, String id_transaccion, Date fecha_pago, double total) {
        this.idPago = idPago;
        this.forma_pago = forma_pago;
        this.id_transaccion = id_transaccion;
        this.fecha_pago = fecha_pago;
        this.total = total;
    }

    public Pago(String forma_pago, String id_transaccion, Date fecha_pago, double total) {
        this.forma_pago = forma_pago;
        this.id_transaccion = id_transaccion;
        this.fecha_pago = fecha_pago;
        this.total = total;
    }

    public Pago() {
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public String getForma_pago() {
        return forma_pago;
    }

    public void setForma_pago(String forma_pago) {
        this.forma_pago = forma_pago;
    }

    public String getId_transaccion() {
        return id_transaccion;
    }

    public void setId_transaccion(String id_transaccion) {
        this.id_transaccion = id_transaccion;
    }

    public Date getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(Date fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
