package Constructor_Types;

class Parameterize{

    Parameterize(int age,String name)
    {
        int Age=age;
        String Name=name;
    }

    void myfun(int Age,String Name)
    {
        System.out.println("My name is "+Name+".");
        System.out.print(" i am "+Age+" Years Old");
    }

}
public class Paramerterized_ConsTrunctor {
    public static void main(String[] args) {
        int age=20;
        String name="Kamran";
        Parameterize p1=new Parameterize(age,"name");

        p1.myfun(age, name);


    }
}
