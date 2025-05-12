package com.pluralsight;

import java.util.Random;

public class SuperPerson {

    protected String name;
    // ^ Means it and it's subclasses in family tree can access the value (inherited)
    protected int health;
    protected int experiencePoints;

    public SuperPerson(int health, String name) {
        // Take in values of name and health
        this.health = health;
        this.name = name;

        //default the exp to 0
        this.experiencePoints = 0;
    }

    public boolean isAlive(){
        //If health is greater than zero, return zero, otherwise false
        return this.health > 0;

        /*
        if (health > 0){
            System.out.println("Alive");
            return true;
        } else {
            System.out.println("Dead");
            return false;
        }
        */

    }

    // Method to fight another superperson
    public void fight(SuperPerson opponent){
        //Random Amount of Damage
        int damageAmount = new Random().nextInt(21);
        // Print who we are fighting
        System.out.println(this.name + " is fighting " + opponent.name);
        opponent.takeDamage(15);
        opponent.takeDamage(damageAmount + this.experiencePoints);
    }

    // Allows superperson to take damage
    public void takeDamage(int damageAmount){
        //Subtract damage from health
        //don't set health below 0

        this.health -= damageAmount;
        if(this.health <= 0){
            this.health = 0;
        }

    }


public String getStatus(){
        // returns state of superperson
        return this.name + " has " + this.health + " health left!";
}





}
