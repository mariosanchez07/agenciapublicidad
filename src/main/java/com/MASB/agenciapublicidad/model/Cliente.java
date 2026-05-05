package com.MASB.agenciapublicidad.model;

import jakarta.persistence.*;

@Entity // esto le dice hibernate que esta clase es una tabla
@Table(name = "clientes") // el nombre de la tabla
public class Cliente {

	@Id 
	@GeneratedValue( strategy = GenerationType.IDENTITY) //id + generatedvalue es la clave primaria autoincremental
	private long id;
	
	private String nombreEmpresa;
	private String sector;
	private String cif;
	private String email;
	
	//constructor vacio para el JPA
	public Cliente() {
		super();
	}

	public Cliente(String nombreEmpresa, String sector, String cif, String email) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.sector = sector;
		this.cif = cif;
		this.email = email;
	}

	public long getId() { return id; }
	public void setId(long id) { this.id = id; }

	public String getNombreEmpresa() { return nombreEmpresa; }
    public void setNombreEmpresa(String nombreEmpresa) { this.nombreEmpresa = nombreEmpresa; }

	public String getSector() { return sector; }
	public void setSector(String sector) { this.sector = sector; }

	public String getCif() { return cif; }
	public void setCif(String cif) { this.cif = cif; }

	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombreEmpresa=" + nombreEmpresa + ", sector=" + sector + ", cif=" + cif
				+ ", email=" + email + "]";
	}
	
	
	
}
