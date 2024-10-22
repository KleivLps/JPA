package com.egg.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "Producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private int idProducto;

    @Column(name = "cantidad_en_stock")
    private int cantidadEnStock;

    @Column(name = "codigo_producto")
    private String codigoProducto;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "dimensiones")
    private String dimensiones;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "precio_proveedor")
    private int precioProveedor;

    @Column(name = "precio_venta")
    private int precioVenta;

    @Column(name = "proveedor")
    private String proveedor;

    @ManyToOne
    @JoinColumn(name = "id_gama")
    private Gama_producto gama_producto;

    public Producto(int idProducto, int cantidadEnStock, String descripcion, String codigoProducto, String dimensiones, String nombre, int precioProveedor, int precioVenta, String proveedor, Gama_producto gama_producto) {
        this.idProducto = idProducto;
        this.cantidadEnStock = cantidadEnStock;
        this.descripcion = descripcion;
        this.codigoProducto = codigoProducto;
        this.dimensiones = dimensiones;
        this.nombre = nombre;
        this.precioProveedor = precioProveedor;
        this.precioVenta = precioVenta;
        this.proveedor = proveedor;
        this.gama_producto = gama_producto;
    }

    public Producto(int cantidadEnStock, String codigoProducto, String descripcion, String dimensiones, String nombre, int precioProveedor, int precioVenta, String proveedor, Gama_producto gama_producto) {
        this.cantidadEnStock = cantidadEnStock;
        this.codigoProducto = codigoProducto;
        this.descripcion = descripcion;
        this.dimensiones = dimensiones;
        this.nombre = nombre;
        this.precioProveedor = precioProveedor;
        this.precioVenta = precioVenta;
        this.proveedor = proveedor;
        this.gama_producto = gama_producto;
    }

    public Producto() {
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecioProveedor() {
        return precioProveedor;
    }

    public void setPrecioProveedor(int precioProveedor) {
        this.precioProveedor = precioProveedor;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public Gama_producto getGama_producto() {
        return gama_producto;
    }

    public void setGama_producto(Gama_producto gama_producto) {
        this.gama_producto = gama_producto;
    }
}