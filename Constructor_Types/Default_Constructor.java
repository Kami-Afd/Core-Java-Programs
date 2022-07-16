package Constructor_Types;
class Default{
    int age;
    String name;
    Default()
    {
        age=20;
        name="Kamran";
    }
    void Myfun()
    {
        System.out.println("Hey My name is: "+name);
        System.out.print("and i am : "+age+" years Old!");
    }
}
public class Default_Constructor {

    public static void main(String[] args)
    {
        Default d1=new Default();
        d1.Myfun();
    }

}
