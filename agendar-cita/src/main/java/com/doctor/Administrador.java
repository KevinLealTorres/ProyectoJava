package com.doctor;

import java.util.List;

public class Administrador extends Persona {
    private String contrasena;

    /**
     * Constructor único
     * @param contrasena la contraseña del nuevo administrador
     * @param id identificador unico e irrepetible para cada admin
     * @param nombre el nombre de la persona que será administradora
     * */
    public Administrador(String id, String nombre, String contrasena) {
        super(id, nombre);
        this.contrasena = contrasena;
    }

    public Administrador(){}

    /**
     * Añade un doctor a la lista de doctores
     * @param doctor el nuevo doctor a añadir
     * @param listaDoctores la lista a agregar
     * */
    public void darAltaDoctor(Doctor doctor, List<Doctor> listaDoctores) {
        listaDoctores.add(doctor);
    }

    /**
     * Añade un paciente a la lista
     * @param paciente el nuevo paciente
     * @param listaPacientes la lista de pacientes
     * */
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
            System.out.println(cita.toString());
            System.out.println("-----------------------");
        }
    }

    public String getContrasena() { return contrasena; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }

    @Override
    public String toString() {
        return """
                Administrador: %s
                Id: %s
                """.formatted(getNombre(), getId());
    }
}
