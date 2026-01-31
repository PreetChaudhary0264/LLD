package structuralPatterns.Composite.Problem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Standalone Products
        Product phone = new Product("iphone",50000);
        Product charger = new Product("iphoneCharger",20000);
        Product buds = new Product("iphoneEarbuds",10000);

        //iphone Bundle
        ProductBundle iphoneBundle = new ProductBundle("iphoneBundle");
        iphoneBundle.addProduct(phone);
        iphoneBundle.addProduct(charger);
        iphoneBundle.addProduct(buds);

        Product book = new Product("Blackbox",1000);

        List<Object> cart = new ArrayList<>();
        cart.add(book);
        cart.add(iphoneBundle);

        int total = 0;
        for(Object item : cart){
            if(item instanceof Product){
                Product bundle = (Product) item;
                total += bundle.getPrice();
            }else{
                ProductBundle bundle = (ProductBundle) item;
                total += bundle.getPrice();
            }
        }

        //client should not do all these things
        System.out.println("Total price of cart is " + total);
    }
}
