import java.util.*;

public class Average {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int n = a.length;
        int sum = 0;
        int avg;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        avg = sum/n;
        System.out.println("average of"+n+"elements is:"+avg);
    }

    
}