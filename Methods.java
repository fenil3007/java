
public class Methods {
    public static void main(String[] args) {
        Methods method = new Methods();
    int a = 5;
    int b=7;
    int c;
    c= method.logic(a, b);
    System.out.println(c);
        int a2 =7;
        int b2=5;
        int c2;
        c2=method.logic(a2, b2);
        System.out.println(c2);
    }
    

       int logic(int x, int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)+5;
        }
       System.out.println(z);

       return z;
    }
}
