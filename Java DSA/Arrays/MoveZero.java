public class MoveZero {
    public static void main(String[] args) {
        MoveZero m = new MoveZero();
        int a[]= {0,1,2,3,4,0,0,5};
       move0(a);
       m.printArray(a);
        
    }
    void printArray(int a[]){
        int n = a.length;
        for(int i=0;i<n;i++){
            System.out.print(a[i]+"  ");
        }
        System.out.println();
    }
    static void move0(int a[]){
        int n  = a.length;
        int j = 0;
        for(int i=0;i<n;i++){
            if(a[i]!=0 && a[j]==0){
               int temp = a[i];
                a[i]=a[j];
                a[j]=temp;
               
            }
            if(a[j]!=0){
                j++;
            }
        }
    }
    
}
