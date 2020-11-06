package com.company.incapsulare;

public class Main {
    public static void main(String args[]) {
        Laptop asus = new Laptop("asus", "alb", 15.000d);
        System.out.println(asus.print());
        Telefon t1 = new Telefon("Xioami", "negru", 1200d, 32);
        System.out.println(t1.print());
    }
}