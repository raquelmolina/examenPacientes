package com.uabc.edu.mx.examen.Modelo;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class Paciente {

    @NotBlank
    @Size (min = 2, max = 40)
    private String nombre;

    @NotBlank
    @Email
    private String correo;

    @NotBlank
    @Size (min = 5, max = 15)
    private String numero;

    private String medico;
    private int hora;
    private int dia;
    private String mes;
    private String c;

    @NotBlank
    @Size (min = 2, max = 40)
    private String motivo;
}
