package com.carcenter.asessoftware.controller;

import com.carcenter.asessoftware.entidad.Mecanicos;
import com.carcenter.asessoftware.entidad.TipoDocumentos;
import com.carcenter.asessoftware.servicio.MecanicoServicio;
import com.carcenter.asessoftware.servicio.TipoDocumentoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MecanicoControlador {

    @Autowired
    private MecanicoServicio mecanicoServicio;

    @Autowired
    private TipoDocumentoServicio tipoDocumentoServicio;

    @GetMapping({"/mecanicos", "/"})
    private String listarMecanicos(Model model){
        model.addAttribute("mecanicos",mecanicoServicio.listarMecanicos());
        return "mecanicos";
    }

    @GetMapping("/mecanicos/nuevo")
    private String crearMecanicoForm(Model model){
        List<TipoDocumentos> tipoDocumentosList = new ArrayList<>();
        Mecanicos mecanicos = new Mecanicos();
        tipoDocumentosList = tipoDocumentoServicio.listarTipoDocumentos();
        model.addAttribute("tiposDocumentos", tipoDocumentosList);
        model.addAttribute("mecanicos", mecanicos);
        return "mecanico_add";
    }

    @PostMapping("/mecanicos")
    private String guardarMecanico(@ModelAttribute("mecanico") Mecanicos mecanicos){
        mecanicoServicio.guardarMecanicos(mecanicos);
        return "redirect:/mecanicos";
    }

}
