public class MethodOverloading {
    // static void change(int a){
    //     a = 89;

    // }
    // static void change2(int arr[]){
    //     arr[0]=90;

    // }
    //    static void tellJoke(){
    //     System.out.println("GOod Morning");
    // }
    // public static void main(String[] args) {
    //     //tellJoke();
    //     int marks[] = {65,78,75,89,97};
    //     //int x =45;
    //     change2(marks);
    //     System.out.println("X after changing:"
    //     + marks[0]);
    // }



    static void just(){
        System.out.println("Good morning:");
    }
    static void just(String name){
        System.out.println("Good morning:"+name);
    } // parameters are which is passed as defiinition
    static void just(int a){
        System.out.println("I think you have entered:"+a);
    }
    public static void main(String[] args) {
        just();
        just("fenil");
        just(5);
        // arguments are actual
    }
}
