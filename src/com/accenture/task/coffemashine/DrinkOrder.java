package com.accenture.task.coffemashine;

public class DrinkOrder implements CoffeMashine {
    private Drink drinkType;
    private String name;
    private double money;
    private int sugar;



    @Override
    public Drink make(DrinkOrder drinkOrder) {
        return null;
    }

    @Override
    public boolean validateOrder(String validate) {
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
}
