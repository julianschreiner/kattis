import java.util.Scanner;
public class Bela {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		char dom = scan.next().charAt(0);
		int sum = 0;
		char [] a = {'A','K','Q','J','T','9','8','7'};
		int[] d = {11,4,3,20,10,14,0,0};
		int[] nd = {11,4,3,2,10,0,0,0};
		for(int i = 0; i<n*4; i++) {
			String s = scan.next();
			int indx = 0;
			for(int j = 0; j<8; j++) {
				if(a[j] == s.charAt(0)) {
					indx = j;
				}
			}
			if(s.charAt(1) == dom) {
				sum += d[indx];
			}
			else {
				sum += nd[indx];
			}
		}
		System.out.println(sum);
	}
}
