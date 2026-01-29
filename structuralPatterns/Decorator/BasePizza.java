package structuralPatterns.Decorator;

public class BasePizza implements Pizza{
    @Override
    public String setDescription() {
        return "BasePizza";
    }

    @Override
    public int setCost() {
         return 100;
    }
}
