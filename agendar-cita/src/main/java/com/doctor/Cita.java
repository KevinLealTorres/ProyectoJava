package com.doctor;
import java.util.Date;

public class Cita {
    private String id;
    private Date fechaHora;
    private String motivo;
    private Doctor doctor;
    private Paciente paciente;

    public Cita(String id,
                Date fechaHora,
                String motivo,
                Doctor doctor,
                Paciente paciente
                    ) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.motivo = motivo;
        this.doctor = doctor;
        this.paciente = paciente;
    }
}