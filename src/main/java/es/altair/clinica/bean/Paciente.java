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
	
	
	// mappedBy la referencia es el Objeto Paciente, creado en la clase Cita //
	@OneToMany(mappedBy="paciente", cascade=CascadeType.ALL, fetch = FetchType.LAZY) 
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


	
	
	public Paciente(int idPaciente, String nombre, String dni, String telefono) {
		super();
		this.idPaciente = idPaciente;
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
	}


	public int getIdPaciente() {
		return idPaciente;
	}


	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public Set<Cita> getCitas() {
		return citas;
	}



	public void setCitas(Set<Cita> citas) {
		this.citas = citas;
	}



	@Override
	public String toString() {
		return "Paciente [idPaciente=" + idPaciente + ", nombre=" + nombre + ", dni=" + dni + ", telefono=" + telefono
				+ ", citas=" + citas + "]";
	}
	 
	 
}
