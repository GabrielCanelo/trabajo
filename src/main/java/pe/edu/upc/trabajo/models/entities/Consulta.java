package pe.edu.upc.trabajo.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Consultas")
public class Consulta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "consulta_id")
	private Integer id;
	@Column(name = "consulta_receta", length = 30)
	private String receta;
	
	@OneToOne()
	@JoinColumn(name = "cita_id")
	private Cita cita;
	@OneToOne()
	@JoinColumn(name = "veterinario_id")
	private Veterinario veterinario;
	@OneToOne()
	@JoinColumn(name = "mascota_id")
	private Mascota mascota;
}
