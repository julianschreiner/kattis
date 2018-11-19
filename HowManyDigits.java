import java.util.Scanner;
import java.util.ArrayList;
import java.math.BigInteger;

public class HowManyDigits {
	static BigInteger factorial(int n) {
		BigInteger f = new BigInteger("1");
		if(n == 0) {
			f = BigInteger.ONE;
		}
		else if(n > 0) {
			for(int i = 2; i<=n; i++) {
				f = f.multiply(BigInteger.valueOf(i));
			}
		}
		return f;
	}
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		   BigInteger[] array = new BigInteger[100001]; 
		   while(scan.hasNextInt()) {
			   int i = 0;
			   array[i] = factorial(scan.nextInt());
			   //list.add(i,factorial(scan.nextInt()));
			   System.out.println(array[i].toString().length());
			   i++;
		   }
	}
}
