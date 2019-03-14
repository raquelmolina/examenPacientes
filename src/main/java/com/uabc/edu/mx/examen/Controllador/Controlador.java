package com.uabc.edu.mx.examen.Controllador;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.uabc.edu.mx.examen.Modelo.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import java.util.ArrayList;
import java.util.List;

@Controller
public class Controlador {

    @GetMapping("/pacientes")
    public String List (Model modelo, @ModelAttribute Paciente paciente){
        //Medicos
        Medico medico1 = new Medico();
        Medico medico2 = new Medico();
        Medico medico3 = new Medico();
        Medico medico4 = new Medico();
        List<Medico> med = new ArrayList<Medico>();

        medico1.setNombre("Juan");
        medico1.setApellido("Perez Meza");
        medico1.setTipo("Dr.");
        medico2.setNombre("Daniel");
        medico2.setApellido("Lares Almanza");
        medico2.setTipo("Dr.");
        medico3.setNombre("Manuel");
        medico3.setApellido("Arvizú Iglesias");
        medico3.setTipo("Dr.");
        medico4.setNombre("Saúl");
        medico4.setApellido("Martínez García");
        medico4.setTipo("Dr.");

        //Dia
        Dia d1 = new Dia();
        Dia d2 = new Dia();
        Dia d3 = new Dia();
        Dia d4 = new Dia();
        Dia d5 = new Dia();
        Dia d6 = new Dia();
        Dia d7 = new Dia();
        Dia d8 = new Dia();
        Dia d9 = new Dia();
        Dia d10 = new Dia();
        Dia d11 = new Dia();
        Dia d12 = new Dia();
        Dia d13 = new Dia();
        Dia d14 = new Dia();
        Dia d15 = new Dia();
        Dia d16 = new Dia();
        Dia d17 = new Dia();
        Dia d18 = new Dia();
        Dia d19 = new Dia();
        Dia d20 = new Dia();
        Dia d21 = new Dia();
        Dia d22 = new Dia();
        Dia d23 = new Dia();
        Dia d24 = new Dia();
        Dia d25 = new Dia();
        Dia d26 = new Dia();
        Dia d27 = new Dia();
        Dia d28= new Dia();
        Dia d29 = new Dia();
        Dia d30 = new Dia();
        Dia d31 = new Dia();
        List<Dia> d = new ArrayList<Dia>();

        d1.setDia(1);
        d2.setDia(2);
        d3.setDia(3);
        d4.setDia(4);
        d5.setDia(5);
        d6.setDia(6);
        d7.setDia(7);
        d8.setDia(8);
        d9.setDia(9);
        d10.setDia(10);
        d11.setDia(11);
        d12.setDia(12);
        d13.setDia(13);
        d14.setDia(14);
        d15.setDia(15);
        d16.setDia(16);
        d17.setDia(17);
        d18.setDia(18);
        d19.setDia(19);
        d20.setDia(20);
        d21.setDia(21);
        d22.setDia(22);
        d23.setDia(23);
        d24.setDia(24);
        d25.setDia(25);
        d26.setDia(26);
        d27.setDia(27);
        d28.setDia(28);
        d29.setDia(29);
        d30.setDia(30);
        d31.setDia(31);

        //Mes
        Mes m1 = new Mes();
        Mes m2 = new Mes();
        Mes m3 = new Mes();
        Mes m4 = new Mes();
        Mes m5 = new Mes();
        Mes m6 = new Mes();
        Mes m7 = new Mes();
        Mes m8 = new Mes();
        Mes m9 = new Mes();
        Mes m10 = new Mes();
        Mes m11 = new Mes();
        Mes m12 = new Mes();
        List<Mes> m = new ArrayList<Mes>();

        m1.setMes("Enero");
        m2.setMes("Febrero");
        m3.setMes("Marzo");
        m4.setMes("Abril");
        m5.setMes("Mayo");
        m6.setMes("Junio");
        m7.setMes("Julio");
        m8.setMes("Agosto");
        m9.setMes("Septiembre");
        m10.setMes("Octubre");
        m11.setMes("Noviembre");
        m12.setMes("Diciembre");

        //Hora
        Hora h1 = new Hora();
        Hora h2 = new Hora();
        Hora h3 = new Hora();
        Hora h4 = new Hora();
        Hora h5 = new Hora();
        Hora h6 = new Hora();
        Hora h7 = new Hora();
        Hora h8 = new Hora();
        Hora h9 = new Hora();
        List<Hora> h = new ArrayList<Hora>();

        h1.setHora(9);
        h2.setHora(10);
        h3.setHora(11);
        h4.setHora(12);
        h5.setHora(13);
        h6.setHora(15);
        h7.setHora(16);
        h8.setHora(17);
        h9.setHora(18);

        //Cubiculos
        Cubiculo cub = new Cubiculo();
        Cubiculo cub2 = new Cubiculo();
        Cubiculo cub3 = new Cubiculo();
        List<Cubiculo> c = new ArrayList<Cubiculo>();

        cub.setCubo("A");
        cub.setCubo("B");
        cub.setCubo("C");


        return "paciente";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Paciente paciente, RedirectAttributes attributes, Model modelo) throws JsonProcessingException {
        attributes.addFlashAttribute("mensaje","Registro");
        String jsonMsg = null;
        System.out.println(paciente.toString());
        List <Paciente> listaPacientes = new ArrayList<Paciente>();
        ObjectMapper mapper = new ObjectMapper();
        jsonMsg = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(listaPacientes);
        return "paciente";
    }

}
