package com.doctor;
public class Paciente extends Persona {
		private Cita cita;

		public Paciente(String id, String nombre) {
			super(id, nombre);
		}

	public Cita getCita() { return cita; }
	public void setCita(Cita cita) { this.cita = cita; }
}
