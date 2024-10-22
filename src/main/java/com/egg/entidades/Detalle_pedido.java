package com.egg.entidades;


import jakarta.persistence.*;

@Entity //Es una entidad
@Table(name = "detalle_pedido") //nombre de la tabla
public class Detalle_pedido {

    @Id //generacion y declaracion del id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle_pedido")
    private int idDetallePedido;

    @ManyToOne //Definiendo el tipo de relacion
    @JoinColumn(name = "id_pedido") //Haciendo la realcion con Pedido, relacionando id_Pedido con pedido
    private Pedido pedido;

    @ManyToOne //haciendo lo mismo pero esta vez con id_producto y con Producto
    @JoinColumn(name = "id_producto")
    private Producto producto;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "precio_unidad")
    private double precioUnidad;

    @Column(name = "numero_linea")
    private int numeroLinea;

    public Detalle_pedido(int idDetallePedido, Pedido pedido, int cantidad, Producto producto, double precioUnidad, int numeroLinea) {
        this.idDetallePedido = idDetallePedido;
        this.pedido = pedido;
        this.cantidad = cantidad;
        this.producto = producto;
        this.precioUnidad = precioUnidad;
        this.numeroLinea = numeroLinea;
    }

    public Detalle_pedido(Pedido pedido, Producto producto, int cantidad, double precioUnidad, int numeroLinea) {
        this.pedido = pedido;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
        this.numeroLinea = numeroLinea;
    }

    public int getIdDetallePedido() {
        return idDetallePedido;
    }

    public void setIdDetallePedido(int idDetallePedido) {
        this.idDetallePedido = idDetallePedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public int getNumeroLinea() {
        return numeroLinea;
    }

    public void setNumeroLinea(int numeroLinea) {
        this.numeroLinea = numeroLinea;
    }
}
