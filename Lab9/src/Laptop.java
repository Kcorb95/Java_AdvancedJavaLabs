/**
 * Created by Kevin Corbett on 11/4/15.
 */
public class Laptop extends Computer {
  private String charger;

  public Laptop() {
    super();
    charger = "";
  }

  public Laptop(double price, String brand, double discount, String charger) {
    super(price, brand, discount);
    this.charger = charger;
  }

  public String getCharger() {
    return charger;
  }

  public void setCharger(String charger) {
    this.charger = charger;
  }

  @Override
  public String toString() {
    return "Laptop: " + getBrand() +
            "\nPrice: " + getPrice() +
            "\nDiscount percent: " + getDiscount() +
            "\nDiscounted Price: " + getDiscountPrice() +
            "\nCharger Model: " + getCharger();
  }
}
