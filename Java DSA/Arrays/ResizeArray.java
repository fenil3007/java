

public class ResizeArray {
    public static void main(String[] args) {
        int a[] = {1,2,11,13,12,0};

    //     ResizeArray r = new ResizeArray();
    //     System.out.println("Original array:");
    //     r.printArray(a);
    //    int[] result = r.resize(a, a.length*2);
    //    System.out.println("resized array:");
    //    r.printArray(result);
    //    System.out.println("The size of an original array is:"+a.length);
    //    System.out.println("The size after resizing array is :"+result.length);

   System.out.println("There is 3 consecutive odds in array or not? "+consecutivethreeOdds(a));
        
    }
    public int[] resize(int[] a , int capacity){
        int temp[]  = new int[capacity];
        for(int i=0;i<a.length;i++){
            temp[i]=a[i];
        }
        a = temp;
        return a;
    }
    void printArray(int a[]){
        int n = a.length;
        for(int i=0;i<n;i++){
            System.out.print(a[i]+"  ");
        }
        System.out.println();
    }

    public static boolean consecutivethreeOdds(int a[]){
        int count = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
        for(int j=i+1;j<a.length;j++){
            if(a[j]%2!=0){
                count++;
                if(count==3){
                    break;
                    }
        }
        else{
            count=0;
            i=j+1;
        }
                
    }
}
if(count==3){
    return true;
}
 }
        return false;
    }

}
