/**
 * Advanced Object Oriented Programming with Java, WS 2018 * Problem: HeartMonitor
 * Link: PDF Exercises
 *
 * @author Julian Schreiner
 * @version 1.0, 10/23/2018
 * Method : HeartMonitor
 * Status : Accepted
 * Runtime: 0.102
 */

import java.util.*;

public class HeartMonitor {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while(reader.hasNextLine()){
            StringBuilder output = new StringBuilder();
            String input = reader.nextLine();

            String name = input.replaceAll("[0-9.]","");
            name = name.replaceAll("^\\s+", "");

            String numbers = input.replaceAll("[^\\d.]", " ");
            numbers = numbers.replaceAll("^\\s+", "");

            String[] allNumbers = numbers.split(" ");

            double sum = 0;

            for (int i = 0; i < allNumbers.length ; i++) {
                sum += Double.parseDouble(allNumbers[i]);
            }

       //     System.out.println(sum/allNumbers.length);

            output.append(sum/allNumbers.length);
            output.append(" ");
            output.append(name);

            System.out.println(output.toString());
        }
    }
}
