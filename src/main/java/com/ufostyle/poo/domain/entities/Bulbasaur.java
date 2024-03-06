package com.ufostyle.poo.domain.entities;

import com.ufostyle.poo.domain.repositories.PlantaRepository;

public class Bulbasaur extends Pokemon implements PlantaRepository {

  public Bulbasaur() {
  }

  @Override
  protected void atacarPlacaje() {
    System.out.println("Hola soy Bulbasaur y este es mi ataque placaje");
  }

  @Override
  public void atacarAraniazo() {
    System.out.println("Hola soy Bulbasaur y este es mi ataque araniazo");
  }

  @Override
  protected void atacarMordisco() {
    System.out.println("Hola soy Bulbasaur y este en mi ataque mordisco");
  }

  @Override
  public void atacarDrenaje() {
    System.out.println("Hola soy Bulbasaur y este es mi ataque drenaje");
  }

  @Override
  public void atacarParalizar() {
    System.out.println("Hola soy Bulbasaur y este es mi ataque paralizar");
  }
}
