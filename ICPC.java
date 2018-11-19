/**
 * Advanced Object Oriented Programming with Java, WS 2018 * Problem: ICPC
 * Link: PDF Exercises
 *
 * @author Julian Schreiner
 * @version 1.0, 10/23/2018
 * Method : ICPC
 * Status : Accepted
 * Runtime: 0.102
 */

import java.util.*;

public class ICPC {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int numOfTeams = Integer.parseInt(reader.nextLine());

        ArrayList<String> allTeams = new ArrayList<String>();


        for (int i = 0; i < numOfTeams; i++) {
            String[] team = reader.nextLine().split(" ");

            String uni = team[0];
            String teamName = team[1];

            boolean retval = isInList(allTeams, uni);

            if(!retval){
                allTeams.add(uni + " " + teamName);
            }
        }

        for (int i = 0; i < 12; i++) {
            System.out.println(allTeams.get(i));
        }
    }

    public static boolean isInList(ArrayList<String> list, String search) {
        boolean found = false;

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).contains(search)){
                found = true;
            }
        }

        return found;

    }
}
