package com.carcenter.asessoftware;

import com.carcenter.asessoftware.entidad.Mecanicos;
import com.carcenter.asessoftware.entidad.TipoDocumentos;
import com.carcenter.asessoftware.repositorio.MecanicoRepositorio;
import com.carcenter.asessoftware.repositorio.TipoDocumentoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class AsessoftwareApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AsessoftwareApplication.class, args);
	}

	@Autowired
	private TipoDocumentoRepositorio tipoDocumentoRepositorio;

	@Autowired
	private MecanicoRepositorio mecanicoRepositorio;


	@Override
	public void run(String... args) throws Exception {
		/**
		 * descomentar para generar Data en Base de datos
		 *
		List<TipoDocumentos> tipoDocumentos = new ArrayList<>();
		TipoDocumentos documento1 = new TipoDocumentos("Cedula");
		tipoDocumentos.add(documento1);
		TipoDocumentos documento2 = new TipoDocumentos("Cedula Extranjeria");
		tipoDocumentos.add(documento2);
		TipoDocumentos documento3 = new TipoDocumentos("Pasaporte");
		tipoDocumentos.add(documento3);
		tipoDocumentoRepositorio.saveAll(tipoDocumentos);

		Optional<TipoDocumentos> tipoDocumentos1 = Optional.of(new TipoDocumentos());
		tipoDocumentos1 = tipoDocumentoRepositorio.findById(Long.valueOf(1));
		Mecanicos mecanicos = new Mecanicos(111482387L,tipoDocumentos1.get(),"Warlen", "Esteban", "Vinasco", "Largo",
				"3234913526", "calle 33#7-47", "wvl0213@hotmai.com", 'A');

		mecanicoRepositorio.save(mecanicos);
		 */

	}
}
