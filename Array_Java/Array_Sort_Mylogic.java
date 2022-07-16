package Array_Java;

import java.util.Scanner;

public class Array_Sort_Mylogic {
    public static void main(String[] args)
    {
        int a[]=new int[5];
        int max[]=new int[5];

        System.out.println("Enter elements in array: ");
        Scanner s=new Scanner(System.in);

        for(int i=0; i<5; i++)
        {
            a[i]=s.nextInt();
        }

        System.out.println("Elements are: ");
        for(int j : a)
        {
            for(int i=0; i<5; i++)
            {
                j=max[i];
                int Mini=0;
                if(Mini<max[i])
                {
                    System.out.println(Mini);
                }
            }

        }
    }
}
