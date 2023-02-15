import java.lang.*;
import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        System.out.print("Enter 2 numbers:");
        Scanner sc= new Scanner(System.in);
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        System.out.print("Enter the arithmetic operator : ");
        char op = sc.next().charAt(0);
        if (op =='+'){
            System.out.println(n1+n2);
        }
         else if (op=='-'){
            System.out.println(n1-n2);
        }
        else if(op=='*'){
            System.out.println(n1*n2);
        } 
        else if (op=='/'){
            System.out.println(n1/n2);
        }
        else if (op=='%'){
            System.out.println(n1%n2);
        }
        else 
        System.out.println("Invalid operator !");
    }
}
