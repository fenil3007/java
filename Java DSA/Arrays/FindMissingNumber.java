public class FindMissingNumber {
    public static void main(String[] args) {
        int a[]  = {2,4,5,6,3,8,7,9,1,10,12};
        System.out.println(findMissingNumber(a));
        int b[] = {1,2};
        System.out.println(findMissingNumber2(b));
        
    }
    static int findMissingNumber(int a[]){
        int n = a.length+1;
        int sum = (n)*(n+1)/2;
        int tempsum = 0;
        for(int i=0;i<a.length;i++){
            tempsum+=a[i];
        }
        return sum-tempsum;
        
    }
    static int findMissingNumber2(int a[]){
        int n = a.length+1;
        int sum = n*(n+1)/2;
        for(int i=0;i<a.length;i++){
            sum-=a[i];
        }
        return sum;

    }
    
}
