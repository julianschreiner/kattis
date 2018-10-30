/**
 * Advanced Object Oriented Programming with Java, WS 2018 * Problem: TakeTwoStones
 * Link: https://open.kattis.com/contests/pp5rtp/problems/twostones
 *
 * @author Julian Schreiner
 * @version 1.0, 10/23/2018
 * Method : TakeTwoStones
 * Status : Accepted
 * Runtime: 0.102
 */

import java.util.*;

public class TakeTwoStones {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int numOfStones = Integer.parseInt(reader.nextLine());
        int stonesLeft = numOfStones;
        String ret  = "";

        if(numOfStones < 2){
            ret = "Alice";
        }
        else{
            for (int i = 0; i < numOfStones ; i++) {
                stonesLeft--;

               // System.out.println(i % 2);

                if(i % 2 == 0){
                    if (stonesLeft % 2 == 0) {
                        ret = "Alice";
                    }
                    else{
                        ret = "Bob";
                    }
                }

            }
        }

        System.out.println(ret);




    }
}
