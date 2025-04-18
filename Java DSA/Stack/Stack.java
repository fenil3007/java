import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class Stack{

    private ListNode top;
    private int length;

    public static class ListNode{
        private int data;
        private ListNode next;
        public  ListNode(int data){
            this.data = data;
            this.next =null;
        }
    }

    public void display(){
            ListNode current = top;
            while(current!=null){
                System.out.print(current.data+" ");
                current = current.next;
            }
            System.out.println();
        }
    public Stack(){
        top = null;
        length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    
    public void push(int data){
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }
    public int pop(){
       
        if(isEmpty()){
           throw new  EmptyStackException();
        }
            int result = top.data;
            top = top.next;
            length--;
        return result;
    }

    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.data;
    }

    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(15);
        s.push(15);
        s.push(20);
        s.display();
        System.out.println("The element at the peek is:"+s.peek());
        System.out.println("Poped element is:"+s.pop());
        s.display();
   
        System.out.println("The element at the peek is:"+s.peek());
        System.out.println("Poped element is:"+s.pop());
        
        s.display();
    
        System.out.println("The element at the peek is:"+s.peek());
        

    }
}