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
        
        //constructor
        public House(int floors, String adress, double lenght, double width) {
            this.floors = floors;
            this.address = adress;
            this.length = lenght;
            this.width = width;
        }
        
        //class methods
        protected double calculateArea(){
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
    
    //subclass of House
    public class School extends House{
        //instance variables
        private int classrooms; //total amount of classrooms in the school
        
        //constructor
        public School(int floors, String adress, double lenght, double width, int classrooms) {
            super.floors = floors;
            super.address = adress;
            super.length = lenght;
            super.width = width;
            this.classrooms = classrooms;
        }
        
        //methods
        private double calculateAverageClassroomArea(){
            return super.calculateArea() / this.classrooms;
        }
        
        private double calculateClassroomsPerFloor(){
            return this.classrooms / super.floors;
        }
        
        @Override
        public String generateDisplayString(){
            String displayString = String.format("""
                    Floors: %d
                    Adress: %s
                    Length: %fm, Width: %fm
                    Area: %fm^2
                    ---School specific---
                    Classroom(s): %d
                    Average area / classroom: %fm^2
                    Classroom(s) / floor: %f""",
                    super.floors,
                    super.address,
                    super.length, super.width,
                    super.calculateArea(),
                    this.classrooms,
                    this.calculateAverageClassroomArea(),
                    this.calculateClassroomsPerFloor());
            
            return displayString;
        }
    }
    
    ////////
    //Main//
    ////////
    static void main(){
        
    }
}
