package creationalPatterns.Builder;

//You are develpoing a food delivery app and inside u are implementing a burgerMeal

import java.util.List;

public class Problem {

    //Required
    private final String bun;
    private final String patty;

    //Optional fields
    private final boolean cheese;
    private final List<String> toppings;

    public Problem(String bun, String patty, boolean cheese, List<String> toppings){
        this.bun = bun;
        this.patty = patty;

        //optional
        this.cheese = cheese;
        this.toppings = toppings;
    }


    //lets assume u have 200 optional items

    public static void main(String[] args) {
        Problem burger = new Problem("Wheat","Veg",true,null);

        //if u have 200 optional items ,does user have to enter null 200 times?
        //u can make constructor to have 200 items but user have to enter 200 items will make it worse
    }

}
