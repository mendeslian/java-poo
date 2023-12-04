import java.time.LocalDate;

public class Tech extends Firm {

  // Atributos:

  private String nonDisclosure;
  private String ipAddress;

  // Construtores:

  public Tech() {

  }

  public Tech(String name, LocalDate foundation, String nonDisclosure, String ipAddress) {
    super(name, foundation);
    this.nonDisclosure = nonDisclosure;
    this.ipAddress = ipAddress;
  }

  // Getters e setters:

  public String getNonDisclosure() {
    return nonDisclosure;
  }

  public void setNonDisclosure(String nonDisclosure) {
    this.nonDisclosure = nonDisclosure;
  }

  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  // Metódos:

  public void info() {
    System.out.println("Nome da firma: " + this.getName());
    System.out.println("Nome da fundação: " + this.getFoundation());
    System.out.println("Não divulgação: " + this.getNonDisclosure());
    System.out.println("Endereço de Ip: " + this.getIpAddress());
  }
}
