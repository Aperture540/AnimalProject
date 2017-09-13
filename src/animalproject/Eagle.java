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
    private double wingspan;
    
    public void name()
    {
        System.out.println("Egbert");
    }
    
    public Eagle (double wingspan)
    {
        this.wingspan = wingspan;
    }
    
    public double wingspan()
    {
        System.out.println("My wingspan is " + wingspan + " feet.");
        return wingspan;
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

    @Override
    public void makeSound()
    {
        System.out.println("\"Chirp\"");
    }
}
