
public class MaxPQ {
    private Integer[] heap;
    private int n;

    public MaxPQ(int capacity){
        heap = new Integer[capacity+1];
        n=0;
    }
    public boolean isEmpty(){
        return n==0;
    }
    public int size(){
        return n;
    }
    public static void main(String[] args){
        MaxPQ m = new MaxPQ(3);
        System.out.println(m.size());
        System.out.println(m.isEmpty());
    }

    
}