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
        Ostrich ostrichBird = new Ostrich();
        
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(lionMammal);
        
        ArrayList<IFly> flyers = new ArrayList<>();
        flyers.add(ostrichBird);
        
        
        
    }
    
}
