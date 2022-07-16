package My_Practice_Projects;

import java.util.Scanner;

class Arthematic {
    public static void main(String args[])
        {
            while(true)
            {
                float a,b,result;
                float n;
                System.out.println("\n\nPlease Choose your Operations!");
                System.out.println("--------------------------");
                System.out.println("Press 1 for Addition!");
                System.out.println("Press 2 for Subtraction!");
                System.out.println("Press 3 for Multiplication!");
                System.out.println("Press 4 for Division!");
                System.out.println("--------------------------\n>");
                Scanner s=new Scanner(System.in);
                n=s.nextFloat();
                if(n==1)
                {
                    System.out.println("YOU Choosed Addition!");
                    System.out.println("Please Enter 1st numbers: ");
                    Scanner n1=new Scanner(System.in);
                    a= n1.nextFloat();
                    System.out.println("Please Enter 2nd numbers: ");
                    Scanner n2=new Scanner(System.in);
                    b= n2.nextFloat();

                    result=a+b;
                    System.out.println("\nAddition is: "+result);
                }

                else if (n==2)
                {
                    System.out.println("YOU Choosed Subtraction!");
                    System.out.println("Please Enter 1st Number: ");
                    Scanner t1=new Scanner(System.in);
                    a=t1.nextFloat();
                    System.out.println("Please Enter 2nd Number: ");
                    Scanner t2=new Scanner(System.in);
                    b=t2.nextFloat();
                    result=a-b;
                    System.out.println("\nSubtraction is: "+result);
                }
                else if (n==3)
                {
                    System.out.println("YOU Choosed Multiplicaiton!");
                    System.out.println("Please Enter 1st Number: ");
                    Scanner u1=new Scanner(System.in);
                    a=u1.nextFloat();
                    System.out.println("Please Enter 2nd Number: ");
                    Scanner u2=new Scanner(System.in);
                    b=u2.nextFloat();
                    System.out.println("\nMultiplication: "+a*b);
                }
                else if (n==4)
                {
                    System.out.println("YOU Choosed Division!");
                    System.out.println("Please Enter 1st Number: ");
                    Scanner v1=new Scanner(System.in);
                    a=v1.nextFloat();
                    System.out.println("Please Enter 2nd Number: ");
                    Scanner v2=new Scanner(System.in);
                    b=v2.nextFloat();
                    if(a==0)
                    {
                        System.out.println("Division is: 0");
                    }
                    else if (b==0)
                    {
                        System.out.println("Division is: Undefine! Should be a>0!"
                        );
                    }
                    else
                    {
                        System.out.println("\nDivision is: "+a/b);
                    }

                }

                else
                {
                    System.out.println("Invalid Choice!");
                }

            }
        }
}
