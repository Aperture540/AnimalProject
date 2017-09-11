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
public class AnimalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lion lionMammal = new Lion();
        Eagle eagleBird = new Eagle();
        
        ArrayList<Animal> myAnimals = new ArrayList<>();
        myAnimals.add(lionMammal);
        myAnimals.add(eagleBird);
        
        ArrayList<IFly> flyers = new ArrayList<>();
        flyers.add(eagleBird);
        
        for(Animal animal: myAnimals)
        {
            animal.name();
            animal.fly();
            animal.walk();
            animal.swim();
            animal.makeSound();
            System.out.println("---------------");
        }
        
        for(IFly flyingAnimals: flyers)
        {
            
        }
        
        
    }
    
}
