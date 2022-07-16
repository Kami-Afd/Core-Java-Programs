package My_Practice_Projects;

public class MyClock {
    public static void main(String[] args) {
        int sec=0,min=0,hrs=0;
        System.out.print("This is My Clock\n");
        System.out.print("-------------------\n");
        System.out.println("Sec :    Min :    hrs");

        for(int i=0; i<=1000; i++)
        {
            sec++;
            if(sec==60)
            {
                sec=0;
                min++;
                if(min==60)
                {
                    sec=0;
                    hrs++;

                    System.out.print(sec+" : "+min+" : "+hrs);

                }
            }
        }

    }
}
