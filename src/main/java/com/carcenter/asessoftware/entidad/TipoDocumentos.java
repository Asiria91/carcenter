package com.carcenter.asessoftware.entidad;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tipodocumentos")
public class TipoDocumentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descripcion", nullable = false, length = 50)
    private String descripcion;

    public TipoDocumentos(){

    }

    public TipoDocumentos(Long id, String descripcion) {
        super();
        this.id = id;
        this.descripcion = descripcion;
    }

    public TipoDocumentos(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "TipoDocumentos{" +
                "id=" + id +
                ", descripcion=" + descripcion +
                '}';
    }
}
