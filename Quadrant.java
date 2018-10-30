/**
 * Advanced Object Oriented Programming with Java, WS 2018 * Problem: Quadrant
 * Link: PDF Exercises
 *
 * @author Julian Schreiner
 * @version 1.0, 10/23/2018
 * Method : Quadrant
 * Status : Accepted
 * Runtime: 0.102
 */

import java.util.*;

public class Quadrant {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        int y = reader.nextInt();
        int quadr = 0;
        reader.close();

        if ((-1000 <= x && x <= 1000 && x != 0) && (-1000 <= y && y <= 1000 && y != 0)){
            /* QUADRANT     COND
             * 1             +x/+y
             * 2             -x/+y
             * 3             -x/-y
             * 4             +x/-y
             */

            if(x > 0 && y > 0){
                quadr = 1;
            }
            else if (x < 0 && y > 0){
                quadr = 2;
            }
            else if (x < 0 && y < 0){
                quadr = 3;
            }
            else{
                quadr = 4;
            }

            System.out.println(quadr);
        }
    }
}
