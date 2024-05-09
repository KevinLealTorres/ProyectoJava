package com.doctor;
public class Doctor extends Persona {
		private Especialidades especialidad;
		private Cita[] citas;

		public Doctor(String id, String nombre, Especialidades especialidad) {
				super(id, nombre);
				this.especialidad = especialidad;
		}
}
