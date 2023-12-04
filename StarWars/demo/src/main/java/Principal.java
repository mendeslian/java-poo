import java.util.ArrayList;

public class Principal {
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa();

    p1.setNome("Leia");
    p1.setSobrenome("Organa");
    p1.setSexo("Feminino");

    Pessoa p2 = new Pessoa("Luke", "Skywalker", "Masculino");

    // Jedi obiwan = new Jedi();
    // obiwan.setNome("Obi-Wan Kenobi");
    // obiwan.mindControl(); // Deve imprimir "Using The Force to Mind Control"

    // Sith vader = new Sith();
    // vader.setNome("Darth Vader");
    // vader.levitation(); // Deve imprimir "Levitating Something"

    // Saber sabre1 = new Saber("Um sabre de luz azul", 0);
    // Saber sabre2 = new Saber("Um sabre de luz vermelho", 0);
    // Blast blast = new Blast("Um blast laser", 0);

    // vader.getWeapons().add(sabre2.pickUp());
    // obiwan.getWeapons().add(sabre1.pickUp());
    // obiwan.getWeapons().add(blast.pickUp());

    Sith vader = new Sith();
    vader.setNome("Darth Vader");
    vader.levitation(); // Deve imprimir "Levitating Something"

    Saber sabre1 = new Saber("Um sabre de luz azul", 0);

    Saber sabre2 = new Saber("Um sabre de luz vermelho", 0);
    vader.getWeapons().add(sabre2.pickUp());

    Jedi obiwan = new Jedi();
    obiwan.setNome("Obi-Wan Kenobi");
    obiwan.mindControl(); // Deve imprimir "Using The Force to Mind Control"

    Blast blast = new Blast("Um blast laser", 0);
    obiwan.getWeapons().add(blast.pickUp());
    obiwan.getWeapons().add(sabre1.pickUp());

    // Invocando os métodos
    if (vader.getWeapons().get(0) instanceof Saber) {
      ((Saber) vader.getWeapons().get(0)).slash();
    }

    if (obiwan.getWeapons().get(0) instanceof Blast) {
      ((Blast) obiwan.getWeapons().get(0)).shot();
    }

    if (obiwan.getWeapons().get(0) instanceof Blast) {
      ((Blast) obiwan.getWeapons().get(0)).drop();
    }

    System.out.println(obiwan.getWeapons().get(0));
    System.out.println(vader.getWeapons().get(0));

    System.out.println("Armas de Darth Vadder:");
    listarArmas(vader.getWeapons());

    System.out.println("Armas de Obi-Wan Kenobi:");
    listarArmas(obiwan.getWeapons());

  }

  private static void listarArmas(ArrayList<Weapon> weapons) {
    for (Weapon weapon : weapons) {
      System.out.println(" - " + weapon.getDescricao());
    }
  }

}
