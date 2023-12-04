import interfaces.Lawyer;

public abstract class Attorney implements Lawyer {

  // Atributos

  private int legalNumber;

  // Getters and setters

  public int getLegalNumber() {
    return legalNumber;
  }

  public void setLegalNumber(int legalNumber) {
    this.legalNumber = legalNumber;
  }

  // Sobrecarga dos métodos de Lawyer

  @Override
  public void representClients() {
    System.out.println("represent x");
  }

  @Override
  public void research() {
    System.out.println("research x");
  }

  @Override
  public void analysis(String doc) {
    System.out.println("analysing " + doc);
  }

  @Override
  public void fileDocument(String type) {
    System.out.println("file Document is" + type);
  }

}
