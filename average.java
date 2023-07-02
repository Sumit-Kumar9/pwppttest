// Write a Java program to calculate the average of a list of numbers using a do-while loop

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        int i = 0;
        float sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of list :");
        int n = sc.nextInt();
        float arr[] = new float[n];
        System.out.print("Enter"+" "+n+" "+"list elements:");
        do
        {
           arr[i] = sc.nextInt();
           sum = sum + arr[i];
           i++;
        }
        while(i<n);
        float average = sum/n;
        System.out.println("Average of number is :"+average);
    }
}
