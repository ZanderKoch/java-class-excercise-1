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
        protected String address;
        protected double length; //in meters
        protected double width;  //in meters
        
        //constructors
        public House(int floors, String adress, double lenght, double width) {
            this.floors = floors;
            this.address = adress;
            this.length = lenght;
            this.width = width;
        }
        
        //class methods
        public double calculateArea(){
            return this.length * this.width;
        }
        
        //generates a nicely formated string showing the object's information
        public String generateDisplayString(){
            String displayString = String.format("""
                    Floors: %d
                    Adress: %s
                    Length: %fm, Width: %fm
                    Area: %fm^2""",
                    this.floors,
                    this.address,
                    this.length, this.width,
                    this.calculateArea());
            
            return displayString;
        }      
    }

