/**
 * Advanced Object Oriented Programming with Java, WS 2018 * Problem: AlphabetSpam
 * Link: PDF Exercises
 *
 * @author Julian Schreiner
 * @version 1.0, 10/23/2018
 * Method : AlphabetSpam
 * Status : Accepted
 * Runtime: 0.102
 */

import java.util.*;
import java.text.DecimalFormat;


public class AlphabetSpam {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String input = reader.nextLine();
        double r1 = 0,r2 = 0,r3 = 0,r4 = 0;


        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == '_'){
                //Whitespace
                r1++;
            }
            else if(Character.isLowerCase(input.charAt(i))){
                //lowercase
                r2++;
            }
            else if(Character.isUpperCase(input.charAt(i))){
                r3++;
            }
            else{
                r4++;
            }
        }

        DecimalFormat dec = new DecimalFormat("#0.0000000000000000");
        System.out.println(dec.format(r1/input.length()));
        System.out.println(dec.format(r2/input.length()));
        System.out.println(dec.format(r3/input.length()));
        System.out.println(dec.format(r4/input.length()));


    }
}
