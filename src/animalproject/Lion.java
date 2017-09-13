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
public class Lion extends Mammal implements IWalk, ISwim, IMakeSound 
{
    private double bodyTemp;
    
    public void name()
    {
        System.out.println("Tiny");
    }
    
    public Lion (double bodyTemp)
    {
        this.bodyTemp = bodyTemp;
    }
    
    public double bodyTemp()
    {
        System.out.println("My body temperature is " + bodyTemp + " degrees fahrenheit.");
        return bodyTemp;
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
        System.out.println("\"Scream\"");
    }
}
