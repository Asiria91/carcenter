package com.carcenter.asessoftware.servicio;

import com.carcenter.asessoftware.entidad.TipoDocumentos;
import com.carcenter.asessoftware.repositorio.TipoDocumentoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoDocumentoServicioImpl implements TipoDocumentoServicio{

    @Autowired
    TipoDocumentoRepositorio tipoDocumentoRepositorio;
    @Override
    public List<TipoDocumentos> listarTipoDocumentos() {
        return tipoDocumentoRepositorio.findAll();
    }
}
