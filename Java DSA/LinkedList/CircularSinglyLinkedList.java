import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {
    private ListNode last;
    private int length;

    public static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public CircularSinglyLinkedList() {
        last = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void createCircularLinkedList() {

        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth;

    }

    public void display() {
        if (last == null) {
            return;
        }
        ListNode first = last.next;
        while (first != last) {
            System.out.print(first.data + " ");
            first = first.next;
        }
        System.out.print(first.data + " ");
    }

    public void insertAtBegin(int data) {
        ListNode insert = new ListNode(data);
        if (last == null) {
            last = insert;
        } else {
            insert.next = last.next;
        }
        last.next = insert;
        length++;
    }

    public void insertAtEnd(int data) {
        ListNode insert = new ListNode(data);

        if (last == null) {
            last = insert;
            last.next = last;
        } else {
            insert.next = last.next;
            last.next = insert;
            last = insert;

        }
        length++;
    }

    public int removeAtBegin() {
        if (last == null) {
            throw new NoSuchElementException();
        }
        ListNode temp = last.next;
        int res = temp.data;

        if (temp == last) {
            temp = last;
            last = null;
        }

        else {
            temp = last.next;
            last.next = temp.next;
        }
        length--;
        return res;
    }

    public ListNode removeAtEnd() {
        if (last == null) {
            throw new NoSuchElementException();
        }
        ListNode temp = last.next;
        if(temp.next==last){
             temp = last;
             last = null;
        }
        else{
            while(temp.next!=last){
                temp=temp.next;
            }
            temp.next = last.next;
           
        }
        length--;
        return last;

    }

    public static void main(String[] args) {
        CircularSinglyLinkedList cil = new CircularSinglyLinkedList();
        cil.createCircularLinkedList();
        cil.display();
        cil.insertAtBegin(0);
        System.out.println();
        cil.display();
        cil.insertAtEnd(5);
        System.out.println();
        cil.display();
        cil.insertAtEnd(5);
        System.out.println();
        cil.display();
        cil.insertAtEnd(5);
        System.out.println();
        cil.display();
        cil.insertAtEnd(8);
        System.out.println();
        cil.display();
        cil.insertAtEnd(7);
        System.out.println();
        cil.display();
        cil.insertAtEnd(9);
        System.out.println();
        cil.display();

        System.out.println("The last element of this list is:" + cil.last.data);

        cil.removeAtBegin();
        System.out.println();
        cil.display();

        cil.removeAtBegin();
        System.out.println();
        cil.display();
        cil.removeAtBegin();
        System.out.println();
        cil.display();
        cil.removeAtBegin();
        System.out.println();
        cil.display();
        cil.removeAtBegin();
        System.out.println();
        cil.display();
        cil.removeAtBegin();
        System.out.println();
        cil.display();
        cil.removeAtBegin();
        System.out.println();
        cil.display();
        cil.removeAtBegin();
        System.out.println();
        cil.display();

        cil.removeAtBegin();

        System.out.println();
        cil.display();

        cil.removeAtEnd();
        System.out.println();
        cil.display();

    }

}
