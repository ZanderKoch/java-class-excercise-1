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

//subclass of House
public class School extends House{
    //instance variables
    private int classrooms; //total amount of classrooms in the school

    //constructor
    public School(int floors, String adress, double lenght, double width, int classrooms) {
        super(floors, adress, lenght, width);
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
    //generates a nicely formated string showing the object's information
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
