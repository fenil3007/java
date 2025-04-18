


public class MinimumInArray {
    public static void main(String[] args) {
        int a[] = {0,1,2,-1,1,-4,-5,-100,-101,101};
        System.out.println("Minimum in this array is:"+minimum(a));   
    }
 
static int minimum(int a[]){
    int min = a[0];
    for(int i=0;i<a.length-1;i++){
        if(a[i]<min){
            min = a[i];
        }
    }
    return min;
}
    
}
