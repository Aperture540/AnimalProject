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
public class Ostrich extends Bird implements IWalk, IMakeSound 
{
    private double wingspan;
    
    public void name()
    {
        System.out.println("William Robertson");
    }
    
    public Ostrich (double wingspan)
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
    public void makeSound()
    {
        System.out.println("\"Bark\"");
    }
}
