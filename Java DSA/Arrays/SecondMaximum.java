

public class SecondMaximum {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,6,5,4,6,5,4,5,7};
        System.out.println("Second maximum value in this array is:"+findSecondMax(a));
    }
    static int findSecondMax(int a[]){
        int n = a.length;
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                secondmax = max;
                max = a[i];
            }
            else if(a[i]>secondmax && a[i]!=max){
                secondmax = a[i];
            }
        }
        return secondmax; 

    }
    
}
