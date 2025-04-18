import java.util.*;

public class NaturalSum {
    public static void main(String[] args) {
       
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter N to find sum of first n number:");
        // int n = sc.nextInt();
        double now = System.currentTimeMillis();
        Sum(5000);
        System.out.println("Time taken is:"+(System.currentTimeMillis() - now)+"mili seconds.");
        double now2 = System.currentTimeMillis();
        int ret = sum(5000);
        System.out.println("Sum is:"+ret);
        System.out.println("Time taken is:"+(System.currentTimeMillis() - now2)+"mili seconds.");

    }
    
    static void Sum(int n){
        int i=0;
        int sum = 0;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println("Sum of First  "+n+"  natural number is: "+sum);
    }
    // following function is better than the above one. because its take only O(1) time complexity to calculate the sum of first n natural numbers.//

    static int sum(int n){
        return n*(n+1)/2;
    }
    
}
