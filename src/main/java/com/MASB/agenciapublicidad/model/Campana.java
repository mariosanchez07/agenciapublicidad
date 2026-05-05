package com.MASB.agenciapublicidad.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "campanas")
public class Campana {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreCampana;
    private Double presupuesto;
    private LocalDate fechaInicio;
    private String canal; 

    // Constructor vacío
    public Campana() {}

    public Campana(String nombreCampana, Double presupuesto, LocalDate fechaInicio, String canal) {
		super();
		this.nombreCampana = nombreCampana;
		this.presupuesto = presupuesto;
		this.fechaInicio = fechaInicio;
		this.canal = canal;
	}

	// Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombreCampana() { return nombreCampana; }
    public void setNombreCampana(String nombreCampana) { this.nombreCampana = nombreCampana; }

    public Double getPresupuesto() { return presupuesto; }
    public void setPresupuesto(Double presupuesto) { this.presupuesto = presupuesto; }

    public LocalDate getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(LocalDate fechaInicio) { this.fechaInicio = fechaInicio; }

    public String getCanal() { return canal; }
    public void setCanal(String canal) { this.canal = canal; }

	@Override
	public String toString() {
		return "Campana [id=" + id + ", nombreCampana=" + nombreCampana + ", presupuesto=" + presupuesto
				+ ", fechaInicio=" + fechaInicio + ", canal=" + canal + "]";
	}
    
    
}