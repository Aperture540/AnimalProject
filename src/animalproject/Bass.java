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
public class Bass extends Fish implements ISwim, IMakeSound 
{
    private boolean isSaltWater;
    
    public void name()
    {
        System.out.println("Larry");
    }

    @Override
    public void swim()
    {
        System.out.println("I can swim.");
    }
    
    public Bass (boolean isSaltWater)
    {
        this.isSaltWater = isSaltWater;
    }

    public boolean isSaltWater()
    {
        if(isSaltWater)
        {
            System.out.println("I live in salt water.");
        }
        else
        {
            System.out.println("I live in fresh water.");
        }
        return isSaltWater;
    }

    @Override
    public void makeSound()
    {
        System.out.println("\"Bubble noises\"");
    }
}
