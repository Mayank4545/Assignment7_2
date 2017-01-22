import java.util.Scanner;

public class FindSubstring {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter String:");
		String s1 = s.next();
		System.out.println("Enter sub string:");
		String s2 = s.next();
		
		boolean r = s1.contains(s2); /* Considering the case */
		
		if (r) { /* True */
			System.out.println("found");
		}else{  /* False */
			System.out.println("Not Found");
		}
	}
}
