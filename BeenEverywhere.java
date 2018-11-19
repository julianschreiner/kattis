import java.util.Scanner;
import java.util.*;
public class BeenEverywhere {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();



        while(c!=0)
        {
            int t = sc.nextInt();
            ArrayList<String> cities = new ArrayList<String>();

            while(t!=0)
            {
                String city = sc.next();
                if (!cities.contains(city)) {

                    cities.add(city);

                }
                t--;
            }

                System.out.println(cities.size());

            c--;
        }


    }
}
