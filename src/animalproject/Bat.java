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
public class Bat extends Mammal implements IFly, IWalk, IMakeSound 
{
    private double bodyTemp;
    
    public void name()
    {
        System.out.println("Esteban Julio Ricardo Montoya De La Rosa Ramirez");
    }
    
    public Bat (double bodyTemp)
    {
        this.bodyTemp = bodyTemp;
    }
    
    public double bodyTemp()
    {
        System.out.println("My body temperature is " + bodyTemp + " degrees fahrenheit.");
        return bodyTemp;
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
        System.out.println("\"Roar\"");
    }
}
