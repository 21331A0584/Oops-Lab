import java.lang.*;
import java.util.*;
public class HelloUser {
        public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
		System.out.print("Enter username :");
		String name=sc.nextLine();
		System.out.println("Hello "+ name);
	}
}
