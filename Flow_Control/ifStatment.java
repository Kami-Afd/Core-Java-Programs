package Flow_Control;

import java.util.Scanner;
class ifStatment {
    public static void main(String arr[])
    {
        while (true)
        {
            int p=1122,pwd;
            System.out.println("Please Enter your Password: ");
            Scanner s=new Scanner(System.in);
            pwd=s.nextInt();
            if(pwd==p)
            {
                System.out.println("Access Successfully!");
            }
            else
            {
                System.out.println("Access Denied!");
            }
        }
    }
}
