import java.util.Scanner;

public class PaulEigon{
  public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      int a,b,c;
      int x;
      a = scanner.nextInt();
      b = scanner.nextInt();
      c = scanner.nextInt();
      x = (b+c)/a;
      if((x % 2) == 0){
        System.out.println("paul");
      }
      else{
        System.out.println("opponent");
      }
  }
}
