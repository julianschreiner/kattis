/**
 * Advanced Object Oriented Programming with Java, WS 2018 * Problem: Parking
 * Link: PDF Exercises
 *
 * @author Julian Schreiner
 * @version 1.0, 10/23/2018
 * Method : Parking
 * Status : Accepted
 * Runtime: 0.102
 */

import java.util.*;

public class Parking {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int testCases = reader.nextInt();

        for (int i = 0; i < testCases; i++) {
            int sum = 0;
            int stores = reader.nextInt();
            ArrayList<Integer> nums = new ArrayList<>();

            for (int j = 0; j < stores; j++) {
                nums.add(reader.nextInt());
            }

            Collections.sort(nums);

            for (int j = 0; j < nums.size() - 1; j++){
                System.out.println(nums.get(j));
                sum += nums.get(j + 1) - nums.get(j);
            }

            //System.out.println(sum*2);
        }
    }
}
