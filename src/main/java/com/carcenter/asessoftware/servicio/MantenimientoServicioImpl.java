package com.carcenter.asessoftware.servicio;

import com.carcenter.asessoftware.entidad.Mantenimientos;
import com.carcenter.asessoftware.repositorio.MantenimientosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MantenimientoServicioImpl implements MantenimientoServicio{
    @Autowired
    private MantenimientosRepositorio mantenimientosRepositorio;
    @Override
    public List<Mantenimientos> listarMantenimientos() {
        return mantenimientosRepositorio.findAll();
    }

    @Override
    public Mantenimientos guardarMantenimiento(Mantenimientos mantenimientos) {
        return mantenimientosRepositorio.save(mantenimientos);
    }

}
