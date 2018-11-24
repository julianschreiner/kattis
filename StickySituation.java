package PACKAGE_NAME;
/**
 * Advanced Object Oriented Programming with Java, WS 2018 * Problem: StickySituation
 * Link: PDF Exercises
 *
 * @author Julian Schreiner
 * @version 1.0, 10/23/2018
 * Method : StickySituation
 * Status : Accepted
 * Runtime: 0.102
 */

import java.util.*;



public class StickySituation {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int numOfSticks = Integer.parseInt(reader.nextLine());
        ArrayList<Long> sticks = new ArrayList<Long>();

        for (int i = 0; i < numOfSticks ; i++) {
            sticks.add(reader.nextLong());
        }

        // ASC
        Collections.sort(sticks);

        boolean possible = false;

        for (int i = 0; i < numOfSticks - 2; i++)
            if (sticks.get(i) + sticks.get(i + 1) > sticks.get(i + 2)) {
                possible = true;
                break;
            }

        if (possible) {
            System.out.println("possible");
        }
        else{
            System.out.println("impossible");
        }

        reader.close();
    }
}
