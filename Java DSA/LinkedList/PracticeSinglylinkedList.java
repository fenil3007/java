import java.io.*;
import java.util.*;
import java.lang.*;

public class PracticeSinglylinkedList {
    private ListNode head;

    public static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void display(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
    }

    void findLength() {
        ListNode current = head;
        int len = 0;
        while (current != null) {
            len++;
            current = current.next;
        }
        System.out.println("\nthe length of this linked list is:" + len);
    }

    void insertNodeAtBegin(int data) {
        ListNode insert = new ListNode(data);
        insert.next = head;
        head = insert;
    }

    void insertNodeAtEnd(int data) {
        ListNode insert = new ListNode(data);
        if (head == null) {
            head = insert;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = insert;
    }

    void insertNodeInBetween(int data, int position) {
        ListNode insert = new ListNode(data);
        if (position == 1) {
            insert.next = head;
            head = insert;
        } else {
            ListNode previous = head;
            int i = 1;
            while (i < position - 1) {
                previous = previous.next;
                i++;
            }
            ListNode current = previous.next;
            insert.next = current;
            previous.next = insert;
        }
    }

    public ListNode deleteNodeAtBegin() {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public ListNode deleteNodeAtEnd() {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode previous = head;
        ListNode current = previous.next;
        while (current.next != null) {
            previous = previous.next;
            current = current.next;
        }
        previous.next = current.next;
        return previous;
    }

    void deleteNodeInBetween(int position) {
        if (position == 1) {
            head = head.next;
        } else {
            ListNode previous = head;
            ListNode current = previous.next;
            int i = 1;

            while (i < position - 1) {
                previous = previous.next;
                current = current.next;
                i++;
            }
            previous.next = current.next;

        }
    }

    Boolean searchElement(int element) {
        ListNode current = head;
        while (current != null) {
            if (current.data == element) {
                return true;
            }
            current = current.next;
        }
        return false;

    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public ListNode findNthFromEnd(int n) {
        if (head == null) {
            return null;
        }
        if (n <= 0) {
            throw new IllegalArgumentException("Invalid value: n =  " + n);
        }
        ListNode current = head;
        ListNode ptr2 = head;
        int i = 0;
        while (i < n) {
            if (ptr2 == null) {
                throw new IllegalArgumentException(n + "is greater than the number of nodes");
            }
            ptr2 = ptr2.next;
            i++;
        }
        while (ptr2 != null) {
            ptr2 = ptr2.next;
            current = current.next;
        }
        return current;
    }

 void removeDuplicates() {
        ListNode current = head;
        while(current!=null && current.next!=null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }
    }

    public ListNode insertInSortedLinkedList(int data){
        ListNode insert = new ListNode(data);
        if(head == null){
            return insert;
        }
        ListNode current = head;
        ListNode temp = null;
        if(current.data>insert.data){
            head = insert;
            insert.next = current;
        }
       else{
        while(current.data<insert.data&& current != null){
            temp = current;
            current = current.next;
    }
    insert.next =  current;
    temp.next = insert;
}
    return temp;
}

public void removeGivenKey(int key){
    if(head==null){
        System.out.println("no element in this linked list");
    }
    ListNode current = head;
    ListNode temp = null;
    if(current.data==key && current!=null){
         return;
    }
    else{
    while(current!=null && current.data !=key){
        temp =current;
        current = current.next;
    }
    

    if(current==null){
      return;
    }
    temp.next = current.next;
   
}
}

public Boolean isLoopDetected(){
    ListNode fastptr = head;
    ListNode slowptr = head;
    while(fastptr!=null && fastptr.next !=null){
        fastptr = fastptr.next.next;
        slowptr = slowptr.next;
        if(slowptr == fastptr){
            return true;
        }

    }
    return false;
}  
private ListNode getStartingNode(ListNode slowptr){
    ListNode temp = head;
    while(temp != slowptr){
        temp = temp.next;
        slowptr=slowptr.next;
    }
    return temp;

}
public ListNode LoopStartFrom(){
    ListNode fastptr = head;
    ListNode slowptr = head;
    while(fastptr!=null && fastptr.next !=null){
        fastptr = fastptr.next.next;
        slowptr = slowptr.next;
        if(slowptr == fastptr){
            return getStartingNode(slowptr);
        }

    }
    return null;
}   

    public static void main(String[] args) {
        PracticeSinglylinkedList sil = new PracticeSinglylinkedList();
        sil.head = new ListNode(10);
        ListNode second = new ListNode(15);
        ListNode third = new ListNode(15);
        ListNode fourth = new ListNode(25);
        ListNode fifth = new ListNode(30);
        sil.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third;
        // sil.insertNodeAtBegin(5);
        // sil.insertNodeAtEnd(30);
        // sil.insertNodeInBetween(12, 3);
        // sil.deleteNodeAtBegin();
        // sil.deleteNodeAtEnd();
        // sil.deleteNodeInBetween(2);
        // sil.display(sil.head);
        // sil.findLength();
        // System.out.println(sil.searchElement(20));
        // ListNode reversedlist = sil.reverseList(sil.head);
        // sil.display(reversedlist);
        // ListNode nthnodeFromend = sil.findNthFromEnd(1);
        // System.out.println("nth node from the end is:"+nthnodeFromend.data);

        
    //   sil.removeDuplicates();
    //   sil.insertInSortedLinkedList(11);
    //   sil.removeGivenKey(11);
    //   sil.removeGivenKey(15);
    //   sil.removeGivenKey(10);
    //   sil.insertInSortedLinkedList(12);
    //   sil.insertInSortedLinkedList(9);
    //   sil.removeGivenKey(7);
    //   sil.display();
      boolean a = sil.isLoopDetected();
      ListNode start = sil.LoopStartFrom();
      System.out.println("Is there any loop in the list?: "+a);
      System.out.println("The loop is starting from: "+start.data);
    }

}
