package com.carcenter.asessoftware.repositorio;

import com.carcenter.asessoftware.entidad.Mecanicos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MecanicoRepositorio extends JpaRepository<Mecanicos, Long> {
    @Query(value = "select mc.* from mecanicos mc\n" +
            "inner join public.mantenimientos m on mc.documento = m.documento\n" +
            "where m.fecha_fin is not null\n" +
            "GROUP BY mc.documento\n" +
            "order by sum(m.horas_laboradas) ASC LIMIT 10;", nativeQuery = true)
    List<Mecanicos> findTop10ByOrderByHorasAsignadasAsc();

    @Procedure("InsertarMecanico")
    void insertarMecanico(long documento, long tipoDocumento, String primerNombre,
                          String segundoNombre, String primerApellido, String segundoApellido,
                          String celular, String direccion, String email, char estado);
}
