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
public abstract class Mammal extends Animal 
{
    /*public Mammal() 
    {
        double bodyTemp; 
    }*/
    
    double bodyTemp;
    
    @Override
    public double bodyTemp() 
    {
    return super.bodyTemp(); //To change body of generated methods, choose Tools | Templates.
    }
}
