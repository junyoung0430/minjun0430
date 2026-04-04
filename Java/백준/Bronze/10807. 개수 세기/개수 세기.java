import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i = 0; i<N; i++) {
			a[i] = sc.nextInt();
		}
		int b = sc.nextInt();
		int c = 0;
		for(int i=0; i<N; i++) {
			if(a[i]==b) {
				c++;
			}
		}
		System.out.println(c);

	}
}