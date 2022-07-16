package String_Java;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int n,rev=0,div;
        System.out.println("Please Enter a number to reverse: ");
        Scanner s1=new Scanner(System.in);
        n=s1.nextInt();

        for(int i=0; i<4; i++)
        {
            div=n%10;
            rev=rev*10+div;
            n=n/10;

        }
        System.out.println(rev);
    }
}
