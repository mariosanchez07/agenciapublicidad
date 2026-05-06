package com.MASB.agenciapublicidad.controller;

import com.MASB.agenciapublicidad.model.Campana;
import com.MASB.agenciapublicidad.model.Cliente;
import com.MASB.agenciapublicidad.model.Empleado;
import com.MASB.agenciapublicidad.repository.CampanaRepository;
import com.MASB.agenciapublicidad.repository.ClienteRepository;
import com.MASB.agenciapublicidad.repository.EmpleadoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AgenciaController {

    @Autowired //Spring inyecta los repositorios automáticamente, no necesitamos crearlos con new
    private ClienteRepository clienteRepo;

    @Autowired
    private CampanaRepository campanaRepo;

    // GET /inicio
    @GetMapping("/inicio")
    public String inicio() {
        return "inicio";
    }

    // GET /listadoClientes
    @GetMapping("/listadoClientes")
    public String listadoClientes(Model model) {
        model.addAttribute("clientes", clienteRepo.findAll());
        return "listadoClientes";
    }

    // GET /listadoCampanas
    @GetMapping("/listadoCampanas")
    public String listadoCampanas(Model model) {
        model.addAttribute("campanas", campanaRepo.findAll());
        return "listadoCampanas";
    }

    // GET /altaCliente
    @GetMapping("/altaCliente")
    public String mostrarFormCliente(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "altaCliente";
    }

    // POST /altaCliente
    @PostMapping("/altaCliente")
    public String guardarCliente(@ModelAttribute Cliente cliente) {
        clienteRepo.save(cliente);
        return "redirect:/listadoClientes";
    }

    // GET /altaCampana
    @GetMapping("/altaCampana")
    public String mostrarFormCampana(Model model) {
        model.addAttribute("campana", new Campana()); //es como decirle a la vista "aquí tienes esta lista para mostrarla
        return "altaCampana";
    }

    // POST /altaCampana
    @PostMapping("/altaCampana")
    public String guardarCampana(@ModelAttribute Campana campana) {
        campanaRepo.save(campana);
        return "redirect:/listadoCampanas";
    }
    @Autowired
    private EmpleadoRepository empleadoRepo;

    // GET /listadoEmpleados
    @GetMapping("/listadoEmpleados")
    public String listadoEmpleados(Model model) {
        model.addAttribute("empleados", empleadoRepo.findAll());
        return "listadoEmpleados";
    }

    // GET /altaEmpleado
    @GetMapping("/altaEmpleado")
    public String mostrarFormEmpleado(Model model) {
        model.addAttribute("empleado", new Empleado());
        return "altaEmpleado";
    }

    // POST /altaEmpleado
    @PostMapping("/altaEmpleado")
    public String guardarEmpleado(@ModelAttribute Empleado empleado) {
        empleadoRepo.save(empleado);
        return "redirect:/listadoEmpleados";
    }
}
