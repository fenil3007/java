
import java.util.Scanner;
public class Else_if {
    public static void main(String[] args) {
        int age ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your experinece:");
        System.out.println("enter Your age :");
        age = sc.nextInt();
          if (age>56){
            System.out.println("you are experienced!");

        }
        else if(age>46){
            System.out.println("you are semi-Experienced");
        }
        else {
            System.out.println("you are not experieneced.");
        }
    }
    
}
