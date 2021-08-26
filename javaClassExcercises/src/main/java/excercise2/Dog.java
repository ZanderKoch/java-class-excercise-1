/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excercise2;

/**
 *
 * @author Elev
 */
public abstract class Dog {
    //instance variables
    protected String breed;
    
    //constructor
    protected Dog(){}
    
    //methods
    protected void sleep(){
        System.out.println("zZZZZZzZZZZZzZZZZ");
    }
    
    protected void bark(){
        System.out.println("bark woof lmao");
    }
}
