package Flow_Control;

import java.util.Scanner;

public class GreaterNum {
    public static void main(String[] args)
    {
        int a,b,c;

        System.out.print("Please Enter any 3 number: ");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        System.out.print("YOU Entered!\n a="+a+"\tb="+b+"\tc="+c+"\n\n");
        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a+" is Greater");
            }
            else
            {
                System.out.println(c + " is Greater!");
            }
        }
        else
        {
            if(b>c)
            {
                System.out.print(b+" is Greater!");
            }
            else
            {
                System.out.print(c+" is Greater!");
            }
        }

    }
}
