package com.ufostyle.poo.domain.entities;

import jakarta.persistence.*;

@Entity
public class Materia {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long materiaId;
  private String nombre;
  private String tipo;
  @ManyToOne
  private Carrera carrera;

  public Materia() {
  }

  public Materia(Long materiaId, String nombre, String tipo, Carrera carrera) {
    this.materiaId = materiaId;
    this.nombre = nombre;
    this.tipo = tipo;
    this.carrera = carrera;
  }

  public Long getMateriaId() {
    return materiaId;
  }

  public void setMateriaId(Long materiaId) {
    this.materiaId = materiaId;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public Carrera getCarrera() {
    return carrera;
  }

  public void setCarrera(Carrera carrera) {
    this.carrera = carrera;
  }
}
