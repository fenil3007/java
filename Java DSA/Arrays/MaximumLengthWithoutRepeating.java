
// import java.util.*;
public class MaximumLengthWithoutRepeating {
    public static int returnMaxLength(String s){
        int length=1;
        int newlength=1;
       
        int size = s.length();
        char c[] = s.toCharArray();
        int i=0;
        int y = 0;
       while(i<size){
            for(int j=i+1;j<size;j++){
                for(int k=i;k<j;k++){
                    y=i;
                    if(c[j]==c[k]){
                        i++;
                        if(length>newlength){
                            newlength=length;
                            break;
                           }
                           else{
                            length=1;
                            break;
                           }
                    }
            }
            if(y==i){
            length++;
            }
            else{
                break;
            }
            
        }
    }
    return newlength;
}
    public static void main(String[] args) {
        int result=returnMaxLength("abac");
        System.out.println("the length without repeating is:"+result);
        
    }

    
}