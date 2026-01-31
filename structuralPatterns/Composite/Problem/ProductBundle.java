package structuralPatterns.Composite.Problem;

import java.util.ArrayList;
import java.util.List;

public class ProductBundle {
    private String name;
    private List<Product> items = new ArrayList<>();

    public ProductBundle(String name){
        this.name = name;
    }

    public void addProduct(Product item){
        items.add(item);
    }

    public int getPrice(){
        int total = 0;
        for(Product item : items){
            total += item.getPrice();
        }
        return total;
    }

    public void display(){
        System.out.println(name + " has the bundle " + items);
    }
}
