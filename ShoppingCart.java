/**
 * This class will be our shopping cart that will store an ArrayList of items and quantities and provide functionality
 * for populating, removing and purchasing items.
 */

import java.util.ArrayList;
import java.util.Scanner;
public class ShoppingCart {
    ArrayList<CartContents> activeCart = new ArrayList<>();
    ShoppingCart(){
        // Print catalog
    }

    public void addItem(String itemName, int quantity, double price){
        activeCart.add(new CartContents(itemName, quantity, price));
    }

    public void printCartContents(){
        // This might work
        for(CartContents cartContents: activeCart){
            System.out.println(activeCart);
        }
    }

    public void placeOrder(){
        System.out.print("Would you prefer delivery for a small fee of $3.00 USD or free pickup? (delivery/pickup): ");
        Scanner keyboard = new Scanner(System.in);
        String shippingMethod = keyboard.nextLine();
        if (shippingMethod.equals("delivery")){
            int index = 0;
            double sum = 3.00;
            for(CartContents cartContents: activeCart){
                sum += cartContents.getPrice() * cartContents.getQuantity();
            }
        }
        else if (shippingMethod.equals("pickup")){
            int index = 0;
            double sum = 0.00;
            for(CartContents cartContents: activeCart){
                sum += cartContents.getPrice() * cartContents.getQuantity();
            }

        }
        else{
            placeOrder();
        }
    }
}
