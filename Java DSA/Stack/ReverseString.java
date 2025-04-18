import java.util.Stack;

public class ReverseString {
    public static String revrse(String s){
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        for(char c:chars){
            stack.push(c);
        }
        for(int i = 0;i<s.length();i++){
            chars[i] = stack.pop();
        }
        return new String(chars);
        
    }
    public static int[] nextGreaterElement2(int a[]){
        int[] result2 = new int[a.length];
        Stack<Integer>  s = new Stack<>();
        for(int i = 0;i<a.length-1;i++){
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
    public static void main(String[] args) {
        String str = "My name is fenil italiya";
        System.out.println(revrse(str));

        
    }
   
    
}
