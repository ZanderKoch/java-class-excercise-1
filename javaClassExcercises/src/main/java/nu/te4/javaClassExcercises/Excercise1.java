/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.javaClassExcercises;

/**
 *
 * @author Elev
 */
public class Excercise1 {
    ///////////
    //Classes//
    ///////////

    //superclass
    public class House{
        //instance variables
        protected int floors;
        protected String adress;
        protected double lenght; //in meters
        protected double width;  //in meters
        
        //constructors
        public House(int floors, String adress, double lenght, double width) {
            this.floors = floors;
            this.adress = adress;
            this.lenght = lenght;
            this.width = width;
        }
        
        //class methods
        public double calculateArea(){
            return this.lenght * this.width;
        }
    }
    
}
