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
public class Shark extends Fish implements ISwim, IMakeSound 
{
    public void name()
    {
        System.out.println("Bruce");
    }
    
    /*@Override
    public void fly()
    {
        System.out.println("I can fly.");
    }*/

    /*@Override
    public void walk()
    {
        System.out.println("I can walk.");
    }*/
    
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
        System.out.println("\"Chomp\"");
    }    
}
