package Operaters;

import java.util.Scanner;

class Operator {
    public static void main(String[] args)
    {
        int a,b,result;
        char opr;
        System.out.println("Please Enter a number: ");
        Scanner s1=new Scanner(System.in);
        a=s1.nextInt();

        System.out.println("Please Choose Your Operator!\t + - * /: ");
        Scanner s3=new Scanner(System.in);
        opr=s3.next().charAt(0);

        System.out.println("Please Enter a number: ");
        Scanner s2=new Scanner(System.in);
        b=s2.nextInt();
        result=a+b;

        System.out.println("Addition: "+result);


    }
}
