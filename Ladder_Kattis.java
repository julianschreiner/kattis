/**
 * Advanced Object Oriented Programming with Java, WS 2018 * Problem: Ladder_Kattis
 * Link: PDF Exercises
 *
 * @author Julian Schreiner
 * @version 1.0, 10/23/2018
 * Method : Ladder_Kattis
 * Status : Accepted
 * Runtime: 0.102
 */

import java.util.*;

public class Ladder_Kattis {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input[] = reader.nextLine().split(" ");
        reader.close();

        int h =  Integer.parseInt(input[0]);
        int v = Integer.parseInt(input[1]);

        double alpha = Math.PI / 180 * v;
        double c = h / Math.sin(alpha);

        System.out.println((int) Math.ceil(c));
    }
}
