public class StringMethods {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String a = "fenil";
        String b = new String ("Fenil");
        System.out.println(a);
        System.out.println(b.length());
        System.out.println(b.toUpperCase());
        System.out.println(b.toLowerCase());
        System.out.println(b.trim());
        String trim = b.trim();
        System.out.println(trim.length());
        System.out.println(trim.substring(2, 5));
        System.out.println(a.replace('e', 'a'));
        System.out.println(a.replace("fenil", "Bhargavi"));

        System.out.println(a.startsWith("f"));
        System.out.println(a.endsWith("fenil"));

        System.out.println(a.indexOf("z"));
        System.out.println(a.indexOf("f",3));
        String modified= a.replace("fenil", "Bhargavi");
        System.out.println(modified.lastIndexOf("a",8));

        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));

        System.out.println("I am Escape Sequence \t double quote");
    }
    
}
