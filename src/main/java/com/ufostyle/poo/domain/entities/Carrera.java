package com.ufostyle.poo.domain.entities;

import jakarta.persistence.*;

import java.util.LinkedList;

@Entity
public class Carrera {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long carreraId;
  private String nombre;
  @OneToMany(mappedBy = "carrera")
  private LinkedList<Materia> listaMateria;

  public Carrera() {
  }

  public Carrera(Long carreraId, String nombre, LinkedList<Materia> listaMateria) {
    this.carreraId = carreraId;
    this.nombre = nombre;
    this.listaMateria = listaMateria;
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

  public LinkedList<Materia> getListaMateria() {
    return listaMateria;
  }

  public void setListaMateria(LinkedList<Materia> listaMateria) {
    this.listaMateria = listaMateria;
  }
}
