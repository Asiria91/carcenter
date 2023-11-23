package com.carcenter.asessoftware.servicio;

import com.carcenter.asessoftware.entidad.Mecanicos;
import com.carcenter.asessoftware.repositorio.MecanicoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MecanicoServicioImpl implements MecanicoServicio{

    @Autowired
    private MecanicoRepositorio mecanicoRepositorio;

    @Override
    public List<Mecanicos> listarMecanicos() {
        return mecanicoRepositorio.findAll();
    }

    @Override
    public Mecanicos guardarMecanicos(Mecanicos mecanicos) {
        return mecanicoRepositorio.save(mecanicos);
    }

    @Override
    public List<Mecanicos> findTop10ByOrderByHorasAsignadasAsc() {
        List<Mecanicos> result = mecanicoRepositorio.findTop10ByOrderByHorasAsignadasAsc();
        return result;
    }


}
