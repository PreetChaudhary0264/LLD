package structuralPatterns.Composite.Problem;

public class Product {
    private String name;
    private int price;

    public Product(String name,int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
    public void display(){
        System.out.println(name + " has the " + price);
    }
}
