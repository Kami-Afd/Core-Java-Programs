package Operaters;

import java.util.Scanner;

class Calculater {

    public static  void main(String[] args)
    {
        int a,b,subt;

        char opr;

        System.out.print("Please Enter a number: ");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();

        System.out.print("Please Choose you Operator: ");
        Scanner s2=new Scanner(System.in);
        opr=s2.next().charAt(0);

        System.out.print("Please Enter a number: ");
        Scanner s1=new Scanner(System.in);
        b=s1.nextInt();
        subt=a-b;
        switch (opr) {
            case '+' -> System.out.print("Addition: " + a + b);
            case '-' -> System.out.print("Subtraction: " + subt);
            case '*' -> System.out.print("multiplication: " + a * b);
            case '/' -> System.out.print("Division: " + a / b);
            default -> System.out.print("Invalid Choice!");
        }
    }
}
