/**
 * Advanced Object Oriented Programming with Java, WS 2018 * Problem: Planina
 * Link: PDF Exercises
 *
 * @author Julian Schreiner
 * @version 1.0, 10/23/2018
 * Method : Planina
 * Status : Accepted
 * Runtime: 0.102
 */

import java.util.*;

public class Planina {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int iterations = Integer.parseInt(reader.nextLine());
        int x = 2;

        while(iterations --> 0){
            x += x - 1;
        }
        System.out.println((int)Math.pow(x,2));
    }
}
