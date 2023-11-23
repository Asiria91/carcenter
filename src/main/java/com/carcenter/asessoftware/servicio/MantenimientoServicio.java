package com.carcenter.asessoftware.servicio;

import com.carcenter.asessoftware.entidad.Mantenimientos;

import java.util.List;

public interface MantenimientoServicio {
    public List<Mantenimientos> listarMantenimientos();

    public Mantenimientos guardarMantenimiento(Mantenimientos mantenimientos);
}
