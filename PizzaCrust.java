import java.util.Scanner;
public class PizzaCrust {


    public static void main(String[] argv)
    {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextInt();
        double cr = r - sc.nextInt();

        double totalarea = Math.PI * r * r;
        double cheesearea = Math.PI * cr * cr;

        double erg = cheesearea / totalarea *100;
        System.out.printf("%.6f ",erg);
    }
}
