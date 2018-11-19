import java.util.Scanner;

public class RadioCommercials {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numOfCommercials = scan.nextInt();
		int price = scan.nextInt();
		int[] commercials = new int[numOfCommercials];
		int i = 0;
		int max_so_far = 0;
		int max_ending_here = 0;
		while(i<commercials.length) {
			int x = scan.nextInt();
			commercials[i] = x;
			commercials[i] -= price;
			i++;
		}
		for(int j = 0; j<commercials.length; j++) {
			max_ending_here = max_ending_here + commercials[j];
			if(max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
			}
			if(max_ending_here < 0) {
				max_ending_here = 0;
			}
		}
		System.out.println(max_so_far);
		
	}
}
