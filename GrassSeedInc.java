/**
 * Advanced Object Oriented Programming with Java, WS 2018 * Problem: GrassSeedInc
 * Link: PDF Exercises
 *
 * @author Julian Schreiner
 * @version 1.0, 10/23/2018
 * Method : GrassSeedInc
 * Status : Accepted
 * Runtime: 0.102
 */

import java.util.*;

public class GrassSeedInc {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double c = Double.parseDouble(reader.nextLine());        // the cost of seed to sow one square metre of lawn.
        double l = Double.parseDouble(reader.nextLine());        // the number of lawns to sow.

        double pay = 0;

        for (int i = 0; i < l; i++) {
            String[] lawn = reader.nextLine().split(" ");

            double widthLawn = Double.parseDouble(lawn[0]);     // the width of the lawn
            double heightLawn = Double.parseDouble(lawn[1]);    // the length of the lawn

            double squareMetre = widthLawn*heightLawn;

            pay+= squareMetre*c;
        }

        System.out.println(pay);

    }
}
