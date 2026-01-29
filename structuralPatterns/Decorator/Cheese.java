package structuralPatterns.Decorator;

public class Cheese extends PizzaDecorator{

    Cheese(Pizza pizza){
        super(pizza);
    }
    @Override
    public String setDescription() {
        return "CheesePizza";
    }

    @Override
    public int setCost() {
        return pizza.setCost() + 40;
    }
}
