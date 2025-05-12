package com.pluralsight;

import org.w3c.dom.ls.LSOutput;

public class SuperApp {

    public static void main(String[] args) {

        // Create 2 superpeople
        SuperPerson superAbraham = new SuperPerson(100, "Abraham");
        SuperPerson superAssia = new SuperHero(100, "Assia", 25);


        //ask each superperson how they are doing
        System.out.println(superAbraham.getStatus());
        System.out.println(superAssia.getStatus());

        superAbraham.fight(superAssia);
        superAssia.fight(superAbraham);

        //take damage
        superAbraham.takeDamage(15);
        superAssia.takeDamage(20);

        //ask each superperson how they are doing
        System.out.println(superAbraham.getStatus());
        System.out.println(superAssia.getStatus());

    }
}
