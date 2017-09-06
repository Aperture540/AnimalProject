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
public class Animal implements IFly, IWalk, ISwim, IMakeSound {
    String name;

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void walk() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void swim() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void makeSound() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
