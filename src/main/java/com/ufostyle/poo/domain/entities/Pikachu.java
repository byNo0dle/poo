package com.ufostyle.poo.domain.entities;

import com.ufostyle.poo.domain.repositories.ElectricoRepository;

public class Pikachu extends Pokemon implements ElectricoRepository {

  public Pikachu() {
  }

  @Override
  protected void atacarPlacaje() {
    System.out.println("Hola soy Pikachu y este es mi ataque placaje");
  }

  @Override
  public void atacarAraniazo() {
    System.out.println("Hola soy Pikachu y este es mi ataque araniazo");
  }

  @Override
  protected void atacarMordisco() {
    System.out.println("Hola soy Pikachu y este es mi ataque mordisco");
  }

  @Override
  public void atacarImpactrueno() {
    System.out.println("Hola soy Pikachu y este es mi ataque impactrueno");
  }

  @Override
  public void atacarPunioTrueno() {
    System.out.println("Hola soy Pikachu y este es mi ataque puño de trueno");
  }
}
