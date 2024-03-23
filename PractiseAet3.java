public class PractiseAet3 {
    public static void main(String[] args) {
        // problem 1 convert to lowercase;

        String name = "Fenil Italiya";
        name = name.toLowerCase();
        System.out.println(name);

        //problem 2 convert space with Underscore.

        System.out.println(name.replaceAll(" ", "_"));

        // problem 3 WAP to fill in a letter tamplate which looks like below:

        // letter = "dear <!name!> , thanks a lot"

        String letter = "Dear <|name|> , Thanks a Lot";
        System.out.println(letter.replace("<|name|>","fenil"));

        // Problem 4.

     String myString = " this String Contains   double and triple Spaces  ";
     System.out.println(myString.indexOf("  "));
     System.out.println(myString.indexOf("    "));

     // Problem 5.

     String letter2 = "Dear Fenil, This java Course is nice.\nThanks!";
     System.out.println(letter2);
     
    }


    
}
