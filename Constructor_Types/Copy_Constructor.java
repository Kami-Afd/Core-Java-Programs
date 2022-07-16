package Constructor_Types;
class Copy{
    int a;
    String b;

    Copy()
    {
         a=20;
         b="Just Eidt";
         System.out.println(a+"  "+ b);
    }

    Copy(Copy ref)
    {
        a=ref.a;
        b=ref.b;
        System.out.println(a+"  "+ b);
    }

}
public class Copy_Constructor {
    public static void main(String[] args)
    {
        Copy c1=new Copy();
        Copy c2=new Copy(c1);
    }
}
