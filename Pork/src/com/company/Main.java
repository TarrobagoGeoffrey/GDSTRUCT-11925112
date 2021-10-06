package com.company;

public class Main {

    public static void main(String[] args) {
        Pork thePork1 = new Pork();
        Pork thePork2 = new Pork();

        thePork1.setWeight(85);
        thePork1.setSpeed(35);
        thePork1.setColor("Brown");
        thePork1.setName("Noel");

        thePork2.setWeight(90);
        thePork2.setSpeed(30);
        thePork2.setColor("Black");
        thePork2.setName("Bell");

        thePork1.ateGrass();
        thePork2.ateGrass();
    }
}
