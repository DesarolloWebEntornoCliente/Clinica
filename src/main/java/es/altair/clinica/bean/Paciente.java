package es.altair.clinica.bean;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pacientes")
public class Paciente implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPaciente;
	private String nombre;
	private String dni;
	private String telefono;
	
	 @OneToMany(mappedBy="equipo", cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Cita> citas;

	 
	 
	public Paciente() {
		super();
	}



	public Paciente(String nombre, String dni, String telefono) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
	}
	 
	 
}
