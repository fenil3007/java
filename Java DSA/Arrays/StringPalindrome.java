

public class StringPalindrome {
    public static void main(String[] args) {
        String name = "ThhT";
        
        System.out.println("IS  "+name+"   Palindrome?:  "+toCheckPalindrome(name));
        
    }
    static boolean toCheckPalindrome(String s){
        char c[] = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            if(c[start]!=c[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
}
