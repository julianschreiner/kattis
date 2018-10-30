/**
 * Advanced Object Oriented Programming with Java, WS 2018 * Problem: Sibice
 * Link: https://open.kattis.com/contests/pp5rtp/problems/sibice
 * @author Julian Schreiner
 * @version 1.0, 10/23/2018
 * Method : Sibice
 * Status : Accepted
 * Runtime: 0.102
 */

import java.util.*;

public class Sibice {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String[] firstLine = reader.nextLine().split(" ");

        /*
        * A match fits in the box if its entire length can lie on the bottom of the box
        */

        int numMatches = Integer.parseInt(firstLine[0]);
        int w = Integer.parseInt(firstLine[1]);
        int h = Integer.parseInt(firstLine[2]);

        int diagonal = (int) Math.sqrt((w*w) + (h*h));


        for (int i = 0; i < numMatches ; i++) {
            int lengthOneMatch = Integer.parseInt(reader.nextLine());


            if (lengthOneMatch > diagonal) {
                System.out.println("NE");
            }
            else{
                System.out.println("DA");
            }



        }

    }


}
