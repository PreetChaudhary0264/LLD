package creationalPatterns.Builder;

import java.util.List;

public class BurgerMeal {
    private final String bun;
    private final String patty;

    //Requierd
    private final boolean cheese;
    private final List<String> toppings;
    private final boolean drinks;

    public BurgerMeal(BurgerBuilder builder){
        this.bun = builder.bun;
        this.patty = builder.patty;

        //optional
        this.cheese = builder.cheese;
        this.toppings = builder.toppings;
        this.drinks = builder.drinks;
    }

    public static class BurgerBuilder{
        private final String bun;
        private final String patty;

        //Requierd
        private boolean cheese;
        private List<String> toppings;
        private boolean drinks;

        public BurgerBuilder(String bun,String patty){
            this.bun = bun;
            this.patty = patty;
        }

        public BurgerBuilder withCheese(boolean cheese){
            this.cheese = cheese;
            return this;
        }
        public BurgerBuilder toppings(List<String> toppings){
            this.toppings = toppings;
            return this;
        }
        public BurgerBuilder withDrinks(boolean drinks){
            this.drinks = drinks;
            return this;
        }

        public BurgerMeal build(){
            return new BurgerMeal(this);
        }
    }


    public static void main(String[] args) {
        BurgerMeal burger = new BurgerBuilder("wheat","veg").withCheese(false).build();


        //Now u may have a Question?  why we cant write these setter in BurgerMeal?
        //Because
        //1. objects mutable ho jaynge...real words systrem me immutable objects safer hote hai
        //imageine kisi ne order place krne ke baad order change kr diya

        //2. BurgerMeal meal = new BurgerMeal();
        //   meal.setCheese(true); // bun? patty?   Invalid state possible
    }
}
