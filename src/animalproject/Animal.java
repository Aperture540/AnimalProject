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
public abstract class Animal implements IFly, IWalk, ISwim, IMakeSound 
{
    String name;
    //public void name();
    public void name()
    {
        System.out.println("");
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    @Override
    public String toString() 
    {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void fly() 
    {
        //System.out.println("I can fly.");
    }

    @Override
    public void walk() 
    {
        //System.out.println("I can walk.");
    }
    
    public boolean isSaltWater()
    {
        return true;
    }

    @Override
    public void swim() 
    {
        //System.out.println("I can swim.");
    }

    @Override
    public void makeSound() 
    {
        //System.out.println("I can make sounds.");
    }
}
