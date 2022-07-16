package Constructor_Types.Supper_Keyword;

class A
{
    int a=10;
}

class B extends A
{
    int a=20;
    void Show()
    {
        System.out.println(a);
        System.out.println(super.a);
    }

    public static void main(String[] args)
    {
        B b1=new B();
        b1.Show();
    }
}