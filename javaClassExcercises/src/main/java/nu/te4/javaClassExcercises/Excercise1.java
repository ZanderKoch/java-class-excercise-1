/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.javaClassExcercises;

import java.lang.Integer;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Elev
 */
public class Excercise1 {
    ////////
    //Main//
    ////////
    public static void main(){
        

        //creating an array of houses and schools
        Random rand = new Random();
        
        List <House> buildings = new ArrayList<>();
        buildings.add( new House(
                                 rand.nextInt(10),
                                 "Datagatan1",
                                 (double)rand.nextInt(50),
                                 (double)rand.nextInt(50)));
        
        buildings.add(new School(
                                rand.nextInt(10),
                                "Datagatan1",
                                (double)rand.nextInt(50), //not gonna look up how
                                (double)rand.nextInt(50), //to set bounds on 
                                rand.nextInt()));         //random.NextDouble(),
    }
}
