package com.example.android.coffeeapp;

/**
 * Created by tim_r_000 on 11/11/2015.
 */
public class CoffeeOrder {

    private double price;
    private int numberOfCoffee;

    public CoffeeOrder(double price){
        if(price >0){
            this.price = price;
        }
        else
            this.price = 0;
        this.numberOfCoffee = 0;
    }

    /**
     * This method adds a coffee.
     */
    public void addCoffee(){
        this.numberOfCoffee += 1;
    }

    /**
     * This method removes a coffee.
     */
    public void removeCoffee(){
        this.numberOfCoffee -= 1;
        if(this.numberOfCoffee <0){
            this.numberOfCoffee =0;
        }
    }

    /**
     * This method returns the number of the coffee in the order.
     */
    public int getNumberOfCoffee(){
        return this.numberOfCoffee;
    }

    /**
     * This method returns the price of the order.
     */
    public double orderPrice(){
        return this.price * this.numberOfCoffee;
    }
}
