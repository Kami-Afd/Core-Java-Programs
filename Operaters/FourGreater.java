package Operaters;

import java.util.Scanner;

public class FourGreater {
    public static void main(String[] args)
    {
        int a,b,c,d;
        System.out.print("Enter any three numbers: ");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        d=s.nextInt();

        if(a>b)
        {
            if(a>c)
            {
                if(a>d)
                {
                    System.out.print("Greater is: "+a);
                }
                else
                {
                    System.out.print("Greater is: "+d);
                }
            }
            else if (d>a)
            {
                if(d>b)
                {
                    if(d>c)
                    {
                        System.out.print("Greater is: "+d);
                    }
                    else
                    {
                        System.out.print("Greater is: "+c);
                    }
                }
                else
                {
                    System.out.print("Greater is: "+b);
                }

            }
        }


        else
        {
            if(b>c)
            {
                if(b>d)
                {
                    System.out.print("Greater is: "+b);
                }
                else
                {
                    System.out.print("Greater is: "+d);
                }
            }
            else
            {
                if(c>d)
                {
                    System.out.print("Greater is: "+c);
                }
                else
                {
                    System.out.print("Greater is: "+d);
                }
            }
        }

    }
}
