import java.util.ArrayList;

import interfaces.Force;

public class Jedi implements Force {
  private String nome;
  private String titulo;
  private ArrayList<Weapon> weapons;

  public Jedi() {
    this.weapons = new ArrayList<Weapon>();
  }

  public Jedi(String nome, String titulo) {
    this.nome = nome;
    this.titulo = titulo;
    this.weapons = new ArrayList<Weapon>();
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public ArrayList<Weapon> getWeapons() {
    return weapons;
  }

  public void setWeapons(ArrayList<Weapon> weapons) {
    this.weapons = weapons;
  }

  public void patience() {

  }

  @Override
  public void farseeing() {
    System.out.println("[JEDI]: Farseeing An Enemy");
  }

  @Override
  public void mindControl() {
    System.out.println("[JEDI]: Using The Force to Mind Control");
  }

  @Override
  public void telepath() {
    System.out.println("[JEDI]: Talking Using Telepath");
  }

  @Override
  public void levitation() {
    System.out.println("[JEDI]: Levitating Something");
  }

}
