import java.util.Scanner;
public class Practice {

    static public void main(String[] args){

        Scanner input= new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String value=input.nextLine();

        System.out.println("Your Name is "+ value);
        input.close();
    }

    
}
