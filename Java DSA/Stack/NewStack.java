import java.util.Stack;

public class NewStack{
    public static int[] nextGreaterElement2(int a[]){
        int[] result2 = new int[a.length];
        Stack<Integer>  s = new Stack<>();
        for(int i = a.length-1;i>=0;i--){
            if(!s.isEmpty()){
                while(!s.isEmpty() && s.peek() <= a[i]){
                    s.pop();
                }
            }
            if(s.isEmpty()){
                result2[i] = -1;
            }
            else{
                result2[i] = s.peek();
            }
            s.push(a[i]);
        }
        return result2;
    }
    public void display(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        NewStack ng = new NewStack();
        int a[] = {1,4,7,3,4,8,1};
        ng.display(nextGreaterElement2(a));
        
    }
}
