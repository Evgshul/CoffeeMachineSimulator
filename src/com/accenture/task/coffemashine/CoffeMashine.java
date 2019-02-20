package com.accenture.task.coffemashine;

public interface CoffeMashine {
    public Drink make(DrinkOrder drinkOrder);

    public boolean validateOrder(DrinkOrder order);

    public String inStock(String ingredients);

    public boolean isBusy() throws InterruptedException;

}
