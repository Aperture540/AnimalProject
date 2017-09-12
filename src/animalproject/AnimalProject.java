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
        
        ArrayList<IFly> myFlyers = new ArrayList<>();
        myFlyers.add(eagleBird);
        
        for(Animal animal: myAnimals)
        {
            animal.name();
            animal.fly();
            animal.walk();
            animal.isSaltWater();
            animal.swim();
            animal.makeSound();
            System.out.println("-----------------");
        }
        
        for(IFly flyers: myFlyers)
        {
            
        }
        
        
    }
    
}
