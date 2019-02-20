package com.accenture.task.coffemashine;

import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // write your code here


        DrinkOrder order = new DrinkOrder();

        System.out.println("Chose coffee type:");
        printdrinkType(order.drinkTypes);
        orderCoffee(order);
    }

    private static void orderCoffee(DrinkOrder order) {

        Scanner read = new Scanner(System.in);
        String coffeeType = read.next();

        System.out.println("Enter the amount of money");
        double money = read.nextDouble();

        System.out.println("You order " + coffeeType + " and paid " + money);
        DrinkOrder newOrder = null;
        boolean doWeHavwCoffe = false;

        for (DrinkType drinktype : order.drinkTypes) {
            if (drinktype.getName().equals(coffeeType)) {
                newOrder = new DrinkOrder(drinktype, drinktype.getName(), drinktype.getPrice(), 1);
            }
        }
        if (doWeHavwCoffe == false) {
            System.out.println("Sorry, no coffee for you");
            System.out.println("Chose coffe type:");
            orderCoffee(order);
        } else {
            order.validateOrder(newOrder);
            order.make(newOrder);
            System.out.println("Choose coffe type:");
            orderCoffee(order);
        }

    }

    private static void printdrinkType(List<DrinkType> listOfDrinks) {

        for (DrinkType drink : listOfDrinks) {
            System.out.print(drink.getName());
            System.out.println("....." + drink.getPrice());
        }
    }
}


