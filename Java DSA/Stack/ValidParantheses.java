import java.util.Stack;

public class ValidParantheses {
    
    public boolean validOrNot(String s){
        Stack<Character> st = new Stack<>();
        
        for(char c:s.toCharArray()){
            if(c == '{' || c== '[' || c=='('){
                st.push(c);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                else{
                    char top = st.peek();
                    if(c==')' && top == '(' || c=='}' && top == '{' || c==']' && c=='['){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
            }

        }
        return st.isEmpty();
    }
      
    public static void main(String[] args) {
        ValidParantheses v = new ValidParantheses();
        boolean r = v.validOrNot("[{()}]");
        System.out.println("Is given is valid parantheses or not:"+r);
    }
    
}
