package com.pluralsight;

import org.w3c.dom.ls.LSOutput;

public class SuperApp {

    public static void main(String[] args) {

        // Create 2 superpeople
        SuperPerson superAbraham = new SuperPerson(100, "Abraham");
        SuperPerson superAssia = new SuperHero(100, "Assia", 25);
        SuperVillain superEpic = new SuperVillain(67, "Evildoer", 32);

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

        // Create a hero object with a name, health, and powerLevel
        SuperHero masterChief = new SuperHero(100, "Master Chief", 85);
        // Create a villain object with a name, health, and evilness
        SuperVillain theElder = new SuperVillain(800, "The Elder", 100);
        // Display an introduction message
        System.out.println("The ultimate battle commences!");
        // Show the starting status of both characters
        System.out.println(masterChief.getStatus());
        System.out.println(theElder.getStatus());

        // Loop while both the hero and villain are still alive
        while (masterChief.health > 0 && theElder.health > 0) {
            System.out.println("Fight!");
            // Indicate the hero's turn
            System.out.println("It is Master Chief's turn: ");
            // Have the hero fight the villain
            masterChief.battle(theElder);
            // Show the villain's updated status
            theElder.getStatus();
            // If the villain is no longer alive, break the loop
            if (!theElder.isAlive()) {
                break;
            } else {
                // Indicate the villain's turn
                System.out.println("It is now " + theElder.name + "'s turn!");

                // Have the villain fight the hero
                theElder.fight(masterChief);
                // Show the hero's updated status
                masterChief.getStatus();
                // End of loop
            }
            // Display a message that the battle is over
            System.out.println("Done");
            // If the hero is still alive
            if (masterChief.isAlive() && !theElder.isAlive()) {
                System.out.println("MasterChief is alive");
            }
            // Announce the hero as the winner
            // Otherwise
            // Announce the villain as the winner
            if (masterChief.isAlive()) {
                System.out.println("Master Chief won!");
            } else {
                System.out.println("The Elder won!");
            }
        }

    }
}
