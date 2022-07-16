package Loop;

import java.util.Scanner;

class for_loop {
    public static void main(String[] args)
    {
        int n;
        System.out.print("Enter a number: ");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(int i=1; i<=10; i++)
        {
            System.out.println(n+" X "+i+" = "+i*n);
        }
    }
}
