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
public class FlyingFish extends Fish implements IFly, ISwim, IMakeSound 
{
    private boolean isSaltWater;
    
    public void name()
    {
        System.out.println("Rover");
    }

    @Override
    public void fly()
    {
        System.out.println("I can fly.");
    }

    @Override
    public void swim()
    {
        System.out.println("I can swim.");
    }
    
    public FlyingFish (boolean isSaltWater)
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
        System.out.println("\"Splash\"");
    }
}
