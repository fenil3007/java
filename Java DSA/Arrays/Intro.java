

public class Intro {
    public static void main(String[] args) {
        Intro i = new Intro();
        int a[] = {1,2,3,4,5,6};
        int b[] = new int[5];
        b[0]= 1;
        b[1]= 2;
        b[2]= 3;
        b[3] =4;
        b[4] =5;
        b[2] = 10;
        i.printArray(a);
        i.printArray(b);
        int f[] = i.removeEven(b);
       i.printArray(f);
        
       }
    
    void printArray(int a[]){
        int n = a.length;
        for(int i=0;i<n;i++){
            System.out.print(a[i]+"  ");
        }
        System.out.println();
    }
    int[] removeEven(int a[]){
        int n = a.length;
        int oddcount = 0;
        for(int i=0;i<n;i++){
            if(a[i]%2!=0){
                oddcount++;
            }
        }
        int[]  result = new int[oddcount];
        int idx=0;
        for(int i=0;i<n;i++){
            if(a[i]%2!=0){
                result[idx]=a[i];
                idx++;
            }
        }
        return result;
    }

    
}