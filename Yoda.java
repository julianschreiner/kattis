/**
 * Advanced Object Oriented Programming with Java, WS 2018 * Problem: Yoda
 * Link: PDF Exercises
 *
 * @author Julian Schreiner
 * @version 1.0, 10/23/2018
 * Method : Yoda
 * Status : Accepted
 * Runtime: 0.102
 */

import java.util.*;

public class Yoda {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String n = reader.nextLine();
        String m = reader.nextLine();

        while(n.length() != m.length()){
            if(n.length() < m.length()){
                n = "0" + n;
            }
            else{
                m = "0" + m;
            }
        }

        String outputN = "";
        String outputM = "";

        if(Integer.parseInt(n) < 1000000000 && Integer.parseInt(m) < 1000000000){
            for (int i = n.length() - 1; i >= 0; i--) {
                if(n.charAt(i) > m.charAt(i)){
                    outputN = n.charAt(i) + outputN;
                }
                else if (n.charAt(i) < m.charAt(i)){
                    outputM = m.charAt(i) + outputM;
                }
                else{
                    outputM = m.charAt(i) + outputM;
                    outputN = n.charAt(i) + outputN;
                }
            }
        }

        if(outputN.equals("")){
            System.out.println("YODA");
        } else {
            System.out.println(Integer.parseInt(outputN));
        }

        if(outputM.equals("")){
            System.out.println("YODA");
        }
        else{
            System.out.println(Integer.parseInt(outputM));
        }

        reader.close();
    }
}
