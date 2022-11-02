package com.burger;

public class chickenburger {
    private boolean chicken;
    private int doublecheese=70;
    private int extrasauce=25;
    private int price;

    public chickenburger(boolean chicken) {
        this.chicken = chicken;
        this.price = 200;
        System.out.println("cost of chicken burger=200");
    }

    public void adddoublecheese() {
        System.out.println("double cheese added for chicken burger=70");
        this.price += doublecheese;
    }

    public void addextrasauce() {
        System.out.println("extra sauce added for chicken burger=25");
        this.price += extrasauce;
    }
        public int totalbill () {
            System.out.println("total cost of chicken burger="+this.price);


        return this.price;
        }
    }


