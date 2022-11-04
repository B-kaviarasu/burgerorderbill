package com.burger;

public class combo {
    private int price;
    private boolean chicken;
    private boolean coke;
    private boolean veg;

    public combo(boolean chicken, boolean coke, boolean veg) {
        this.chicken = chicken;
        this.coke = coke;
        this.veg = veg;
        this.price = 300;
        System.out.println("cost of combo pack=300");
    }

    public int totalbill() {
        System.out.println("total cost of combo=" + this.price);
        return this.price;
    }
    }


