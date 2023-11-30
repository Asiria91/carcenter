package com.carcenter.asessoftware.controller;

import com.carcenter.asessoftware.entidad.Mecanicos;
import com.carcenter.asessoftware.entidad.TipoDocumentos;
import com.carcenter.asessoftware.repositorio.MecanicoRepositorio;
import com.carcenter.asessoftware.repositorio.TipoDocumentoRepositorio;
import org.hibernate.exception.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.sql.SQLException;
import java.util.List;
@Named(value = "mecanicoBean")
@SessionScoped
public class MecanicoBean {

    @Autowired
    private MecanicoRepositorio mecanicoRepository;

    @Autowired
    private TipoDocumentoRepositorio tipoDocumentoRepositorio;

    private List<Mecanicos> mecanicos;
    private Mecanicos newMecanico;

    private List<TipoDocumentos> listaTiposDocumento;

    private Long tipoDocumentos;

    @PostConstruct
    public void init() {
        mecanicos = mecanicoRepository.findAll();
        listaTiposDocumento = tipoDocumentoRepositorio.findAll();
        newMecanico = new Mecanicos();
    }

    public List<Mecanicos> getMecanicos() {
        return mecanicos;
    }

    public Mecanicos getNewMecanico() {
        return newMecanico;
    }

    public void setNewMecanico(Mecanicos newMecanico) {
        this.newMecanico = newMecanico;
    }

    /**
     * metodo para guardar un mecanico
     */
    public void save() {
        try {
            newMecanico.setTipoDocumento(tipoDocumentoRepositorio.findById(tipoDocumentos).get());
            mecanicoRepository.save(newMecanico);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Éxito", "Guardado exitoso"));
            init();
        }catch (Exception e){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "no se ha podido guardar al mecanico : "+ e.getMessage()));
        }
    }

    public void delete(Long id) {
        mecanicoRepository.deleteById(id);
        init();
    }

    public void setMecanicos(List<Mecanicos> mecanicos) {
        this.mecanicos = mecanicos;
    }

    public List<TipoDocumentos> getListaTiposDocumento() {
        return listaTiposDocumento;
    }

    public void setListaTiposDocumento(List<TipoDocumentos> listaTiposDocumento) {
        this.listaTiposDocumento = listaTiposDocumento;
    }

    public Long getTipoDocumentos() {
        return tipoDocumentos;
    }

    public void setTipoDocumentos(Long tipoDocumentos) {
        this.tipoDocumentos = tipoDocumentos;
    }
}