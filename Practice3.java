//method(function) overloading

public class Practice3 {
    public static void main(String[] args) {
    Sum sum=new Sum();
       sum.Sum();
    }
}
    


class Sum{
     void Sum()
    {
        System.out.println("Enter any value:");

    }
    void Sum(int val1){
        System.out.println("The sum is:"+val1);
    }
    void Sum(int val1,int val2){
        System.out.println("the sum is:"+(val1+val2));
    }
}