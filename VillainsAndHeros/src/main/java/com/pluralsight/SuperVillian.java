package com.pluralsight;

import java.util.Random;

public class SuperVillain extends SuperPerson{

    public SuperVillian(int health, String name, int powerLevel) {
        super(health, name);

        this.experiencePoints = powerLevel;
        System.out.println(this.name + " has a power level of " + powerLevel);
    }

    @Override
    public void fight(SuperPerson opponent){
        System.out.println("I found you hero!");

        int baseDamage = new Random().nextInt(32);
        int totalDamage = baseDamage + experiencePoints;

        if (baseDamage == 0){
            System.out.println(this.name + " missed " + opponent.name);
        } else {
            opponent.takeDamage(totalDamage);
            System.out.println(this.name + "made a hit on " + opponent.name);
            opponent.takeDamage(baseDamage);
        }


    }
}
