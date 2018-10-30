/**
 * Advanced Object Oriented Programming with Java, WS 2018 * Problem: Bijele
 * Link: PDF Exercises
 *
 * @author Julian Schreiner
 * @version 1.0, 10/23/2018
 * Method : Bijele
 * Status : Accepted
 * Runtime: 0.102
 */

import java.util.*;

public class Bijele {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String chessCount[] = reader.nextLine().split(" ");

        ArrayList<Integer> checkArray = new ArrayList<Integer>(
                Arrays.asList(1, 1, 2, 2, 2, 8));

        ArrayList<Integer> result = new ArrayList<Integer>();

        int counter = 0;
        int temp = 0;

        for (String c: chessCount) {
            if(0 <= Integer.parseInt(c) && Integer.parseInt(c) <= 10){
                temp = checkArray.get(counter) - Integer.parseInt(c);
                result.add(temp);
                counter++;
            }
        }

        StringBuilder output = new StringBuilder();

        for (int k: result){
            output.append(k).append(" ");
        }
        System.out.println(output);

        reader.close();
    }
}
