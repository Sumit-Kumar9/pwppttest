//. Write a Java program to check whether a given number is positive, negative, or zero using an if-else statement.

import java.util.Scanner;

public class posAnsNeg
{
   public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number :");
        n = sc.nextInt();
        if(n>0)
        {
            System.out.println("Number is positive");
        }
        else
        {
            System.out.println("Number is negative");
        }
        if(n==0)
        {
            System.out.println("Number is zero");
        }

    }
}