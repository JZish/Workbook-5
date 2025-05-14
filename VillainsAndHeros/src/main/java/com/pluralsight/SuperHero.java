package com.pluralsight;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

// Create a class using the extends keyword to basically copy all the functionality from the parent class
//parent class to the child class
public class SuperHero extends SuperPerson{

    private static Scanner scanner = new Scanner(System.in);

    public SuperHero(int health, String name, int powerLevel) {
        super(health, name);

        // parent folder defaulted to 0
        //superhero to pass in powerlevel
        // ust that as xp
        this.experiencePoints = powerLevel;

        System.out.println(this.name + " has a power level of " + powerLevel);
    }

    @Override
    public void fight(SuperPerson opponent) {
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
            System.out.println(this.name + " Successful Attack on " + opponent.name);
            opponent.takeDamage(baseDamage);
        }
    }


        public void battle(SuperPerson opponent){

          //  Scanner

            System.out.println("1) Primary Fire");
            System.out.println("2) Secondary Onslaught");
            System.out.println("3) Ultimate Sanction");
            System.out.println("4) Skip..");

            String move = scanner.nextLine().toString().trim();

            switch (move){
                case "1":
                    System.out.println(this.name + " used Primary Fire on " + opponent.name);
                    ThreadLocalRandom.current().nextInt(28,57);
                    break;
                case "2":
                    System.out.println(this.name + " used Secondary Onslaught on " + opponent.name);
                    ThreadLocalRandom.current().nextInt(8,19);
                    break;
                case "3":
                    System.out.println(this.name + " used Ultimate Sanction on " + opponent.name);
                    ThreadLocalRandom.current().nextInt(68,345);
                    break;
                case "4":
                    System.out.println("skipped..");
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
