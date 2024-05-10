package com.doctor;

public class Cita {
    private String  id,
                    fechaHora,
                    motivo;

    private Doctor doctor;
    private Paciente paciente;

    public Cita(){}

    public Cita(String id, String fechaHora, String motivo, Doctor doctor, Paciente paciente) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.motivo = motivo;
        this.doctor = doctor;
        this.paciente = paciente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return  "Cita ID: " + getId() +
                "Fecha y Hora: " + getFechaHora() +
                "Motivo: " + getMotivo() +
                "Doctor: " + getDoctor().getNombre() +
                "Paciente: " + getPaciente().getNombre();
    }
}
