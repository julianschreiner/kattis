import java.util.Scanner;
public class LeftBeehind {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int x,y;

        int limit = 0;

        for(;;)
        {
            limit++;
            x = sc.nextInt();
            y = sc.nextInt();

            if (x+y==13) { System.out.println("Never speak again.");}
            else {


                if (x < y) {
                    System.out.println("Left beehind.");
                }
                if (x > y) {
                    System.out.println("To the convention.");
                }
                if(x==0&&y==0) break;
                else {
                    if (x == y) {
                        System.out.println("Undecided.");
                    }
                }
            }






        }


    }
}
