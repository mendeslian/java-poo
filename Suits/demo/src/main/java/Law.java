import java.time.LocalDate;

public class Law extends Firm {

  // Atributos:

  private String insuranceQuote;
  private String govApprovement;

  // Construtores:

  public Law() {

  }

  public Law(String name, LocalDate foundation, String insuranceQuote, String govApprovement) {
    super(name, foundation);
    this.insuranceQuote = insuranceQuote;
    this.govApprovement = govApprovement;
  }

  // Getters e setters:

  public String getInsuranceQuote() {
    return insuranceQuote;
  }

  public void setInsuranceQuote(String insuranceQuote) {
    this.insuranceQuote = insuranceQuote;
  }

  public String getGovApprovement() {
    return govApprovement;
  }

  public void setGovApprovement(String govApprovement) {
    this.govApprovement = govApprovement;
  }

  // Metódos:

  public void info() {
    System.out.println("Nome da firma: " + this.getName());
    System.out.println("Nome da fundação: " + this.getFoundation());
    System.out.println("Cotação de Seguro: " + this.getInsuranceQuote());
    System.out.println("Aprovação do governo: " + this.getGovApprovement());
  }
}
