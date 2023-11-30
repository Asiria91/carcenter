package com.carcenter.asessoftware;

import com.carcenter.asessoftware.entidad.Mecanicos;
import com.carcenter.asessoftware.entidad.TipoDocumentos;
import com.carcenter.asessoftware.repositorio.MecanicoRepositorio;
import com.carcenter.asessoftware.repositorio.TipoDocumentoRepositorio;
import com.sun.faces.config.ConfigureListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.faces.webapp.FacesServlet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class AsessoftwareApplication{

	public static void main(String[] args) {
		SpringApplication.run(AsessoftwareApplication.class, args);
	}

	@Bean
	public ServletRegistrationBean facesServletRegistration() {
		ServletRegistrationBean registration = new ServletRegistrationBean<>(new FacesServlet(), "*.xhtml");
		registration.setLoadOnStartup(1);
		registration.addUrlMappings("*.jr");
		return registration;
	}

	@Bean
	public ServletContextInitializer servletContextInitializer() {
		return servletContext -> {
			servletContext.setInitParameter("com.sun.faces.forceLoadConfiguration", Boolean.TRUE.toString());
			//servletContext.setInitParameter("primefaces.THEME", "sunny");
		};
	}

	@Bean
	public ServletListenerRegistrationBean<ConfigureListener> jsfConfigureListener() {
		return new ServletListenerRegistrationBean<>(new ConfigureListener());
	}


}
