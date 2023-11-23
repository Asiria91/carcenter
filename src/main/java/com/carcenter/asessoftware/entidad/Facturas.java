package com.carcenter.asessoftware.entidad;

import javax.persistence.*;
import java.util.List;

@Entity
public class Facturas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "documento")
    private Clientes cliente;

    public Facturas(){

    }

    public Facturas(Long id, Clientes cliente) {
        this.id = id;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

}
