import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int[] b = new int[a];
		int c = 0;
		int[] d = new int[a];
		int e = 0;
		for(int i=0; i<a; i++) {
			b[i] = sc.nextInt();
			for(int j = 1; j<=b[i]; j++) {
				if(b[i] % j == 0 && b[i] != 1) {
					c++;
				}
				}
			d[i] = c;
			c = 0;
			}
	for(int i=0; i<a; i++) {
		if(d[i] == 2) {
			e++;
		}
	}
	System.out.print(e);
	}
}
