import java.util.Scanner;

public class CryptographersConundrum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String per = "PER";
        String input = sc.nextLine();
        int nDays = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != per.charAt(i % 3)) {
                nDays++;
            }
        }
        System.out.println(nDays);
    }
}



