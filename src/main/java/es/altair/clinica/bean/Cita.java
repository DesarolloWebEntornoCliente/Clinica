package es.altair.clinica.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.Timer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="citas")
public class Cita implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Date fecha;
	private String hora;
	private String motivo;
	
	@ManyToOne
	@JoinColumn(name="idPaciente")
	private Paciente paciente;

	public Cita() {
		super();
	}

	public Cita(Date fecha, String hora, String motivo, Paciente paciente) {
		super();
		this.fecha = fecha;
		this.hora = hora;
		this.motivo = motivo;
		this.paciente = paciente;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	@Override
	public String toString() {
		return "Cita [fecha=" + fecha + ", hora=" + hora + ", motivo=" + motivo + ", paciente=" + paciente + "]";
	} 
	
	
	
}
