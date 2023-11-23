package com.carcenter.asessoftware.controller;

import com.carcenter.asessoftware.entidad.Mantenimientos;
import com.carcenter.asessoftware.entidad.Mecanicos;
import com.carcenter.asessoftware.entidad.TipoDocumentos;
import com.carcenter.asessoftware.repositorio.MantenimientosRepositorio;
import com.carcenter.asessoftware.servicio.MantenimientoServicio;
import com.carcenter.asessoftware.servicio.MecanicoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MantenimientoController {
    @Autowired
    MantenimientoServicio mantenimientoServicio;

    @Autowired
    MecanicoServicio mecanicoServicio;

    @GetMapping({"/mantenimientos", "/"})
    private String listarMecanicos(Model model){
        model.addAttribute("mantenimientos",mantenimientoServicio.listarMantenimientos());
        return "mantenimientos";
    }

    @GetMapping("/mantenimientos/nuevo")
    private String crearMantenimientoForm(Model model){
        List<Mecanicos> mecanicosList = new ArrayList<>();
        Mantenimientos mantenimientos = new Mantenimientos();
        mecanicosList = mecanicoServicio.findTop10ByOrderByHorasAsignadasAsc();
        model.addAttribute("mecanicos", mecanicosList);
        model.addAttribute("mantenimientos", mantenimientos);
        return "mantenimiento_add";
    }

    @PostMapping("/mantenimientos")
    private String guardarMecanico(@ModelAttribute("mantenimiento") Mantenimientos mantenimiento){
        mantenimientoServicio.guardarMantenimiento(mantenimiento);
        return "redirect:/mantenimientos";
    }
}
