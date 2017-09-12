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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Ostrich ostrichBird = new Ostrich();
        Penguin penguinBird = new Penguin();
        Eagle eagleBird = new Eagle();
        Shark sharkFish = new Shark();
        Bass bassFish = new Bass();
        FlyingFish flyingFishFish = new FlyingFish();
        Dolphin dolphinMammal = new Dolphin();
        Lion lionMammal = new Lion();
        Bat batMammal = new Bat();
        
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
            System.out.println("-----------------");
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
            System.out.println("-----------------");
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
            System.out.println("-----------------");            
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
            System.out.println("-----------------");
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
            System.out.println("-----------------");            
        }
        
        
        
        
    }
    
}
