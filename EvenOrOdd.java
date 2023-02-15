import java.util.*;
import java.lang.*;
public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        evenodd(num);
    }
    public static void evenodd(int num){
        if (num%2==0){
            System.out.println(num + " is even");
        }
        else {
            System.out.println(num + " is odd");
        }
    }
}
