package Constructor_Types.ConsTructor_Practice;

import java.util.Scanner;

public class Constrct_Main {
    public static void main(String[] args)
    {
        Student Stobject=new Student();
        String name;
        System.out.println("Enter your name: ");
        Scanner input=new Scanner(System.in);
        name=input.next().toString();
        System.out.println(name);



    }
}

class Student
{
    Student()
    {
        String intro="I m the Student of BsCs!";
    }
    static void introduce(String introduce)
    {
        System.out.println(introduce);
    }
}