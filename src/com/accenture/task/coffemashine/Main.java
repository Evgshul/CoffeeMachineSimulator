package com.accenture.task.coffemashine;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final String COFFEE = "coffee";
    public static final String HOT_WATER = "hot water";
    public static final String MILK = "milk";


    public static void main(String[] args) {
        // write your code here

        List<String> blackCoffeeRecipe = new ArrayList<>();
        blackCoffeeRecipe.add(COFFEE);
        blackCoffeeRecipe.add(HOT_WATER);


        List<String> cappucino = new ArrayList<>();
        cappucino.add(COFFEE);
        cappucino.add(HOT_WATER);
        cappucino.add(MILK);


        List<String> latte = new ArrayList<>();
        latte.add(COFFEE);
        latte.add(HOT_WATER);
        latte.add(MILK);

        List<DrinkType> drinkType = new ArrayList<>();
        drinkType.add(new DrinkType("Black coffee", 0.50, blackCoffeeRecipe));
        drinkType.add(new DrinkType("Cappuccino", 1.00, cappucino));
        drinkType.add(new DrinkType("Latte", 1.00, latte));

        System.out.println("Chose coffee type:");


        DrinkOrder order = new DrinkOrder();
        printdrinkType(drinkType);

    }

    private static void printdrinkType(List<DrinkType> listOfDrinks) {

        for (DrinkType drink : listOfDrinks) {
            System.out.print(drink.getName());
            System.out.println("....." + drink.getPrice());
        }
    }
}
