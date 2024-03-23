import java.util.Scanner;
public class Practiceset4 {
public static void main(String[] args) {
   
   //problem 1
    int a= 10;
        if(a == 11){
            System.out.println("I AM 11");
        }
        else{
            System.out.println("I am not 11");
        }
        
      // Problem 2
       Scanner sc = new Scanner(System.in);
      System.out.println("Enter your marks of physics:");
    byte m1 = sc.nextByte();
      System.out.println("Enter your marks of chemistry:");
      byte m2= sc.nextByte();
      System.out.println("Enter your maths marks:");
      byte m3= sc.nextByte();

    float avg= (m1+m2+m3)/3.0f;

      System.out.println("Your overall percentage is: "+ avg+"%.");

      if(avg>40 && m1>=33 && m2>=33 && m3>=33){
        System.out.println("Congratulations you have passed the exam.");
        
      }
      else{
        System.out.println("Sorry you have not been promoted you have to try again:");
      }


      // problem 3.

      float income_sal;
      float tax=0;
      System.out.println("Enter Your salary in lakhs");
      income_sal=sc.nextFloat();
      if(income_sal<2.5){
       
        System.out.println(tax);
      }

       else if(income_sal>2.5f && income_sal<5.0f){
        tax = tax + 0.05f*(income_sal - 2.5f);
        System.out.println(tax);
      }
     else if(income_sal>5f && income_sal<10f){
        tax = tax + 0.05f*(5.0f - 2.5f);
        tax=tax + 0.20f * (income_sal-5.0f );
        System.out.println(tax);
      }
      else {
        tax = tax + 0.05f * (5.0f - 2.5f);
        tax= tax + 0.20f * (10.0f - 7.5f);
        tax= tax + 0.30f * (income_sal-10.f);
        System.out.println(tax);
      }


// Question 4

 int day;
 System.out.println("Enter the number of day you want to find:");
 
 day = sc.nextInt();
  switch (day) {
    case 1 : System.out.println("Monday");
    break;
    case 2 : System.out.println("Tuesday");
    break;
    case 3 : System.out.println("Wednesday");
    break;
    case 4 : System.out.println("Thursday");
    break;
    case 5 : System.out.println("Friday");
    break;
    case 6 : System.out.println("Saturday");
    break;
    case 7 : System.out.println("Sunday");
    break;
    default : System.out.println("There is only 7 days in a week");
    break;

    
  

  }

  //problem 5 leap year or not.

  long year;
  System.out.println("Enter year to check whether the year is leap year or not.");
  year = sc.nextLong();

  if(year % 4==0 && ( year%100!=0 || year%400==0)){
    System.out.println("Leap year Found.");
  }
else{
    System.out.println("this is not leap year surely there is 365 days in this year");
}


//problem 6
 
String url;
System.out.println("enter Url:");
url = sc.next();
if(url.endsWith(".org")){
    System.out.println("Organizational website.");
}
else if (url.endsWith(".com")){
    System.out.println("Commercial Website.");
}
else if(url.endsWith(".in")){
    System.out.println("Indian  website.");
}
}
    }
