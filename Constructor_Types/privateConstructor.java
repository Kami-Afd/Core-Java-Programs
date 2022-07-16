package Constructor_Types;

public class privateConstructor {
    int age; String name;
    private privateConstructor()
    {
        age=20;  name="Kamran";
        System.out.println(age+" "+name);
    }
    void Show()
    {

        System.out.println(age+" "+name);
    }

    public static void main(String[] args)
    {
        privateConstructor p1=new privateConstructor();
        p1.Show();
    }
}
