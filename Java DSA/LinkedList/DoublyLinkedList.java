import java.util.List;
import java.util.NoSuchElementException;

import javafx.beans.binding.ListBinding;

public class DoublyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int length;

    public static class ListNode{
        private int data;
        private ListNode previous ;
         private ListNode next = null;
        
         public ListNode(int data){
            this.data = data;
        }

    }
    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    public boolean isEmpty(){
        return length ==0;
    }
    public int length(){
        return length;
    }

    void display(){
        ListNode current = head;
        while(current!=null){
          System.out.print(current.data+"==>");
          current = current.next;
        }
        System.out.print("null");
    }
    void display2(){
        if(tail==null){
            return;
        }
        ListNode temp = tail;
        while(temp!=null){
            System.out.print(temp.data+"==>");
            temp = temp.previous;
        }
        System.out.print("null");
    }

   void insertAtBegin(int data){
        ListNode insert = new ListNode(data);
        if(isEmpty()){
            tail = insert;
        }
        else{
            head.previous = insert;
        }
        insert.next = head;
        head = insert;
       length++;
    }
    void insertAtEnd(int data){
        ListNode insert = new ListNode(data);
        if(isEmpty()){
            head = insert;
        }
        else{
         tail.next = insert;
         insert.previous = tail;
        }
        tail = insert;
        length++;
    }

   public ListNode deleteAtBegin(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
       ListNode temp = head;
       if(head == tail){
        tail = null;
       }
       else{
        head.next.previous = null;
       }
       head = head.next;
       temp.next = null;
       length--;
       return temp;
    }
    public ListNode deleteAtEnd(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = tail;
        if(head==tail){
            head=null;
        }
        else{
            tail.previous.next = null;
        }
        tail = tail.previous;
        temp.previous = null;
        length--;

        return temp;

    }
        public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.insertAtBegin(5);
        dl.insertAtEnd(150);
        dl.insertAtEnd(1500);
        dl.insertAtEnd(15000);
        dl.insertAtEnd(150000);
        dl.insertAtEnd(150);
        dl.insertAtEnd(1500);
        dl.insertAtEnd(15000);
        dl.insertAtEnd(20);
        System.out.println();
        dl.display();
        System.out.println();
        dl.deleteAtBegin();
        System.out.println();
       dl.display();
       dl.deleteAtBegin();
       System.out.println();
       dl.display();
       System.out.println();
       dl.deleteAtEnd();
       dl.display();
       dl.deleteAtBegin();
       System.out.println();
       dl.display();
       

    }

    
    
}
