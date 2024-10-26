package pe.edu.cibertec.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "sector")
public class Sector {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idsector")
	private Integer id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "idsectorsuperior")
	private int idsectorsuperior;
	
	
	
	
	public int getIdsectorsuperior() {
		return idsectorsuperior;
	}

	public void setIdsectorsuperior(int idsectorsuperior) {
		this.idsectorsuperior = idsectorsuperior;
	}

	public Sector(Integer id) {
		this.id = id;
	}

	public Sector() {
	}
	public Sector(Integer id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@JsonIgnore
	@OneToMany(mappedBy = "sector")
	private List<Usuario> listaUsuario;

}
