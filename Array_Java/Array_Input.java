package Array_Java;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Input {
    public static void main(String[] args)
    {
        int a[]=new int[5];

        System.out.println("Enter elements in array: ");
        Scanner s=new Scanner(System.in);

        for(int i=0; i<5; i++)
        {
            a[i]=s.nextInt();
        }
        Arrays.sort(a); //this PreDefine Method Will Sort the Array in Accenting Order!
        System.out.println("Elements are: ");

        for(int j : a)
        {
            System.out.print(" "+j);
        }

    }
}
