package nyc.c4q.RosmaryFC;
public class DebuggingTest {

    public static void m1(){
        System.out.println("Method one - m1");
        m2();
    }

    public static void m2(){
        System.out.println("Method two - m2");

        int  x= 10;
        int y = 1;

        double z = x/y;

        if(y==5){
            System.out.println("y is 5");
        }

        System.out.println(z);
    }

    public static void main(String[] args) {
        System.out.println("Starting Main method");
        m1();
        System.out.println("End main method");
    }
}