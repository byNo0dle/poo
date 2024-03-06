package com.ufostyle.poo.domain.entities;

import com.ufostyle.poo.domain.repositories.AguaRepository;

public class Squirtle extends Pokemon implements AguaRepository {

  public Squirtle() {
  }

  @Override
  protected void atacarPlacaje() {
    System.out.println("Hola soy Squirtle y este es mi ataque placaje");
  }

  @Override
  public void atacarAraniazo() {
    System.out.println("Hola soy Squirtle y este es mi ataque araniazo");
  }

  @Override
  protected void atacarMordisco() {
    System.out.println("Hola soy Squirtle y este es mi ataque mordisco");
  }

  @Override
  public void atacarHidrobomba() {
    System.out.println("Hola soy Squirtle y este es mi ataque hidrobomba");
  }

  @Override
  public void atacarBurbuja() {
    System.out.println("Hola soy Squirtle y este es mi ataque burbuja");
  }

  @Override
  public void atacarPistolaAgua() {
    System.out.println("Hola soy Squirtle y este es mi ataque pistola de agua");
  }
}
