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
public class Eagle extends Bird implements IFly, IWalk, IMakeSound 
{
    public void name()
    {
        System.out.println("Egbert");
    }
    
    @Override
    public void fly()
    {
        System.out.println("I can fly.");
    }

    @Override
    public void walk()
    {
        System.out.println("I can walk.");
    }

    /*@Override
    public void swim()
    {
        System.out.println("I can't swim.");
    }*/

    @Override
    public void makeSound()
    {
        System.out.println("\"Chirp\"");
    }
}
