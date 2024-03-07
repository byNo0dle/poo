package com.ufostyle.poo.domain.entities;

public class Perro extends AnimalA{

  private String nombrePerro;
  private Double peso;
  private Double raza;
  private Double sexo;

  public Perro() {
  }

  public Perro(Integer animalId, String description, String nombrePerro, Double peso, Double raza,
               Double sexo) {
    super(animalId, description);
    this.nombrePerro = nombrePerro;
    this.peso = peso;
    this.raza = raza;
    this.sexo = sexo;
  }

  public String getNombrePerro() {
    return nombrePerro;
  }

  public void setNombrePerro(String nombrePerro) {
    this.nombrePerro = nombrePerro;
  }

  public Double getPeso() {
    return peso;
  }

  public void setPeso(Double peso) {
    this.peso = peso;
  }

  public Double getRaza() {
    return raza;
  }

  public void setRaza(Double raza) {
    this.raza = raza;
  }

  public Double getSexo() {
    return sexo;
  }

  public void setSexo(Double sexo) {
    this.sexo = sexo;
  }

  @Override
  public void hacerSonido() {
    System.out.println("Hola soy un perro: y ladro guau guauuuu");
  }
}
