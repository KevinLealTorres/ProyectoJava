public class Calendario {
	public Calendario(Cita... citas) {
		//logica
	}

	public void eliminarCita(String id) {
			//logica 
	}

	public void exportarAJSON() {
			//logica 
	}

	public class Cita {
			private String id;
			private Datetime fechaHora;
		    private String motivo;
			private Doctor doctor;
			private Paciente paciente;

			public Cita(String id,
						Datetime fechaHora,
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
}
