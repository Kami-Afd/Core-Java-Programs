package Classes_Java;

import java.util.Scanner;

import static Classes_Java.Additems.ADDfunction;

public class MyApp {
    public static void main(String[] args) {
        Additems Additems = new Additems();

        int choice = 0;
        while (choice != 4) {
            System.out.println("Please Select Your Operation");
            System.out.println("-----------------------");
            System.out.println("Press 1 to ADD Item");
            System.out.println("Press 2 to Show Items");
            System.out.println("Press 3 to Delete Items ");
            System.out.println("Press 4 to Exit App ");
            System.out.println("Press 5 About MyApp ");
            System.out.println("-----------------------\n> ");
            //inputting Values from User
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();

            if (choice == 1) {
                ADDfunction();
            }
        }


    }
}