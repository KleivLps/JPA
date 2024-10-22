package com.egg.entidades;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    private int idPedido;

    @Column(name = "codigo_pedido")
    private int codigoPedido;

    @Column(name = "comentarios")
    private String comentarios;

    @Column(name = "estado")
    private String estado;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_entrega", length = 6)
    private Date fechaEntrega;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_esperada", length = 6)
    private Date fechaEsperada;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_pedido", length = 6)
    private Date fechaPedido;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    public Pedido(int idPedido, int codigoPedido, Date fechaPedido, Date fechaEsperada, Date fechaEntrega, String estado, String comentarios, Cliente cliente) {
        this.idPedido = idPedido;
        this.codigoPedido = codigoPedido;
        this.fechaPedido = fechaPedido;
        this.fechaEsperada = fechaEsperada;
        this.fechaEntrega = fechaEntrega;
        this.estado = estado;
        this.comentarios = comentarios;
        this.cliente = cliente;
    }

    public Pedido(int codigoPedido, Date fechaPedido, Date fechaEsperada, Date fechaEntrega, String estado, String comentarios, Cliente cliente) {
        this.codigoPedido = codigoPedido;
        this.fechaPedido = fechaPedido;
        this.fechaEsperada = fechaEsperada;
        this.fechaEntrega = fechaEntrega;
        this.estado = estado;
        this.comentarios = comentarios;
        this.cliente = cliente;
    }

    public Pedido() {
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Date getFechaEsperada() {
        return fechaEsperada;
    }

    public void setFechaEsperada(Date fechaEsperada) {
        this.fechaEsperada = fechaEsperada;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntregada) {
        this.fechaEntrega = fechaEntregada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
