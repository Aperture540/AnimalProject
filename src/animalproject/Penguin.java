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
public class Penguin extends Bird implements IWalk, ISwim, IMakeSound
{
    private double wingspan;
    
    public void name()
    {
        System.out.println("Lenny");
    }
    
    public Penguin (double wingspan)
    {
        this.wingspan = wingspan;
    }
    
    public double wingspan()
    {
        System.out.println("My wingspan is " + wingspan + " feet.");
        return wingspan;
    }

    @Override
    public void walk()
    {
        System.out.println("I can walk.");
    }

    @Override
    public void swim()
    {
        System.out.println("I can swim.");
    }

    @Override
    public void makeSound()
    {
        System.out.println("\"Meow\"");
    }
}
