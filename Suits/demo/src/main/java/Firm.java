import java.util.ArrayList;
import java.time.LocalDate;

public class Firm {

  // Atributos:

  private String name;
  private LocalDate foundation;
  private ArrayList<Person> employees = new ArrayList<Person>();

  // Construtores:

  public Firm() {

  }

  public Firm(String name, LocalDate foundation) {
    this.name = name;
    this.foundation = foundation;
  }

  // Getters e setters:

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getFoundation() {
    return foundation;
  }

  public void setFoundation(LocalDate foundation) {
    this.foundation = foundation;
  }

  public ArrayList<Person> getEmployees() {
    return employees;
  }

  public void setEmployees(Person employee) {
    this.employees.add(employee);
  }

  // Métodos:

  public String listEmployees() {
    String r = "Empregados: ";
    if (employees.size() == 0)
      return r = "nenhum.";
    for (Person person : employees) {
      r += person.getName() + ",";
    }
    return r + ".";
  }

  public void info() {

  }
}
