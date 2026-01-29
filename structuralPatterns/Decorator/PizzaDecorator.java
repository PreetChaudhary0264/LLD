package structuralPatterns.Decorator;

abstract public class PizzaDecorator implements Pizza{
    public Pizza pizza;

    public PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }
}
