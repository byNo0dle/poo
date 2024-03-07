package com.ufostyle.poo.domain.entities;

public abstract class AnimalA {

  private Integer animalId;
  private String description;

  public AnimalA() {
  }

  public AnimalA(Integer animalId, String description) {
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

  // Otros métodos
  public abstract void hacerSonido();
}
