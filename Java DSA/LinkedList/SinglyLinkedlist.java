++
mport java.util.*;
import java.util.LinkedList;

public class SinglyLinkedlist{
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data  = data;
            this.next=null;
        }
    }

    public ListNode addNodesBetweenZeroes(ListNode head){
        ListNode added = new ListNode(0);
     ListNode finall = added;
        ListNode temp = head.next;
        int sum = 0;
            while(temp!=null){
                if(temp.data!=0){
                    sum+=temp.data;
                    temp = temp.next;
                }
                else{
                    finall.next = new ListNode(sum);
                    finall = finall.next;
                    sum=0;
                    temp = temp.next;
                }
                
            }
        return added.next;
    }


    public void display(ListNode head){
        ListNode current = head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.print("null");
    }


    public void findLength(){
        ListNode current = head;
        int count = 0;
        while(current!=null){
            count++;
            current = current.next;
        }
        System.out.println("\nThe length of linked list is: "+count);
    }


    public void insertNodeAtBegin(int data){
        ListNode insert = new ListNode(data);
        insert.next = head;
        head = insert;

    }


    public void insertNodeAtEnd(int data){
        ListNode insert = new ListNode(data);
        if(head == null){
            head = insert;
        }
        ListNode current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next = insert;
    }


    public void insertNodeInBetween(int data,int position){
        ListNode insert = new ListNode(data);
        if(position == 1){
            insert.next =  head;
            head = insert;
        }
        else{
            ListNode previous = head;
            int count = 1;
            while(count<position-1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            insert.next = current;
            previous.next = insert;

        }
    }

    public void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static int[] findCriticalNodes(ListNode head){
        ListNode temp = head.next;
        int count = 2;
        List<Integer> cn = new ArrayList<>();
        while(temp.next!=null){
            if(temp.data>head.data && temp.data > temp.next.data || temp.data<head.data && temp.data<temp.next.data){
                cn.add(count);
            }
          temp = temp.next;
          head = head.next;
          count++;
        }
       int[] b = new int[2];     
         if(cn.size()>=2){
        b[1]=cn.get(cn.size()-1)-cn.get(0);
        int min = cn.get(1) - cn.get(0);
        for(int i=0;i<cn.size()-1;i++){
            if(cn.get(i+1)-cn.get(i)<min){
                min = cn.get(i+1)-cn.get(i);
                }   
                }
                b[0]=min;
                }   
       else{
        b[0]=-1;
        b[1]=-1;
       }
       return b;
    }

    public static int findTheWinner(int n,int k){
        ArrayList<Integer> b = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            b.add(i+1);
    }
    for(int i=0;i<n;i++){
        if(k>=n){
            k = k%n;
            }
            b.remove(k);
            k+=k;
            }
            return b.get(0);
            }

    

    public static void main(String[] args) {
        SinglyLinkedlist sl = new SinglyLinkedlist();
        sl.head = new ListNode(5);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(1);
        ListNode fourth =  new ListNode(2);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(1);
        ListNode seventh = new ListNode(2);
        sl.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = null;

    //    sl.display(sl.head);
    //    sl.findLength();
    //    ListNode result = sl.addNodesBetweenZeroes(sl.head);
    //    sl.display(result);

       int find[] = findCriticalNodes(sl.head);
       sl.printArray(find);


       System.out.println();
       System.out.println("And the winner is:"+findTheWinner(5, 2));
       

}
}