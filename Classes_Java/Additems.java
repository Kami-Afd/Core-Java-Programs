package Classes_Java;

import javax.swing.text.Element;
import java.util.Scanner;

public class Additems
{
    static String[] a1 =new String[20];
    static String[] a2 =new String[20];
    static String[] a3 =new String[20];

    static void ADDfunction()
    {
        int Choice;
        System.out.println("How Many items you want to Add: ");
        Scanner input=new Scanner(System.in);
        Choice=input.nextInt();
        System.out.println("Kindly Add Your Items: ");
        Scanner input1=new Scanner(System.in);

        for(int i=0; i<Choice; i++)
        {
            a1[i]=input1.next().toString();
        }


    }


}

