package Practice.Creational.Builder;

import java.util.List;

public class BurgerMeal {
    private String bun;
    private String patty;

    private boolean withCheese;
    private boolean drinks;
    private List<String> toppings;

    public BurgerMeal(BurgerBuilder builder){
        this.bun = builder.bun;
        this.patty = builder.patty;
        this.withCheese = builder.withCheese;
        this.toppings = builder.toppings;
        this.drinks = builder.drinks;
    }

    public static class BurgerBuilder{
        private String bun;
        private String patty;

        private boolean withCheese;
        private boolean drinks;
        private List<String> toppings;

        public BurgerBuilder(String bun,String patty){
            this.bun = bun;
            this.patty = patty;
        }

        public BurgerBuilder withCheese(boolean cheese){
            this.withCheese = cheese;
            return this;
        }

        public BurgerMeal build(){
            return new BurgerMeal(this);
        }
    }

    public static void main(String[] args) {
        BurgerMeal burger = new BurgerBuilder("wheat","veg").withCheese(true).build();

    }
}
