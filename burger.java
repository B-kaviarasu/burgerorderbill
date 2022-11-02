package com.burger;

public class burger {
    private int price;
    private boolean veg;

    private int doublecheese = 70;
    private int extrasauce = 25;

    public burger(boolean veg) {
        this.veg = veg;
            this.price = 100;
        System.out.println("cost of veg burger=100");

        }


        public void adddoublecheese() {
            System.out.println("double cheese added for veg burger=70");
            this.price += doublecheese;
        }
        public void addextrasauce() {
            System.out.println("extra sauce added for veg burger=25");
            this.price += extrasauce;
        }
        public int totalbill() {
            System.out.println("total cost of veg burger ="+this.price);

            return this.price;
        }
    }

