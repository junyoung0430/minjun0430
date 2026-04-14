import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] b = new int[9];
		int c = 0;
		
		for(int i=0; i<9; i++) {
			b[i] = sc.nextInt();
			if(b[i] > c) {
				c = b[i];
			}
		}
		
		for(int i=0; i<9; i++) {
			if(c== b[i]) {
				System.out.println(c);
				System.out.println(i+1);
			}
		}
	}

}