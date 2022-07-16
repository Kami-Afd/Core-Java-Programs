package Flow_Control;

import java.util.Scanner;

public class Votesystem {
    public static void main(String[] arr)
    {
        int age;
        String name;
        System.out.print("Enter your name: ");
        Scanner s=new Scanner(System.in);
        name=s.next().toString();
        System.out.print("Enter your Age: ");
        Scanner s2=new Scanner(System.in);
        age=s2.nextInt();

        if(age>100)
        {
            System.out.println("Invalid age!");
        }
        else
        {
            if(age>=18)
            {
                System.out.println("Dear "+name+" you can vote!");
            }
            else if(age<=18)
            {
                System.out.println("Dear "+name+" you are under 18!");
            }
            else
            {
                System.out.println("YOU CAN'T VOTE!");
            }
        }

    }
}
