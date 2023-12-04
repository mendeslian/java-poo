import interfaces.Partner;

public abstract class NamePartner implements Partner {

  @Override
  public void decisionMaking() {
    System.out.println("decision Making");
  }

  @Override
  public void profitRevenue() {
    System.out.println("profit Revenue");
  }

}
