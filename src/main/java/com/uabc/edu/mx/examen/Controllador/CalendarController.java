package com.uabc.edu.mx.examen.Controllador;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.uabc.edu.mx.examen.Modelo.Paciente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/calendario")
public class CalendarController {
    @GetMapping(value = "/all")
    public String getEvents() {
        String jsonMsg = null;
        try {
            List<Paciente> pacientes = new ArrayList<Paciente>();
            Paciente p = new Paciente();
            // FullCalendar
            ObjectMapper mapper = new ObjectMapper();
            jsonMsg =  mapper.writerWithDefaultPrettyPrinter().writeValueAsString(pacientes);
        } catch (IOException ioex) {
            System.out.println(ioex.getMessage());
        }
        return jsonMsg;
    }
}
