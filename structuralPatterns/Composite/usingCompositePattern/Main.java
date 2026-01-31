package structuralPatterns.Composite.usingCompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //standalone products
        CartItem phone = new Product("iphone",50000);
        CartItem charger = new Product("iphoneCharger",20000);
        CartItem buds = new Product("iphoneEarbuds",10000);

        //iphone Bundle
        ProductBundle iphoneBundle = new ProductBundle("iphoneBundle");
        iphoneBundle.addProduct(phone);
        iphoneBundle.addProduct(charger);
        iphoneBundle.addProduct(buds);

        CartItem book = new Product("Blackbox",1000);

        List<CartItem> cart = new ArrayList<>();
        cart.add(book);
        cart.add(iphoneBundle);

        int total = 0;
        for(CartItem item : cart){
            total += item.getPrice();
        }

        //client should not do all these things
        System.out.println("Total price of cart is " + total);
    }
}
