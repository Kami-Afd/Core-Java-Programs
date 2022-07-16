package Operaters;

import java.util.Scanner;

class TernaryOpr {
    public static void main(String[] args)
    {
        int a,b,c,result;
        System.out.print("Enter three numbers: ");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();

        result=(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.print("Greater is: "+result);



    }
}
