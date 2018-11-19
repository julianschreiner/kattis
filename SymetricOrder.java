/**
 * Advanced Object Oriented Programming with Java, WS 2018 * Problem: SymetricOrder
 * Link: PDF Exercises
 *
 * @author Julian Schreiner
 * @version 1.0, 10/23/2018
 * Method : SymetricOrder
 * Status : Accepted
 * Runtime: 0.102
 */

import java.util.*;

public class SymetricOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int caseCounter = 0;

        while(true){
            int n = reader.nextInt();

            if(n == 0){
                break;
            }

            String[] a = new String[n];

            for(int i = 0;i < n/2; i++){
                a[i]=reader.next();
                a[n-i-1]=reader.next();
            }

            if(n % 2 != 0){
                a[n/2]=reader.next();
            }

            System.out.println("SET "+ ++caseCounter);

            for(int i = 0; i < n; i++){
                System.out.println(a[i]);
            }
        }
    }
}
