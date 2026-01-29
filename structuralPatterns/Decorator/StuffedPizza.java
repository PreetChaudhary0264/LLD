package structuralPatterns.Decorator;

public class StuffedPizza extends PizzaDecorator{

    StuffedPizza(Pizza pizza){
        super(pizza);
    }
    @Override
    public String setDescription() {
        return "Stuffed Pizza";
    }

    @Override
    public int setCost() {
        return pizza.setCost() + 25;
    }
}
