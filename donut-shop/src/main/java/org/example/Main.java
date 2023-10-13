package org.example;

public class Main {
    public static void main(String[] args) {
        Donut[] donuts = new Donut[6];
        donuts[0] = new Donut("Tres leches", 300, 3.75, "Calories: 300");
        donuts[1] = new Donut("Spooky season", 250, 2.99, "Filled with jelly");
        donuts[2] = new Donut("Apple Cider", 250, 3.00, "Calories: 250, Seasonal donut");
        donuts[3] = new Donut("Unicorn Dust", 300, 3.50, "Calories: 300, Strawberry frosted with sprinkles");
        donuts[4] = new Donut("Glazed", 275, 2.00, "Calories: 275, Our traditional Glazed donut");
        donuts[5] = new Donut("Chocolate", 275, 2.50, "Calories: 275, Chocolate frosted donut");


        for (Donut donut: donuts) {
            System.out.println(donut);
        }
    }
}