package Java_Methods;

import java.util.Scanner;

public class Methods
{


    public static void main(String[] args)
    {
        /*Lets Create the object for The Methods
        ------------------------------*/
        Methods m1=new Methods();
        Methods m2=new Methods();
        Methods m3=new Methods();
        Methods m4=new Methods();
        Methods m5=new Methods();
        //--------------------------------


        float a,b;
        char Opr;

        System.out.print("Enter your First Number: ");
        Scanner s1=new Scanner(System.in);
        a=s1.nextFloat();

        System.out.print("Enter your Operator: ");
        Scanner Op=new Scanner(System.in);
        Opr=Op.next().charAt(0);

        System.out.print("Enter your Second Number: ");
        Scanner s2=new Scanner(System.in);
        b=s2.nextFloat();

        switch (Opr)
        {
            case '+' :  System.out.print("Addition is:"+ m1.Add(a, b)); break;
            case '-' :  System.out.print("Subtraction is:"+ m2.Subt(a, b)); break;
            case '*' :  System.out.print("Multiplication is:"+ m3.Mult(a, b)); break;
            case '/' :  System.out.print("Division is:"+ m4.Div(a, b)); break;
            case '%' :  System.out.print("Reminder is:"+ m5.Remind(a, b)); break;
            default: System.out.print("Invalid Choice!"); break;
        }

    }

    //Function/Methods for Calculator Functions!
    float Add(float a,float b)
    {
        return a+b;
    }

    float Subt(float a,float b)
    {
        return a-b;
    }

    float Mult(float a,float b)
    {
        return a*b;
    }

    float Div(float a,float b)
    {
        if(a==0)
        {
            System.out.print("Division is:  0");
        }
        else if (b==0)
        {
            System.out.print("Division is: Undefine! Division by Zero.");
        }
        else
        {
           return a/b;
        }
        return 0;
    }

    float Remind(float a,float b)
    {
        return a%b;
    }

}