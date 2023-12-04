import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {

    // Instanciando a Pessoa Harvey Specter
    Person p1 = new Person();
    p1.setName("Harvey");
    p1.setSurname("Spectter");
    p1.setGender("Masculino");

    // Instanciando a Pessoa Louis Litt
    Person p2 = new Person("Louis", "Litt", "Masculino");

    // Instanciando a Pessoa Donna Paulsen
    Person p3 = new Person("Donna", "Paulsen", "Feminino");

    // Crie as Firmas de advocacia (Law) Rand, Kaldor & Zane e Pearson-Specter-Litt

    Law l1 = new Law("Rand, Kaldor & Zane", LocalDate.now(), "IQ1", "GA1");
    Law l2 = new Law("Pearson-Specter-Litt", LocalDate.now(), "IQ2", "GA2");

    // Cria a Firma de tecnologia (Tech) Velocity Data Solutions.

    Tech t1 = new Tech("Velocity Data Solutions.", LocalDate.now(), "ND", "123");

    // Crie uma Pessoa chamada Mike Ross e Robert Zane.
    Person p4 = new Person("Mike", "Ross");
    Person p5 = new Person("Robert", "Zane");

    // Faça com que uma firma possa ter vários empregados Persons:
    // Adicione Harvey Specter, Louis Litt e Donna Paulsen a firma
    // Pearson-Specter-Litt
    l2.setEmployees(p1);
    l2.setEmployees(p2);
    l2.setEmployees(p3);

    // Adicione Robert Zane a firma Rand, Kaldor & Zane
    l1.setEmployees(p5);

    // Adicione Mike Ross a firma Velocity Data Solutions
    t1.setEmployees(p4);

    // Sobrecarregando o método info para as Classe Law e Tech de forma que este
    // exiba todos os dados (próprios e herdados) no console.
    l1.info();
    l2.info();
    t1.info();

    // Faça com que cada Person tenha uma posição e que essa posição seja genérica
    // independente do seu tipo

  }
}
