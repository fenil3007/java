import java.util.Scanner;
public class Rock_Paper_scissors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome into the world of Rock Paper and scissors.\n");
        System.out.println("For this game you can choose as mention below:\n0: rock\n1: paper \n2: scissors.");

        byte ch1;
        byte ch2;

        System.out.println("enter choice of 1st player:");
        ch1=sc.nextByte();
        System.out.println("enter choice of 2nd player:");
        ch2=sc.nextByte();

        if(ch1==ch2){
            System.out.println("Match draw:");
        }

        else if ((ch1==0 && ch2 ==1)||(ch1==1 && ch2==2) || (ch1==2 && ch2==0))
{
    System.out.println("Player 2 win");
}
else if ((ch2==0 && ch1==1)||(ch2==1 && ch1==2) || (ch2==2 && ch1==0))
{
    System.out.println("Player 1 win");
}



    }
}