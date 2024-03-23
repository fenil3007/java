import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Want to check your position\n Enter your age below here:");
        age = sc.nextInt();

        switch(age){
            case 18:
                System.out.println("You are going to become an adult.");
                break;
            case 23:
                System.out.println("You are going to join job.");
                break;
            case 68:
                System.out.println("you are going to retirement.");
                break;
            default :
                System.out.println("Enjoy your life");
                break;
        }

        
    }
    
}
