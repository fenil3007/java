import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * QueueIntro
 */
public class QueueIntro {
    private ListNode front;
    private ListNode rear;
    private int length;

    public static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }

    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void enQueue(int data){
        ListNode insert = new ListNode(data);
        if(isEmpty()){
            front = insert;
        }
        else{
            rear.next = insert;
        }
        rear = insert;
        length++;
    }

    public int dequeue(){
        int result = 0;
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        
           result = front.data;
           front=front.next;
           if(front==null){
            rear=null;
           }
           length--;
          return result;
    }
 public int first(){
    if(isEmpty()){
        throw new NoSuchElementException();
    }
    return front.data;

 }
 public int last(){
    if(isEmpty()){
        throw new NoSuchElementException();
    }
    return rear.data;
 }
    public void display(){
        int i=0;
        ListNode temp = front;
        while(i<length){
            System.out.print(temp.data+"-->");
            temp = temp.next;
            i++;
        }
        System.out.print("null");
        System.out.println();
    }

    public String[] generateBinary(int n){
        String[] res = new String[n];
        Queue<String> q = new LinkedList<>();
        q.offer("1") ;
        for(int i=0;i<n;i++){
            res[i]=q.poll();
            String str1 = res[i]+'0';
            String str2 = res[i]+'1';
            q.offer(str1);
            q.offer(str2);
        }
        return res;
    }

    public static void main(String[] args) {
        QueueIntro que = new QueueIntro();
        que.enQueue(14);
        que.enQueue(12);
        que.enQueue(12);
        que.enQueue(12);
        que.enQueue(12);
        que.display();

        System.out.println("The deleted element from the queue is:"+que.dequeue());

        System.out.println(" element at the front in this queue is:"+que.first()+" And the  elementat rear is the :"+que.last());

        System.out.println();
        System.out.println("the binary conversion from 1 to given number is: ");
        System.out.println();
        String result[] = que.generateBinary(10);
        for(int i=0;i<result.length;i++){
            System.out.print('"'+result[i]+'"'+" ");
            
        }
    }    
    }
    