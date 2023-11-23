package com.carcenter.asessoftware.entidad;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "mantenimientos")
public class Mantenimientos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(name="estado", nullable = false)
    private Long estado;

    @Column(name = "cod_placa", nullable = false, length = 6)
    private String codPlaca;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_inicio", nullable = false)
    private Date fechaCreacion;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_fin")
    private Date fechaFin;

    @Column(name = "horas_laboradas", nullable = false)
    private Long horasLaboradas;

    @ManyToOne
    @JoinColumn(name = "documento")
    private Mecanicos mecanico;

    @PrePersist
    protected void onCreate() {
        fechaCreacion = new Date();
    }

    public Mantenimientos(){

    }


    public Mantenimientos(Long codigo, Long estado, String codPlaca, Date fechaCreacion, Date fechaFin, Long horasLaboradas, Mecanicos mecanico) {
        this.codigo = codigo;
        this.estado = estado;
        this.codPlaca = codPlaca;
        this.fechaCreacion = fechaCreacion;
        this.fechaFin = fechaFin;
        this.horasLaboradas = horasLaboradas;
        this.mecanico = mecanico;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Long getEstado() {
        return estado;
    }

    public void setEstado(Long estado) {
        this.estado = estado;
    }

    public String getCodPlaca() {
        return codPlaca;
    }

    public void setCodPlaca(String codPlaca) {
        this.codPlaca = codPlaca;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Long getHorasLaboradas() {
        return horasLaboradas;
    }

    public void setHorasLaboradas(Long horasLaboradas) {
        this.horasLaboradas = horasLaboradas;
    }

    public Mecanicos getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanicos mecanico) {
        this.mecanico = mecanico;
    }

    @Override
    public String toString() {
        return "Mantenimientos{" +
                "codigo=" + codigo +
                ", estado=" + estado +
                ", codPlaca='" + codPlaca + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaFin=" + fechaFin +
                ", horasLaboradas=" + horasLaboradas +
                ", mecanico=" + mecanico +
                '}';
    }
}
