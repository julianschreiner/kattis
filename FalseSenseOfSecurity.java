/**
 * Advanced Object Oriented Programming with Java, WS 2018 * Problem: FalseSenseOfSecurity
 * Link: PDF Exercises
 *
 * @author Julian Schreiner
 * @version 1.0, 10/23/2018
 * Method : FalseSenseOfSecurity
 * Status : Accepted
 * Runtime: 0.102
 */

import java.util.*;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Hashtable;


public class FalseSenseOfSecurity {
       /* int testCases =  reader.nextInt();

        reader.nextLine(); // Skip the remainder of the double line
        if(testCases <= 100){
            for(int i = 0; i < testCases; i++) {
                String[] firstInput = reader.nextLine().split(" ");
                String cities = firstInput[0];      //n
                String pilots = firstInput[1];      //m

                for (int j = 0; j < Integer.parseInt(pilots); j++) {
                    String betweenCities[] = reader.nextLine().split(" ");
                }
            }
        }
        */

    ArrayList<String> codedMessages;
    Hashtable<String, String> morse;
    Hashtable<String, String> morseReversed;
    ArrayList<String> result;

    public static void main(String[] args) {
        new FalseSenseOfSecurity();
    }

    FalseSenseOfSecurity() {
        setUpMorse();
        scanData();
    }

    private void setUpMorse() {
        morse = new Hashtable<String, String>();
        morseReversed = new Hashtable<String, String>();
        result = new ArrayList<String>();
        codedMessages = new ArrayList<String>();

        morseReversed.put(".-", "A");
        morseReversed.put("-...", "B");
        morseReversed.put("-.-.", "C");
        morseReversed.put("-..", "D");
        morseReversed.put(".", "E");
        morseReversed.put("..-.", "F");
        morseReversed.put("--.", "G");
        morseReversed.put("....", "H");
        morseReversed.put("..", "I");
        morseReversed.put(".---", "J");
        morseReversed.put("-.-", "K");
        morseReversed.put(".-..", "L");
        morseReversed.put("--", "M");
        morseReversed.put("-.", "N");
        morseReversed.put("---", "O");
        morseReversed.put(".--.", "P");
        morseReversed.put("--.-", "Q");
        morseReversed.put(".-.", "R");
        morseReversed.put("...", "S");
        morseReversed.put("-", "T");
        morseReversed.put("..-", "U");
        morseReversed.put("...-", "V");
        morseReversed.put(".--", "W");
        morseReversed.put("-..-", "X");
        morseReversed.put("-.--", "Y");
        morseReversed.put("--..", "Z");
        morseReversed.put("..--", "_");
        morseReversed.put(".-.-", ",");
        morseReversed.put("---.", ".");
        morseReversed.put("----", "?");

        morse.put("A", ".-");
        morse.put("B", "-...");
        morse.put("C", "-.-.");
        morse.put("D", "-..");
        morse.put("E", ".");
        morse.put("F", "..-.");
        morse.put("G", "--.");
        morse.put("H", "....");
        morse.put("I", "..");
        morse.put("J", ".---");
        morse.put("K", "-.-");
        morse.put("L", ".-..");
        morse.put("M", "--");
        morse.put("N", "-.");
        morse.put("O", "---");
        morse.put("P", ".--.");
        morse.put("Q", "--.-");
        morse.put("R", ".-.");
        morse.put("S", "...");
        morse.put("T", "-");
        morse.put("U", "..-");
        morse.put("V", "...-");
        morse.put("W", ".--");
        morse.put("X", "-..-");
        morse.put("Y", "-.--");
        morse.put("Z", "--..");
        morse.put("_", "..--");
        morse.put(",", ".-.-");
        morse.put(".", "---.");
        morse.put("?", "----");
    }

    private void scanData() {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            codedMessages.add(scan.nextLine());
            analyzeData();
            codedMessages.clear();
        }
        scan.close();

    }

    private void analyzeData() {
        for (String string : codedMessages) {
            String[] message = string.split("");
            String result = "";
            String numberLength = "";
            for (String charM : message) {
                String morseSeq = morse.get(charM);
                result += morseSeq;
                numberLength += morseSeq.length();
            }


            reverseAndSave(result, numberLength);
        }
    }

    private void reverseAndSave(String result, String numberLength) {
        String[] reversed = new StringBuilder(numberLength).reverse().toString()
                .split("");

        String decodedMessage = "";
        String[] morse = result.split("");
        int lengthIndex = 0;
        for (int i = 0; i < morse.length;) {
            int length = Integer.parseInt(reversed[lengthIndex]);
            String morseSingel = "";
            while (length != 0) {
                morseSingel += morse[i];
                i++;
                length--;
            }

            decodedMessage += morseReversed.get(morseSingel);
            lengthIndex++;
        }
        this.result.add(decodedMessage);
        printResult();
        this.result.clear();
    }

    private void printResult() {
        for (String string : result) {
            System.out.println(string);
        }
    }
}


