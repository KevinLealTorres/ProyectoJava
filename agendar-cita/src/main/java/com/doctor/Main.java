package com.doctor;

public class Main {
    private static final String ARCHIVO_JSON = "src/main/java/com/doctor/db/calendario.json";

    public static void main(String[] args) {
        Calendario calendario = Calendario.cargarDesdeJSON(ARCHIVO_JSON);

        Doctor doctor = new Doctor("1", "Dr. Smith", Especialidades.GENERAL);
        Paciente paciente = new Paciente("2", "kevin");

        Cita cita = new Cita("3", "2023-06-09T10:00", "Consulta de rompedur de algo", doctor, paciente);
        calendario.agregarCita(cita);
        calendario.exportarAJSON(ARCHIVO_JSON);
    }
}
