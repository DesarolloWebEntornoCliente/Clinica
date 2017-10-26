package es.altair.clinica.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.Timer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="citas")
public class Cita implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Date fecha;
	private Timer hora;
	private String motivo;
	
}
