/**
 * Advanced Object Oriented Programming with Java, WS 2018 * Problem: Bishop
 * Link: PDF Exercises
 *
 * @author Julian Schreiner
 * @version 1.0, 10/23/2018
 * Method : Bishop
 * Status : Accepted
 * Runtime: 0.102
 */

import java.util.*;

public class Bishop {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        while(reader.hasNextInt()){
            int num = reader.nextInt();

            if(num == 1){
                System.out.println(1);
            }
            else if(num > 1){
                System.out.println(2*num-2);
            }
            else{
                System.out.println(0);
            }
        }
    }
}
