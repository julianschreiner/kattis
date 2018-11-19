import java.util.Scanner;

public class Estimates{
  public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      int x = Integer.parseInt(scanner.nextLine());
      int[] array = new int[x];
      for(int i = 0; i<x; i++){
        String s=scanner.nextLine();
        array[i] = s.length();
      }
      for(int i = 0; i<array.length;i++){
        System.out.println(array[i]);
      }
  }
}
