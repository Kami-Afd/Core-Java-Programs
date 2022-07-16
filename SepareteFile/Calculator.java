package SepareteFile;


import SepareteFile.CalcuFunctions.Add;
import SepareteFile.CalcuFunctions.Div;
import SepareteFile.CalcuFunctions.Mult;
import SepareteFile.CalcuFunctions.Subt;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args)
    {
        Add a1=new Add();
        Subt s1=new Subt();
        Mult m1=new Mult();
        Div d1=new Div();

        float a,b;
        char opr;
        System.out.println("Enter your First Number: ");
        Scanner input1=new Scanner(System.in);
        a=input1.nextFloat();

        System.out.println("Enter your Operator + - * / : ");
        Scanner Opr=new Scanner(System.in);
        b=Opr.next().charAt(0);

        System.out.println("Enter your Second Number: ");
        Scanner input2=new Scanner(System.in);
        b=input2.nextFloat();


    }
}
