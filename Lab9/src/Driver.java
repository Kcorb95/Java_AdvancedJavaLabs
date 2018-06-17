/**
 * Created by Kevin Corbett on 11/4/15.
 */
public class Driver {
  public static void main(String[] args) {
    Computer computer = new Computer(399.99, "DELL", 0.15);
    System.out.println("Discounted price: " + computer.getDiscountPrice());

    System.out.println();
    Laptop laptop = new Laptop(1000.00, "Thinkpad", 0.05, "lame");
    laptop.setCharger("Good");
    System.out.println(laptop);
    System.out.println();
    Desktop desktop = new Desktop(2500.00, "HP", 0.50, "Asus", "Logitech", "Corsair");
    desktop.setBrand("Custom");
    System.out.println(desktop);

    Desktop desktop1 = new Desktop(1000.00, "Custom Built", 0.25, "Acer", "Razer", "Razer");
    Laptop laptop1 = new Laptop(500.00, "Macbook", 0.15, "Mac Charger");
    System.out.println();
    System.out.println("The computer you want to buy: \n" + desktop1);
    System.out.println();
    System.out.println("The computer you want to trade in: \n" + laptop1);
    System.out.println();
    System.out.println("By trading in " + laptop1.getBrand() + ", " + desktop1.getBrand() + " will cost: " + desktop1.getDiscountPrice(laptop1));
  }
}
