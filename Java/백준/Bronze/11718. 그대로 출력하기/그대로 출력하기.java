import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<100; i++) {
			String a = sc.nextLine();
			System.out.println(a);
			
			if(!sc.hasNextLine()) {
				break;
			}
		}
	}
}
