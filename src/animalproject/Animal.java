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
public abstract class Animal implements IFly, IWalk, ISwim, IMakeSound {
    String name;
    //public void name();
    public void name()
    {
        System.out.println("");
    }

    @Override
    public void fly() {
        System.out.println("I can fly.");
    }

    @Override
    public void walk() {
        System.out.println("I can walk.");
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
