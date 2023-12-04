import java.util.ArrayList;

import interfaces.Force;

public class Sith implements Force {
  private String nome;
  private String titulo;
  private ArrayList<Weapon> weapons;

  public Sith() {
    super();
    this.weapons = new ArrayList<Weapon>();
  }

  public Sith(String nome, String titulo) {
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

  @Override
  public void farseeing() {
    System.out.println("[SITH]: Farseeing An Enemy");
  }

  @Override
  public void mindControl() {
    System.out.println("[SITH]: Using The Force to Mind Control");
  }

  @Override
  public void telepath() {
    System.out.println("[SITH]: Talking Using Telepath");
  }

  @Override
  public void levitation() {
    System.out.println("[SITH]: Levitating Something");
  }

  public void lightning() {

  }

}
