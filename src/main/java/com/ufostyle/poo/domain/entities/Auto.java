package com.ufostyle.poo.domain.entities;

import java.util.List;

public class Auto {

  private Long autoId;
  private String marca;
  private String modelo;

  /**
   * Esto es una relación de uno a muchos.
   */
  private List<Propietario> listaPropietario;

  /**
   * Esto es una relacion de uno a uno.
   */
  //private Propietario propietario;

  public Auto() {
  }

  /*public Auto(Long autoId, String marca, String modelo) {
    this.autoId = autoId;
    this.marca = marca;
    this.modelo = modelo;
  }*/

  /*
  /**
   * Esto es una relacion de uno a uno.
   * @param autoId
   * @param marca
   * @param modelo
   * @param propietario
   */
  /*public Auto(Long autoId, String marca, String modelo, Propietario propietario) {
    this.autoId = autoId;
    this.marca = marca;
    this.modelo = modelo;
    this.propietario = propietario;
  }*/

  /*
  /**
   * Esto es una relación de uno a muchos.
   * @param autoId
   * @param marca
   * @param modelo
   * @param listaPropietario
   */
  /*public Auto(Long autoId, String marca, String modelo, List<Propietario> listaPropietario) {
    this.autoId = autoId;
    this.marca = marca;
    this.modelo = modelo;
    this.listaPropietario = listaPropietario;
  }*/

  public Long getAutoId() {
    return autoId;
  }

  public void setAutoId(Long autoId) {
    this.autoId = autoId;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  /**
   * Esto es una relacion de uno a uno.
   * @return
   */
  /*public Propietario getPropietario() {
    return propietario;
  }

  public void setPropietario(Propietario propietario) {
    this.propietario = propietario;
  }*/

  /**
   * Esto es una relación de uno a muchos.
   * @return
   */
  public List<Propietario> getListaPropietario() {
    return listaPropietario;
  }

  public void setListaPropietario(List<Propietario> listaPropietario) {
    this.listaPropietario = listaPropietario;
  }

  @Override
  public String toString() {
    return "Auto{" +
        "autoId=" + autoId +
        ", marca='" + marca + '\'' +
        ", modelo='" + modelo + '\'' +
        ", listaPropietario=" + listaPropietario +
        '}';
  }
}
