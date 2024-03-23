import java.util.Scanner;

 class Main {
    static public void main(String[] args){
        char operator;
        int number1,number2,result;

        Scanner input= new Scanner(System.in);

        System.out.println("Choose an operator: +,-,*,/,%");
        operator=input.next().charAt(0);

        System.out.println("Enter First Number:");
        number1 = input.nextInt();
        System.out.println("Enter Second Number:");
        number2 = input.nextInt();
        
        switch(operator){
            case'+':
            result=number1+number2;
            System.out.println(number1+" + "+number2+" = "+result);
            break;

            case'-':
            result=number1-number2;
            System.out.println(number1+" - "+number2+" = "+result);
            break;

            case'*':
            result=number1*number2;
            System.out.println(number1+" * "+number2+" = "+result);
            break;

            case'/':
            result=number1/number2;
            System.out.println(number1+" / "+number2+" = "+result);
            break;

            case'%':
            result=number1%number2;
            System.out.println(number1+" % "+number2+" = "+result);
            break;

            default:
            System.out.println("Invalid Operator");
            break;
        }
        input.close();


    }
    
}
