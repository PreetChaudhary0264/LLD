package structuralPatterns.Composite.usingCompositePattern;

import java.util.ArrayList;
import java.util.List;

public class ProductBundle implements CartItem {
    private String name;
    private List<CartItem> items = new ArrayList<>();

    public ProductBundle(String name){
        this.name = name;
    }

    public void addProduct(CartItem item){
        items.add(item);
    }

    public int getPrice(){
        int total = 0;
        for(CartItem item : items){
            total += item.getPrice();
        }
        return total;
    }

    public void display(){
        System.out.println(name + " has the bundle " + items);
    }
}