/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dog.Dog;
import dog.RoboDog;
import dog.SearchAndRescueDog;

/**
 *
 * @author kwhiting
 */
public class Main 
{
    
            /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Dog puppy;
        
        puppy = new Dog();
        puppy.setName("Null");
        
        System.out.println("My puppy's name is " + puppy.getName());
        
        Dog workingDog = new SearchAndRescueDog();
        workingDog.setBreed("German Shepard");
        workingDog.setName("BadAss");
        
        RoboDog superDog = new RoboDog();
        superDog.setName("Terminator");
        
    } 
}
