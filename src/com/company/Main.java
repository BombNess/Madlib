package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Phase one
        String greeting;
        String name;
        String action;
        String typeOfBuilding;
        String formOfTransportation;
        String typeOfWeather;
        String grossItem;
        String somethingSuspicious;
        String typeOfWeapon;
        String formOfAttack;
        String number;
        String distance;
        String nameOfACity;
        String typeOfFont;
        String job;
        String celebrity;
        String speed;
        String anotherCelebrity;
        String typeOfMysticalAnimal;
        String specificAmountOfTime;



        //phase 2

        Scanner Keyboard;
        Keyboard = new Scanner(System.in);
        System.out.println("Type in a type of Greeting");
        greeting = Keyboard.nextLine();

        System.out.println("Type in your name");
        name = Keyboard.nextLine();

        System.out.println("Type in a verb");
        action = Keyboard.nextLine();

        System.out.println("Type in a type of building you wish you were at");
        typeOfBuilding = Keyboard.nextLine();

        System.out.println("Type in a form of transportation you want to use");
        formOfTransportation = Keyboard.nextLine();

        System.out.println("Type in a popular city");
        nameOfACity = Keyboard.nextLine();

        System.out.println("Type in a form of weather you see everyday");
        typeOfWeather = Keyboard.nextLine();

        System.out.println("Type in an item that grosses you out");
        grossItem = Keyboard.nextLine();

        System.out.println("Type in something that seems suspicious to you");
        somethingSuspicious = Keyboard.nextLine();

        System.out.println("Type in your favorite type of weapon");
        typeOfWeapon = Keyboard.nextLine();

        System.out.println("Type in a word that involves hitting something?");
        formOfAttack = Keyboard.nextLine();

        System.out.println("Type in a large number");
        number = Keyboard.nextLine();

        System.out.println("Type in a unit for distance");
        distance = Keyboard.nextLine();

        System.out.println("Type in a font like comic sans or times new roman");
        typeOfFont = Keyboard.nextLine();

        System.out.println("Name a singer celebrity");
        celebrity = Keyboard.nextLine();

        System.out.println("Say a type of job you wish to have");
        job = Keyboard.nextLine();

        System.out.println("Name a male celebrity");
        anotherCelebrity = Keyboard.nextLine();

        System.out.println("Type in a mythical animal");
        typeOfMysticalAnimal = Keyboard.nextLine();

        System.out.println("Type in an amount of time you spend doing something a day");
        specificAmountOfTime = Keyboard.nextLine();

        System.out.println("Type in a specific number with units of speed");
        speed = Keyboard.nextLine();


        //phase 3

        System.out.println(greeting + " " + name);
        System.out.println("Your quest begins here");
        System.out.println("You've been tasked of helping a wizard so he can do wizard things again");
        System.out.println("He has tasked you of going to a " + typeOfBuilding + " and getting " + somethingSuspicious);
        System.out.println("You must use your " + formOfTransportation + " and go inside and find what the wizard described");
        System.out.println("When you get there you look around for " + specificAmountOfTime);
        System.out.println("Your eyes find themselves staring into " + grossItem);
        System.out.println("You are immediately grossed out and decide to leave");
        System.out.println("On your way back to the wizard, you run into " + anotherCelebrity + " and he challenges you to a dual for a " + typeOfMysticalAnimal);
        System.out.println("You lose because you don't know how to use " + typeOfWeapon);
        System.out.println("You are traveling at " + speed + " but you are bored so you start humming music from " + celebrity);
        System.out.println("It takes forever to get back to the wizard for some reason");
        System.out.println("It weather starts turning to " + typeOfWeather + " so you decide to stop and rest in "+ nameOfACity);
        System.out.println("You arrive at a building to look for shelter and someone gives you a piece of paper");
        System.out.println("Too bad you can't read it because its in " + typeOfFont);
        System.out.println("So after traveling " + number + " of " + distance + " you finally arrive at the wizards tower");
        System.out.println("You give the paper to the wizard and he said its an offer to become a " + job);
        System.out.println("You have to decline because you are " + action);
        System.out.println("the wizard tries to " + formOfAttack + " you but you doge and counter attack and kill the wizard using " + typeOfWeapon);
        System.out.println("The powers of the wizard are bestowed to you and you become the traveller of time, being able to travel throughout time");




















    }
}
