package Constructor_Types.Supper_Keyword.This_KeyWord;

class KeyWordThis
{
    int  a=10;
    KeyWordThis(int a)
    {
        a=0;
    }
    void Show(int a)
    {
        a=a;
        System.out.println(a);
    }
}

class thiskeyword
{
    public static void main(String[] args)
    {
        KeyWordThis k1=new KeyWordThis(100);
        System.out.print(" "+k1+" ");
        k1.Show(100);

    }
}