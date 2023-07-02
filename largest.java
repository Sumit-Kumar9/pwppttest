//Write a Java program to find the largest of three numbers using nested if-else statements.

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        int a,b,c,temp,largest;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of a:");
        a = sc.nextInt();
        System.out.print("Enter number of b:");
        b = sc.nextInt();
        System.out.print("Enter number of c:");
        c = sc.nextInt();
        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a+" is largest");
            }
        }
        else
        {
            if(b>a)
            {
                if(b>c)
                {
                    System.out.println(b+" is largest");
                }
            }
        }
        if(c>a)
        {
            if(c>b)
            {
                System.out.println(c+" is largest");
            }
        }
        /*temp = a > b ? a:b;
        largest = c > temp ? c:temp;
        System.out.println("The largest number is:"+largest);*/
    }
}
