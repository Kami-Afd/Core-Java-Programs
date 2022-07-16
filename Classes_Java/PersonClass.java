package Classes_Java;

public class PersonClass {

        String name="Kamran";
        int age=20;
        double weight=54.5;

        void talk()
        {
            System.out.print("I can talk.");
        }
        void eat()
        {
            System.out.print("I can eat.");
        }
        void sleep()
        {
            System.out.print("I can sleep.");
        }


        public static void main(String[] args)  //main method
        {
            PersonClass p1=new PersonClass();
            System.out.println("name: "+p1.name);
            System.out.println("age: "+p1.age);
            System.out.println("Weight: "+p1.weight);
            p1.talk();
            p1.sleep();
            p1.eat();

        }

}
