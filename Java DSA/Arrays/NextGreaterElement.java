import java.util.Stack;


public class NextGreaterElement{

  
    public static int[] nextGreaterElement(int a[]){
        int[] result = new int[a.length];
        for(int i=0;i<a.length;i++){
            for(int j =i+1;j<a.length;j++){
                if(a[j]>a[i]){
                    result[i] = a[j];
                    break;
                }
             else{
                result[i]=-1;
             }   
            }
            result[a.length-1]=-1;
        }
        return result;
    }

    
    void printArray(int a[]){
        int n = a.length;
        for(int i=0;i<n;i++){
            System.out.print(a[i]+"  ");
        }
        System.out.println();
    }
  public static void main(String[] args) {
    NextGreaterElement ng = new NextGreaterElement();
    int a[] = {4,7,3,4,8,1};
    ng.printArray(nextGreaterElement(a));
    
  }

}
    

