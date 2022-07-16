package My_Practice_Projects;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String arry[])
    {
        int a;
        System.out.println("Enter a number: ");
        Scanner s1=new Scanner(System.in);
        a=s1.nextInt();

        if(a%2==0)
        {
            System.out.println("Number is Even!");
        }
        else
        {
            System.out.println(a+" is Odd");
        }
    }
}
