public class New1 {
    public static void main(String[] args) {
        Counter counter1=new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();

        counter1.x = 15;
        counter2.x = 20;
        counter3.x = 25;

        System.out.println("counter 1 instance variable: x=" + counter1.x);
        System.out.println("counter 2 instance variable: x=" + counter2.x);
        System.out.println("counter 3 instance variable: x=" + counter3.x);

        counter1.y=21;
        counter2.y=23;
        counter3.y =24;

        System.out.println("counter 1 instance variable: y=" + counter1.y);
        System.out.println("counter 2 instance variable: y=" + counter2.y);
        System.out.println("counter 3 instance variable: y=" + counter3.y);

        Counter.y = 34;

        System.out.println("Counter class static variable : Y = "+ Counter.y);
        System.out.println("counter 1 instance variable: k=" + counter1.k);
        System.out.println("counter 2 instance variable: k=" + counter2.k);
        System.out.println("counter 3 instance variable: k=" + counter3.k);

        counter1.m1();
        counter2.m1();
        counter3.m1();
     

        Counter.m2();

        




        
    }
    
}

class Counter{
    int x;
    static int y;
    final int k=10;

    public void m1(){
        System.out.println("m1 created");
    }
    public static void m2(){
        System.out.println("M2 called...");
    }
}
