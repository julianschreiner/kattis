/**
 * Advanced Object Oriented Programming with Java, WS 2018 * Problem: Sok
 * Link: https://open.kattis.com/contests/pp5rtp/problems/sok
 * @author Julian Schreiner
 * @version 1.0, 10/23/2018
 * Method : Sok
 * Status : Accepted
 * Runtime: 0.102
 */

import java.util.*;

public class Sok {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // liters
        String[] firstLine = reader.nextLine().split(" ");

        //ratio
        String[] secondLine = reader.nextLine().split(" ");

        List<String> leftovers = new ArrayList<String>();


        Arrays.sort(secondLine);

        int min = Integer.parseInt(secondLine[0]);

        for (int i = 0; i < firstLine.length; i++) {
          //  firstLine[i] - ()
          //  leftovers.add(firstline[i] - )
        }
    }
}
