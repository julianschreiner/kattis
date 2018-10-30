/**
 * Advanced Object Oriented Programming with Java, WS 2018 * Problem: Faktor
 * Link: PDF Exercises
 *
 * @author Julian Schreiner
 * @version 1.0, 10/23/2018
 * Method : Faktor
 * Status : Accepted
 * Runtime: 0.102
 */

import java.util.*;

public class Faktor {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String factors[] = reader.nextLine().split(" ");

        if((1 <= Integer.parseInt(factors[0]) && Integer.parseInt(factors[0]) <= 100) && (1 <= Integer.parseInt(factors[1]) && Integer.parseInt(factors[1]) <= 100)){
            int erg = Integer.parseInt(factors[0]) * Integer.parseInt(factors[1]);
            erg -= Integer.parseInt(factors[0]) - 1;
            System.out.println(erg);
        }

        reader.close();

    }
}
