package com.carcenter.asessoftware.repositorio;

import com.carcenter.asessoftware.entidad.TipoDocumentos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDocumentoRepositorio extends JpaRepository<TipoDocumentos, Long> {
}
