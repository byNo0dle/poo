package com.ufostyle.poo.domain.entities;

public abstract class Pokemon {

  protected Integer numPokedex;
  protected String nombre;
  protected Double peso;
  protected String sexo;
  protected Integer temporada;

  protected abstract void atacarPlacaje();
  public abstract void atacarAraniazo();
  protected abstract void atacarMordisco();
}
