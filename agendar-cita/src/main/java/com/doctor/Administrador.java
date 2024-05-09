package com.doctor;

import java.util.List;

public class Administrador extends Persona {
    private String contrasena;

    // Constructor
    public Administrador(String id, String nombre, String contrasena) {
        super(id, nombre);
        this.contrasena = contrasena;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    // Método para registrar un nuevo doctor
    public void darAltaDoctor(Doctor doctor, List<Doctor> listaDoctores) {
        listaDoctores.add(doctor);
    }

    // Método para registrar un nuevo paciente
    public void darAltaPaciente(Paciente paciente, List<Paciente> listaPacientes) {
        listaPacientes.add(paciente);
    }

    // Método para agendar una cita en el calendario
    public void agendarCita(Cita cita, Calendario calendario) {
        calendario.agregarCita(cita);
    }

    // Método para ver el calendario
    public void verCalendario(Calendario calendario) {
        for (Cita cita : calendario.getCitas()) {
            System.out.println("Cita ID: " + cita.getId());
            System.out.println("Fecha y Hora: " + cita.getFechaHora());
            System.out.println("Motivo: " + cita.getMotivo());
            System.out.println("Doctor: " + cita.getDoctor().getNombre());
            System.out.println("Paciente: " + cita.getPaciente().getNombre());
            System.out.println("-----------------------");
        }
    }
}
