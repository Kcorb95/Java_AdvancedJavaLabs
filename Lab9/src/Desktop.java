/**
 * Created by Kevin Corbett on 11/4/15.
 */
public class Desktop extends Computer {
  private String monitor, mouse, keyboard;

  public Desktop() {
    super();
    monitor = "";
    mouse = "";
    keyboard = "";
  }

  public Desktop(double price, String brand, double discount, String monitor, String mouse, String keyboard) {
    super(price, brand, discount);
    this.monitor = monitor;
    this.mouse = mouse;
    this.keyboard = keyboard;
  }

  public String getMonitor() {
    return monitor;
  }

  public void setMonitor(String monitor) {
    this.monitor = monitor;
  }

  public String getMouse() {
    return mouse;
  }

  public void setMouse(String mouse) {
    this.mouse = mouse;
  }

  public String getKeyboard() {
    return keyboard;
  }

  public void setKeyboard(String keyboard) {
    this.keyboard = keyboard;
  }

  @Override
  public String toString() {
    return "Desktop: " + getBrand() +
            "\nPrice: " + getPrice() +
            "\nDiscount percent: " + getDiscount() +
            "\nDiscounted Price: " + getDiscountPrice() +
            "\nMonitor Model: " + getMonitor() +
            "\nKeyboard Model: " + getKeyboard() +
            "\nMouse Model: " + getMouse();
  }
}
