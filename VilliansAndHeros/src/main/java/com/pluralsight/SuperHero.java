package com.pluralsight;

import java.util.Random;

// Create a class using the extends keyword to basically copy all the functionality from the parent class
//parent class to the child class
public class SuperHero extends SuperPerson{

    public SuperHero(int health, String name, int powerLevel) {
        super(health, name);

        // parent folder defaulted to 0
        //superhero to pass in powerlevel
        // ust that as xp
        this.experiencePoints = powerLevel;

        System.out.println(this.name + " has a power level of " + powerLevel);
    }

    @Override
    public void fight(SuperPerson opponent){
        System.out.println("What, you got something to say?");
        // Make the hero do a random amount of damage to opponent
        //damage should be random number + xp points(powerLevel)
        //if the base damage without XP was 0, don't do any damage and just say you missed
        //otherwise deal damage and say something about you kicking butt again


        // Generate random number
        int baseDamage = new Random().nextInt(43);
        int totalDamage = baseDamage + this.experiencePoints;

        // if we didn't do any base damage,we missed
        if (baseDamage == 0) {
            System.out.println(this.name + " Missed! " + opponent.name);
        } else {
            opponent.takeDamage(totalDamage);
            System.out.println(this.name + " Succesful Attack on " + opponent.name);
            opponent.takeDamage(baseDamage);
        }


    }

    public void takeDamage(int damageAmount){
        //Subtract damage from health
        //don't set health below 0

        this.health -= damageAmount;
        if(this.health <= 0){
            this.health = 0;
        }

    }



}
