package Constructor_Types.Supper_Keyword;

class First
{
    First()
    {
        int a=100;
    }
    void show(int First)
    {
        System.out.println(First);
    }
}

class Second extends First
{
    int a;
    void Show(int A)
    {
        System.out.println(A);
    }
}

public class SupperKeyword
{
    public static void main(String[] args) {
        Second b1=new Second();
        b1.Show(10);
    }
}
