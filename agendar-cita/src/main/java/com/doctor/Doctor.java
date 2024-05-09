package com.doctor;

public class Doctor extends Persona {
	private Especialidades especialidad;

	// Constructor, getters y setters
	public Doctor(String id, String nombre, Especialidades especialidad) {
		super(id, nombre);
		this.especialidad = especialidad;
	}

	public Especialidades getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidades especialidad) {
		this.especialidad = especialidad;
	}
}
