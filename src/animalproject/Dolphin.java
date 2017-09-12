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
public class Dolphin extends Mammal implements ISwim, IMakeSound 
{
    public void name()
    {
        System.out.println("Sheldon");
    }
    
    @Override
    public double bodyTemp()
    {
        System.out.println("My body temperature is " + 97.7 + " degrees fahrenheit.");
        return 97.7;
    }
    
    @Override
    public boolean isSaltWater()
    {
        System.out.println("I live in salt water.");
        return true;
    }

    @Override
    public void swim()
    {
        System.out.println("I can swim.");
    }

    @Override
    public void makeSound()
    {
        System.out.println("\"Screech\"");
    }
}
