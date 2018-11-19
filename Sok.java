
import java.util.Scanner;
public class Sok {

    public static void main(String[] argv)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        int i,j,k;
        double s1,s2,s3;
        double min;


         a = sc.nextInt();
         b = sc.nextInt();
         c = sc.nextInt();

         i = sc.nextInt();
         j = sc.nextInt();
         k = sc.nextInt();

         s1 = 1.0*a/i;
         s2 = 1.0*b/j;
         s3 = 1.0*c/k;

         min = Math.min(s1,(Math.min(s2,s3)));

         double erg1 = (a - min * i);
         double erg2 =(b - min * j);
         double erg3 = (c-min *k);


         System.out.printf("%.6f ",erg1);
         System.out.printf("%.6f ",erg2);
         System.out.printf("%.6f ",erg3);

    }
}
