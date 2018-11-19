/**
 * Advanced Object Oriented Programming with Java, WS 2018 * Problem: BoundingRobots
 * Link: PDF Exercises
 *
 * @author Julian Schreiner
 * @version 1.0, 10/23/2018
 * Method : BoundingRobots
 * Status : Accepted
 * Runtime: 0.102
 */
import java.util.Scanner;
public class BoundingRobots {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true)
        {
            int ThinkX = 0;
            int ThinkY = 0;
            int x = 0;
            int y = 0;
            int w = scan.nextInt() - 1;
            int l = scan.nextInt() - 1;

            if (w + 1 == 0 && l + 1 == 0)
                break;

            int moves = scan.nextInt();

            for (int i = 0; i < moves; i++)
            {
                String direction = scan.next();
                int distance = scan.nextInt();

                if (direction.equals("u"))
                {
                    if (y + distance > l)
                        y = l;
                    else
                        y += distance;
                    ThinkY += distance;
                }

                else if (direction.equals("d"))
                {
                    if (y - distance < 0)
                        y = 0;
                    else
                        y -= distance;
                    ThinkY -= distance;
                }

                else if (direction.equals("r"))
                {
                    if (x + distance > w)
                        x = w;
                    else
                        x += distance;
                    ThinkX += distance;
                }

                else
                {
                    if (x - distance < 0)
                        x = 0;
                    else
                        x -= distance;
                        ThinkX -= distance;
                }

            }

            System.out.println("Robot thinks " + ThinkX + " " + ThinkY);
            System.out.println("Actually at " + x + " " + y);
            System.out.println();
        }

        scan.close();
    }
}
