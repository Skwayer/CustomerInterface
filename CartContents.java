/**
 * CartContents class functions as a way to create tuples for populating Customer Shopping Cart
 * @param itemName represents the name of item in cart
 * @param quantity stores the amount of associated item in cart
 */
public class CartContents {
    private String itemName;
    private int quantity;
    private double price;

    public CartContents(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cart Contents{" + "Item Name: " + itemName + ", Quantity: " + quantity + '}';
    }
}
