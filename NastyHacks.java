/**
 * Advanced Object Oriented Programming with Java, WS 2018 * Problem: NastyHacks
 * Link: https://open.kattis.com/contests/pp5rtp/problems/nastyhacks
 * @author Julian Schreiner
 * @version 1.0, 10/23/2018
 * Method : NastyHacks
 * Status : Accepted
 * Runtime: 0.102
 */

import java.util.*;

public class NastyHacks {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int cases = Integer.parseInt(reader.nextLine());

        if(cases > 0){
            for (int i = 0; i < cases ; i++) {
                String[] fellowLine = reader.nextLine().split(" ");
                int r = Integer.parseInt(fellowLine[0]);        //is the expected revenue if you do not advertise
                int e = Integer.parseInt(fellowLine[1]);        //is the expected revenue if you do advertise
                int c = Integer.parseInt(fellowLine[2]);        //is the cost of advertising
                String output = "";

                int d = r - (e-c);

                if(d < 0){
                    output = "advertise";
                }
                else if(d > 0){
                    output = "do not advertise";
                }
                else{
                    output = "does not matter";
                }

                System.out.println(output);


            }
        }


    }
}
