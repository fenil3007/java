// Cunstructor overloading

public class Practice2 {
    public static void main(String[] args) {
        Sum sum = new Sum(10,20);
    }
        }


class Sum{
    Sum()
    {
        System.out.println("Enter any value:");

    }
    Sum(int val1){
        System.out.println("The sum is:"+val1);
    }
    Sum(int val1,int val2){
        System.out.println("the sum is:"+(val1+val2));
    }
}