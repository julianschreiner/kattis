/**
 * Advanced Object Oriented Programming with Java, WS 2018 * Problem: HissingMicrophone
 * Link: https://open.kattis.com/contests/pp5rtp/problems/hissingmicrophone
 * @author Julian Schreiner
 * @version 1.0, 10/23/2018
 * Method : HissingMicrophone
 * Status : Accepted
 * Runtime: 0.102
 */

import java.util.*;

public class HissingMicrophone {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String input = reader.nextLine();

        boolean hissing = false;

        for (int i = 0; i < input.length() ; i++) {
            if (input.charAt(i) == 's' || input.charAt(i) == 'S'){
                //LOOK IF THERE'S ANOTHER ONE NEXT TO IT
                if(i < input.length() - 1){
                    if(input.charAt(i+1) == 's' || input.charAt(i) == 'S'){
                        hissing = true;
                        break;
                    }
                }
            }
        }

        if(hissing){
            System.out.println("hiss");
        }
        else{
            System.out.println("no hiss");
        }

    }
}
