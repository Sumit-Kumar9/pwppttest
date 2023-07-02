//Write a Java program to print the Fibonacci series up to a given number using a for loop
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int a,b,c,t;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        a = sc.nextInt();
        System.out.print("Enter the second number :");
        b = sc.nextInt(); 
        System.out.print("Enter the term :");
        t = sc.nextInt();
        System.out.print(a+" "+ b+" ");
        for(int i=1;i<t-1;i++) 
        {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c+" ");
        }
    }
}
