package My_Practice_Projects;

import java.util.Scanner;

public class Input {
    public static void main(String args[])
    {
        /*int a,b,c;
        System.out.println("Enter any two number: ");
        Scanner f=new Scanner(System.in);

        a=f.nextInt();
        b=f.nextInt();
        c=a+b;
        System.out.println("Addition is: "+c);*/


        /*int a,b,result;
        System.out.println("Enter a number: ");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        System.out.println("Enter a number");
        Scanner s2=new Scanner(System.in);
        b=s2.nextInt();

        result=a+b;
        System.out.println("Addition is: "+result);*/


        int a,b;
        System.out.println("Enter the 1st number: ");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        System.out.println("Enter the 2nd number");
        Scanner s2=new Scanner(System.in);
        b=s2.nextInt();

        if (a>b)
        {
            System.out.println("a is Greater");
        }
        else
        {
            System.out.println("b is Greater!");
        }



    }
}


