/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalproject;

/**
 *
 * @author agendron
 */
public class FlyingFish extends Fish implements ISwim, IFly, IMakeSound {
    
    
    public void name()
    {
        System.out.println("Rover");
    }

    @Override
    public void fly() {
        System.out.println("I can fly.");
    }

    @Override
    public void swim() {
        System.out.println("");
    }

    @Override
    public void makeSound() {
        System.out.println("");
    }
}