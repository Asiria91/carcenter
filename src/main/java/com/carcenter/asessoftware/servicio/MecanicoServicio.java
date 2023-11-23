package com.carcenter.asessoftware.servicio;

import com.carcenter.asessoftware.entidad.Mecanicos;

import java.util.List;

public interface MecanicoServicio {
    public List<Mecanicos> listarMecanicos();

    public Mecanicos guardarMecanicos(Mecanicos mecanicos);

    List<Mecanicos> findTop10ByOrderByHorasAsignadasAsc();
}
