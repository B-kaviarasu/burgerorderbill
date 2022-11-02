package com.burger;

public class main {
    public static void main(String[] args) {
       burger burger=new burger(true);
     //  burger.adddoublecheese();
      // burger.addextrasauce();
       burger.totalbill();
        System.out.println("---------------");
        chickenburger chickenburger=new chickenburger(true);
      //  chickenburger.adddoublecheese();
       // chickenburger.addextrasauce();
        chickenburger.totalbill();
        System.out.println("--------------------");
        int totalbill=burger.totalbill()+chickenburger.totalbill();
        System.out.println("---------------");
        System.out.println("total cost of bill="+totalbill);
        System.out.println("--------------");
    }
}
