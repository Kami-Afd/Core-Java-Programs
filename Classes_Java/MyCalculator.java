package Classes_Java;

import java.util.Scanner;

//Classes for Calculator for Different Functionality!
class Add
{
    void add(float a, float b)
    {
        float addition=a+b;
        System.out.println("Addition is: "+addition);
    }
}
class Subt
{
    void subt(float a,float b)
    {
        float Subtract=a-b;
        System.out.println("Subtraction is: "+Subtract);
    }
}
class Mult
{
    void mult(float a,float b)
    {

        System.out.println("Multiplication is: "+a*b);
    }
}
class Div
{
    void div(float a,float b)
    {
       if(a==0)
       {
           System.out.println("Division is: 0");
       }
       else if(b==0)
       {
           System.out.println("Division by 0 is Undefine!");
       }
       else
       {
           System.out.println("Divison is: "+a/b);
       }

    }
}

public class MyCalculator {
    public static void main(String[] args) {
        Add a1=new Add();
        Subt s1=new Subt();
        Mult m1=new Mult();
        Div d1=new Div();

        float a,b;
        char opr;


        System.out.println("Enter your First Number: ");
        Scanner n1=new Scanner(System.in);
        a=n1.nextFloat();

        System.out.println("Select your Arthematic Operator: ");
        Scanner Op=new Scanner(System.in);
        opr=Op.next().charAt(0);

        System.out.println("Enter your Second Number: ");
        Scanner n2=new Scanner(System.in);
        b=n2.nextFloat();

        switch(opr)
        {
            case '+': a1.add(a,b); break;
            case '-': s1.subt(a,b); break;
            case '*': m1.mult(a,b); break;
            case '/': d1.div(a,b); break;
            default:System.out.println("Invalid Choice");break;

        }
    }
}
