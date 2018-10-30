/**
 * Advanced Object Oriented Programming with Java, WS 2018 * Problem: Just_a_minute
 * Link: PDF Exercises
 *
 * @author Julian Schreiner
 * @version 1.0, 10/23/2018
 * Method : Just_a_minute
 * Status : Accepted
 * Runtime: 0.102
 */

import java.util.*;

public class Just_a_minute {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int amountObservations = Integer.parseInt(reader.nextLine());
        String[] trainObservations = new String[amountObservations];

        double result = 0;
        double minSum = 0;
        double secSum = 0;

        if (1 <= amountObservations && amountObservations <= 1000) {
            for (int i = 0; i < amountObservations; i++){
                trainObservations = reader.nextLine().split(" ");

                double m = Integer.parseInt(trainObservations[0]) * 60;     //display
                double s = Integer.parseInt(trainObservations[1]);          //real

                minSum += m;
                secSum += s;
            }
            result = secSum / minSum;

            if(result <= 1){
                System.out.println("measurement error");
            }
            else{
                System.out.println(result);
            }

        }

        reader.close();
    }
}
