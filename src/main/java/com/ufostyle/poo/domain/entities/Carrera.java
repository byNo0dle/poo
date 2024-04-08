package com.ufostyle.poo.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Carrera {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long carreraId;
  private String nombre;

  public Carrera() {
  }

  public Carrera(Long carreraId, String nombre) {
    this.carreraId = carreraId;
    this.nombre = nombre;
  }

  public Long getCarreraId() {
    return carreraId;
  }

  public void setCarreraId(Long carreraId) {
    this.carreraId = carreraId;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
}
