/**
 * Created by Kevin Corbett on 11/4/15.
 */
public class Computer {
  private double price;
  private String brand;
  private double discount;

  public Computer() {
    price = 0.0;
    brand = "";
    discount = 0.0;
  }

  public Computer(double price, String brand, double discount) {
    this.price = price;
    this.brand = brand;
    this.discount = discount;
  }

  public double getPrice() {
    return price;
  }

  public String getBrand() {
    return brand;
  }

  public double getDiscount() {
    return discount;
  }

  public double getDiscountPrice() {
    return price - price * discount;
  }

  public double getDiscountPrice(Computer computer) {
    return price - computer.getPrice();
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void setDiscount(double discount) {
    this.discount = discount;
  }
}
