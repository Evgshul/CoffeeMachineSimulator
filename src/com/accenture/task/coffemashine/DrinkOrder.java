package com.accenture.task.coffemashine;

import java.util.ArrayList;
import java.util.List;

public class DrinkOrder implements CoffeMashine {

    public static final String COFFEE = "coffee";
    public static final String HOT_WATER = "hot water";
    public static final String MILK = "milk";

    private Drink drinkType;
    private String name;
    private double money;
    private int sugar;

    List<DrinkType> drinkTypes;

    public DrinkOrder() {
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
    }


    public DrinkOrder(Drink drinkType, String name, double money, int sugar) {
        this.drinkType = drinkType;
        this.name = name;
        this.money = money;
        this.sugar = sugar;


    }

    @Override
    public Drink make(DrinkOrder drinkOrder) {
        System.out.println("Your " + drinkOrder.getName());
        return drinkOrder.getDrinkType();
    }

    @Override
    public boolean validateOrder(DrinkOrder order) {

        for (DrinkType type : drinkTypes) {
            if (type.equals(order.getName())) {
                return true;
            }
        }

        return false;
    }

    @Override
    public String inStock(String ingredients) {
        return null;
    }

    @Override
    public boolean isBusy() throws InterruptedException {
        return false;
    }

    public Drink getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(Drink drinkType) {
        this.drinkType = drinkType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }
}
