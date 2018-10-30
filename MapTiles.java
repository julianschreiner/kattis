/**
 * Advanced Object Oriented Programming with Java, WS 2018 * Problem: MapTiles
 * Link: PDF Exercises
 *
 * @author Julian Schreiner
 * @version 1.0, 10/23/2018
 * Method : MapTiles
 * Status : Accepted
 * Runtime: 0.102
 */

import java.util.*;

import java.util.Scanner;

public class MapTiles{

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String quadkey = reader.nextLine();

        int zoom = quadkey.length();
        int x = 0;
        int y = 0;

        for (int i = 0; i < quadkey.length(); i++) {
            char current = quadkey.charAt(i);
            int coordinate = (int) Math.pow(2, quadkey.length() - i - 1);

            if (current == '1' || current == '3') {
                x += coordinate;
            }
            if (current == '2' || current == '3') {
                y += coordinate;
            }
        }

        System.out.println(zoom + " " + x + " " + y);


        reader.close();

    }
}