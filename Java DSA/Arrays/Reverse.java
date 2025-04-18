

public class Reverse {
    public static void main(String[] args) {
        Reverse r = new Reverse();
        int a[] = {1,2,3,4,5,6,7,8,9};
        int num[] = {10,3,2,6,4,2,8,9};
       r.printArray(reverse(a,0,6));
        r.printArray(reverse(num,0,num.length-1));
    }



    void printArray(int a[]){
        int n = a.length;
        for(int i=0;i<n;i++){
            System.out.print(a[i]+"  ");
        }
        System.out.println();
    }



    static int[] reverse(int a[],int start,int end){
        int temp;
        while(start<end){
            temp = a[start];
            a[start]= a[end];
            a[end] = temp;
            end--;
            start++;
        }
        return a;
    }
    
}
