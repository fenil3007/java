public class StackWithArray {  
   private  int top;
    private int arr[];

   public StackWithArray(int capacity){
    top = -1;
    arr = new int[capacity];
   }
    public StackWithArray(){
        this(10);
    }
    public boolean isFull(){
        return top == arr.length-1;
    }
    public boolean isEmpty(){
        return top < 0;
    }
    public void display(){
        for(int i=0;i<=top;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void push(int data){
        if(isFull()){
            throw new RuntimeException("Stack is full");
        }
        top++;
        arr[top] = data;
    }

    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        int data = arr[top];
        top--;
        return data;
    }
    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");

        }
        return arr[top];
    }




    public static void main(String[] args) {
        StackWithArray s = new StackWithArray();
        s.push(15);
        s.push(10);
        s.push(15);
        s.push(10);
        s.push(15);
        s.push(10);
        s.push(15);
        s.push(10);
        s.push(15);
        s.push(10);
        s.display();
        System.out.println("poped item is:"+s.pop());
        System.out.println("poped item is:"+s.pop());

        System.out.println("poped item is:"+s.pop());

        System.out.println("poped item is:"+s.pop());

       s.display();
       System.out.println("peek is:"+s.peek());


    }
}
