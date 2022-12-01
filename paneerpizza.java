package com.burger;

public class paneerpizza {
    private int price;
    private int doublecheese=70;
    private int extratoppings=50;

    public paneerpizza() {
        this.price = 300;
        System.out.println("the amount of paneerpizza=300");
    }
    public void adddoublecheese(){
        System.out.println("double cheese added for paneerpizza=70");
        this.price+=doublecheese;
    }
    public void addextratoppings() {
        System.out.println("double cheese added for extratoppings=50");
        this.price += extratoppings;
    }
    public int totalbill(){
        System.out.println("total amount of paneerpizza="+this.price);
        return this.price;
    }
}
