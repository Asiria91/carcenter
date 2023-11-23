package com.carcenter.asessoftware.entidad;

import javax.persistence.*;
import java.util.List;

@Entity
public class Clientes {

    @Id
    private Long documento;

    @ManyToOne
    @JoinColumn(name = "tipodocumentoid")
    private TipoDocumentos tipoDocumento;

    @Column(name="primer_nombre", nullable = false,length = 30)
    private String primerNombre;

    @Column(name="segundo_nombre",length = 30)
    private String segundoNombre;

    @Column(name="primer_apellido", nullable = false,length = 30)
    private String primerApellido;
    @Column(name="segundo_apellido", nullable = false,length = 30)
    private String segundoApellido;
    @Column(name="celular", nullable = false,length = 10)
    private String celular;
    @Column(name="direccion", nullable = false,length = 20)
    private String direccion;
    @Column(name="email", nullable = false,length = 100)
    private String email;
    @Column(name="estado", nullable = false,length = 1)
    private Character estado;

    public Clientes(){

    }

    public Clientes(Long documento, TipoDocumentos tipoDocumento, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String celular, String direccion, String email, Character estado) {
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.celular = celular;
        this.direccion = direccion;
        this.email = email;
        this.estado = estado;
    }

    public Long getDocumento() {
        return documento;
    }

    public void setDocumento(Long documento) {
        this.documento = documento;
    }

    public TipoDocumentos getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumentos tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "documento=" + documento +
                ", tipoDocumento=" + tipoDocumento +
                ", primerNombre='" + primerNombre + '\'' +
                ", segundoNombre='" + segundoNombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", celular='" + celular + '\'' +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                ", estado=" + estado +
                '}';
    }
}
