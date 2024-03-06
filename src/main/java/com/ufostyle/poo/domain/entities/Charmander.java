package com.ufostyle.poo.domain.entities;

import com.ufostyle.poo.domain.repositories.FuegoRepository;

public class Charmander extends Pokemon implements FuegoRepository {

  public Charmander() {
  }

  @Override
  protected void atacarPlacaje() {
    System.out.println("Hola soy Charmander y este es mi ataque placaje");
  }

  @Override
  public void atacarAraniazo() {
    System.out.println("Hola soy Charmander y este es mi ataque araniazo");
  }

  @Override
  protected void atacarMordisco() {
    System.out.println("Hola soy Charmander y este es mi ataque mordisco");
  }

  @Override
  public void atacarPunioFuego() {
    System.out.println("Hola soy Charmander y este es mi ataque puño de fuego");
  }

  @Override
  public void atacarLanzaLlamas() {
    System.out.println("Hola soy Charmander y este es mi ataque lanza llamas");
  }

  @Override
  public void atacarAscuas() {
    System.out.println("Hola soy Charmander y este es mi ataque ascuas");
  }
}
