package edu.fju.vendingmachine;

public class Drink {
    int price;
    public Drink(int price) {
        this.price = price;
    }
    public int get(int total) {
        return total-price;
    }
}
