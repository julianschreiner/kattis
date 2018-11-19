import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n1,n2;
        //n1 current direction
        //n2 correct direction
        do {


            System.out.println("n1: \n");
            n1 = input.nextInt();

            System.out.println("n2: \n");
            n2 = input.nextInt();

            if(!(n1>=0&&n1<=359)||!(n2>=0&&n2<=359)) {
                System.out.println("One of the numbers is not below 359 or above 0 please try again ");
            }
        }while(!(n1>=0&&n1<=359)||!(n2>=0&&n2<=359));
        int sum=0;
        int a = n1+n2;
        while(n1!=n2)
        {
            if(a>=359)
            {
                if(n1>359)
                {
                    n1=0;
                }
                n1++;
                sum++;
            }
            else
            {
                if(n1<0)
                {
                    n1=359;
                }
                n1--;
                sum--;
            }
        }

        System.out.println(sum);
    }

}