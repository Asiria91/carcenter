package com.carcenter.asessoftware.entidad;

import javax.persistence.*;

@Entity
public class DetalleFacturas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double precioUnitario;

    private Integer cantidad;

    private Double descuento;

    // Relaciones con Mantenimiento y Factura
    @ManyToOne
    @JoinColumn(name = "mantenimiento")
    private Mantenimientos mantenimiento;

    @ManyToOne
    @JoinColumn(name = "factura_id")
    private Facturas factura;

    public DetalleFacturas() {
    }

    public DetalleFacturas(Long id, Double precioUnitario, Integer cantidad, Double descuento, Mantenimientos mantenimiento, Facturas factura) {
        this.id = id;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.mantenimiento = mantenimiento;
        this.factura = factura;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public Mantenimientos getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(Mantenimientos mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    public Facturas getFactura() {
        return factura;
    }

    public void setFactura(Facturas factura) {
        this.factura = factura;
    }
}
