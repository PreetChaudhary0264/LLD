package structuralPatterns.Decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new BasePizza();
        System.out.println(pizza.setCost());

        Pizza cheesePizza = new Cheese(new BasePizza());
        System.out.println(cheesePizza.setCost());

        Pizza stuffedPizza = new StuffedPizza(new BasePizza());
        System.out.println(stuffedPizza.setCost());

        Pizza stuffedCheesePizza = new StuffedPizza(new Cheese(new BasePizza()));
        System.out.println(stuffedCheesePizza.setCost());
    }
}
