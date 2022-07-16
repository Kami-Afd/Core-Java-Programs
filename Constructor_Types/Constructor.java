package Constructor_Types;

// Default Constructor Example

class A
{
    int a; String b; boolean c;
    A()
    {
        a=20;
        b="Kamran";
        c=false;
    }

    void A_function()
    {
        System.out.println(a+" "+b+" "+c+" ");
    }
}


class Constructor
{
    public static void main(String[] args)
    {
        A a1=new A();
        a1.A_function();
    }
}