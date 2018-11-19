import java.util.ArrayList;
import java.util.Scanner;

public class Apaxiaaaaaaaaaaaans {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int i=0;
        for(i=0;i<name.length()-1;i++)
        {
            if(name.charAt(i)!=name.charAt(i+1))
            {
                System.out.print(name.charAt(i));
            }
        }
        System.out.print(name.charAt(i));
        System.out.println();
    }
}
/*


        ArrayList<Character> array = new ArrayList<Character>();

        for(int i = 0; i < name.length(); i++)
        {
            array.add(name.charAt(i));
        }


        int a = 97;
        for(int i=0;i<=name.length();i++)
        {
            for(int j=i;j<name.length();j++)
            {
                String c= new String((char)a+""+(char)a);
                if(array.contains(c))
                {
                    System.out.println("JA");
                }
                a++;

            }


        }
 */