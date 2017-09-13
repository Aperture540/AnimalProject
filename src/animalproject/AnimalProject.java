/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalproject;

import java.util.ArrayList;

/**
 *
 * @author agendron
 */
public class AnimalProject 
{
    public static void main(String[] args) 
    {
        Ostrich ostrichBird = new Ostrich(6.6);
        Penguin penguinBird = new Penguin(2.5);
        Eagle eagleBird = new Eagle(7.3);
        Shark sharkFish = new Shark(true);
        Bass bassFish = new Bass(false);
        FlyingFish flyingFishFish = new FlyingFish(true);
        Dolphin dolphinMammal = new Dolphin(97.7);
        Lion lionMammal = new Lion(101.5);
        Bat batMammal = new Bat(39.5);
        
        ArrayList<Animal> myAnimals = new ArrayList<>();
        myAnimals.add(ostrichBird);
        myAnimals.add(penguinBird);
        myAnimals.add(eagleBird);
        myAnimals.add(sharkFish);
        myAnimals.add(bassFish);
        myAnimals.add(flyingFishFish);
        myAnimals.add(dolphinMammal);
        myAnimals.add(lionMammal);
        myAnimals.add(batMammal);
        
        System.out.println("--**--Animal List--**--");
        
        for(Animal animal: myAnimals)
        {
            animal.name();
            animal.fly();
            animal.wingspan();
            animal.walk();
            animal.isSaltWater();
            animal.bodyTemp();
            animal.swim();
            animal.makeSound();
            System.out.println("\n");
        }
        
        ArrayList<Animal> myBirds = new ArrayList<>();
        myBirds.add(ostrichBird);
        myBirds.add(penguinBird);
        myBirds.add(eagleBird);
        
        System.out.println("\n--**--Bird List--**--");
        
        for(Animal birdAnimals: myBirds)
        {
            birdAnimals.name();
            birdAnimals.fly();
            birdAnimals.wingspan();
            birdAnimals.walk();
            birdAnimals.swim();
            birdAnimals.makeSound();
            System.out.println("\n");
        }
        
        ArrayList<Animal> myMammals = new ArrayList<>();
        myMammals.add(dolphinMammal);
        myMammals.add(lionMammal);
        myMammals.add(batMammal);
        
        System.out.println("\n--**--Mammal List--**--");
        
        for(Animal mammalAnimals: myMammals)
        {
            mammalAnimals.name();
            mammalAnimals.fly();
            mammalAnimals.walk();
            mammalAnimals.bodyTemp();
            mammalAnimals.swim();
            mammalAnimals.makeSound();
            System.out.println("\n");            
        }
        
        ArrayList<Animal> myFish = new ArrayList<>();
        myFish.add(sharkFish);
        myFish.add(bassFish);
        myFish.add(flyingFishFish);
        
        System.out.println("\n--**--Fish List--**--");
        
        for(Animal fishAnimals: myFish)
        {
            fishAnimals.name();
            fishAnimals.fly();
            fishAnimals.isSaltWater();
            fishAnimals.swim();
            fishAnimals.makeSound();
            System.out.println("\n");
        }
        
        ArrayList<Animal> myFlyers = new ArrayList<>();
        myFlyers.add(eagleBird);
        myFlyers.add(flyingFishFish);
        myFlyers.add(batMammal);
        
        System.out.println("\n--**--Flyer List--**--");
        
        for(Animal flyerAnimals: myFlyers)
        {
            flyerAnimals.name();
            flyerAnimals.fly();
            flyerAnimals.wingspan();
            flyerAnimals.walk();
            flyerAnimals.isSaltWater();
            flyerAnimals.bodyTemp();
            flyerAnimals.swim();
            flyerAnimals.makeSound();
            System.out.println("\n");            
        }
        
        ArrayList<Animal> myWalkers = new ArrayList<>();
        myWalkers.add(ostrichBird);
        myWalkers.add(penguinBird);
        myWalkers.add(eagleBird);
        myWalkers.add(lionMammal);
        myWalkers.add(batMammal);
        
        System.out.println("\n--**--Walker List--**--");
        
        for(Animal walkerAnimals: myWalkers)
        {
            walkerAnimals.name();
            walkerAnimals.fly();
            walkerAnimals.wingspan();
            walkerAnimals.walk();
            walkerAnimals.bodyTemp();
            walkerAnimals.swim();
            walkerAnimals.makeSound();
            System.out.println("\n"); 
        }
        
        ArrayList<Animal> mySwimmers = new ArrayList<>();
        mySwimmers.add(penguinBird);
        mySwimmers.add(sharkFish);
        mySwimmers.add(bassFish);
        mySwimmers.add(flyingFishFish);
        mySwimmers.add(dolphinMammal);
        mySwimmers.add(lionMammal);
        
        System.out.println("\n--**--Swimmer List--**--");
        
        for(Animal swimmerAnimals: mySwimmers)
        {
            swimmerAnimals.name();
            swimmerAnimals.fly();
            swimmerAnimals.wingspan();
            swimmerAnimals.walk();
            swimmerAnimals.isSaltWater();
            swimmerAnimals.bodyTemp();
            swimmerAnimals.swim();
            swimmerAnimals.makeSound();
            System.out.println("\n");    
        }
        
        ArrayList<Animal> mySoundMakers = new ArrayList<>();
        mySoundMakers.add(ostrichBird);
        mySoundMakers.add(penguinBird);
        mySoundMakers.add(eagleBird);
        mySoundMakers.add(sharkFish);
        mySoundMakers.add(bassFish);
        mySoundMakers.add(flyingFishFish);
        mySoundMakers.add(dolphinMammal);
        mySoundMakers.add(lionMammal);
        mySoundMakers.add(batMammal);
        
        System.out.println("\n--**--Sound Makers List--**--");
        
        for(Animal soundMakerAnimals: mySoundMakers)
        {
            soundMakerAnimals.name();
            soundMakerAnimals.fly();
            soundMakerAnimals.wingspan();
            soundMakerAnimals.walk();
            soundMakerAnimals.isSaltWater();
            soundMakerAnimals.bodyTemp();
            soundMakerAnimals.swim();
            soundMakerAnimals.makeSound();
            System.out.println("\n");
        }
    }
}
