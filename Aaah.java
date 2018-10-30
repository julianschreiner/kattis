/**
 * Advanced Object Oriented Programming with Java, WS 2018 * Problem: Aaah
 * Link: PDF Exercises
 *
 * @author Julian Schreiner
 * @version 1.0, 10/23/2018
 * Method : Aaah
 * Status : Accepted
 * Runtime: 0.102
 */

import java.util.*;

public class Aaah {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int ableToSay = reader.nextLine().length();       //aaaaaah
        int requirement = reader.nextLine().length();     //ah


        if(ableToSay >= requirement){
            System.out.println("go");
        }
        else{
            System.out.println("no");
        }


    }
}
