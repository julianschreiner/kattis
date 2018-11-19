/**
 * Advanced Object Oriented Programming with Java, WS 2018 * Problem: IsItHalloween
 * Link: PDF Exercises
 *
 * @author Julian Schreiner
 * @version 1.0, 10/23/2018
 * Method : IsItHalloween
 * Status : Accepted
 * Runtime: 0.102
 */

import java.util.*;

public class IsItHalloween {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String[] input = reader.nextLine().split(" ");

        if(input[0].equals("OCT") && input[1].equals("31") || input[0].equals("DEC") && input[1].equals("25")){
            System.out.println("yup");
        }
        else{
            System.out.println("nope");
        }
    }
}
