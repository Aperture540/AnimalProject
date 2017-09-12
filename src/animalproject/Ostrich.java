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
    public void name()
    {
        System.out.println("William Robertson");
    }
    
    @Override
    public double wingspan()
    {
        System.out.println("My wingspan is " + 6.6 + " feet.");
        return 6.6;
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
        System.out.println("\"Bark\"");
    }
}
