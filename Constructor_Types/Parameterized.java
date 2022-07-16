package Constructor_Types;

import java.util.Scanner;

class First
{
    int x,y;
    First(int a,int b)
    {
        x=a;
        y=b;
    }

    void A_Function(int x,int y)
    {
        System.out.println("x="+ x+" y="+y);
    }
}

public class Parameterized
{
    public static void main(String[] args)
    {
        int a,b;
        System.out.print("Enter any two numbers:");
        Scanner s1=new Scanner(System.in);
        a=s1.nextInt();
        b=s1.nextInt();
        First f1=new First(a,b);
        f1.A_Function(a,b);

    }
}
