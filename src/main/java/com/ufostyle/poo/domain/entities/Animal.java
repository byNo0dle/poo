package com.ufostyle.poo.domain.entities;

public class Animal {

  private Integer animalId;
  private String description;

  public Animal() {
  }

  public Animal(Integer animalId, String description) {
    this.animalId = animalId;
    this.description = description;
  }

  public Integer getAnimalId() {
    return animalId;
  }

  public void setAnimalId(Integer animalId) {
    this.animalId = animalId;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  // Sobre carga de métodos.
  public void hacerSonido() {
    System.out.println("El animal hace un sonido");
  }

  public void hacerSonido(String nombreAnimal) {
    System.out.println("El animal" + nombreAnimal+ "hace un sonido");
  }

  public void hacerSonido(String nombreAnimal, String tipoSonido) {
    System.out.println("El animal" + nombreAnimal+ "hace un sonido de tipo" + tipoSonido);
  }
}
