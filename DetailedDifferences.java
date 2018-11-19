/**
 * Advanced Object Oriented Programming with Java, WS 2018 * Problem: DetailedDifferences
 * Link: PDF Exercises
 *
 * @author Julian Schreiner
 * @version 1.0, 10/23/2018
 * Method : DetailedDifferences
 * Status : Accepted
 * Runtime: 0.102
 */

import java.util.*;

public class DetailedDifferences {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int cases = Integer.parseInt(reader.nextLine());

        for (int i = 0; i < cases ; i++) {
            StringBuilder res = new StringBuilder();
            String first = reader.nextLine();
            String second = reader.nextLine();

            for (int j = 0; j < first.length(); j++) {
                if (first.charAt(j) != second.charAt(j)) {
                    res.append("*");
                } else {
                    res.append(".");
                }
            }

            System.out.println(first);
            System.out.println(second);
            System.out.println(res.toString());
            System.out.println();

        }
    }
}
