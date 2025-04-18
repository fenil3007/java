import java.text.ParseException;

public class Practice {
    private ListNode head;

    public static class ListNode{
        private int data;
        private ListNode next;
        
        public ListNode(int data){
            this.data= data;
            this.next = null;

        }

     }
     void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
    }

     public Boolean isLoopContain(){
        ListNode ptr1 = head;
        ListNode ptr2 = head;
        while(ptr1!=null && ptr1.next != null){
            ptr1=ptr1.next.next;
            ptr2 = ptr2.next;
            if(ptr1==ptr2){
                return true;
            }
        }
        return false;
        
     }

     public ListNode LoopStartingFrom(){
        ListNode ptr1 = head;
        ListNode ptr2= head;

        while(ptr1 != null && ptr1.next!=null){
            ptr1 = ptr1.next.next;
            ptr2 = ptr2.next;
            if(ptr1==ptr2){
                return startingOfLoop(ptr2);
            }
        }
        return null;
     }
 public ListNode startingOfLoop(ListNode ptr){
    ListNode temp = head;
    while(temp != ptr){
        temp = temp.next;
        ptr = ptr.next;
    }
    return temp;
 }

 public void detectAndRemoveLoop(){
    ListNode current = head;
    ListNode ptr1 = head;
    ListNode ptr2= head;
    ListNode temp = null;

        while(ptr1 != null && ptr1.next!=null){
            ptr1 = ptr1.next.next;
            ptr2 = ptr2.next;
            if(ptr1==ptr2){
              removeLoop(ptr2);
              return;
            }  
           
        }
       
 }

 public void removeLoop(ListNode ptr){
    ListNode temp = head;
    while(ptr.next != temp.next){
        temp = temp.next;
        ptr=ptr.next;
    }
    ptr.next = null;
 }

 public static ListNode mergedSortedList(ListNode ptr1,ListNode ptr2){
    ListNode merged = new ListNode(0);
    ListNode temp = merged;
    while(ptr1!=null && ptr2!=null){
        if(ptr1.data<=ptr2.data){
            temp.next = ptr1;
            ptr1 = ptr1.next;
        }
        else{ 
            temp.next = ptr2;
            ptr2 = ptr2.next;
        }
        temp = temp.next;
    }
    if(ptr1==null){
        temp.next = ptr2;
    }
    else{
        temp.next = ptr1;
    }
    return merged.next;
 }


 public static ListNode addTwoSinglyLinkedList(ListNode ptr1, ListNode ptr2){

    ListNode dummy = new ListNode(0);
     ListNode tempsum = dummy;
     int carry = 0;
    

    while(ptr1 != null || ptr2 != null ){
        int x = (ptr1 != null) ? ptr1.data:0;
        int y = (ptr2 != null) ? ptr2.data:0;
        int sum = x+y+carry;
        carry = sum/10;
        tempsum.next = new ListNode(sum%10);
        tempsum = tempsum.next;
        if(ptr1!=null){
            ptr1=ptr1.next;
        }
        if(ptr2!=null){
            ptr2 = ptr2.next;
        }
        
 }
 if(carry > 0){
    tempsum.next = new ListNode(carry);
 }
 return dummy.next;
}
     public static void main(String[] args) {
        Practice p = new Practice();
        Practice p2 = new Practice();
        Practice p1 = new Practice();
        p1.head = new ListNode(1);
        ListNode second1 = new ListNode(2);
        ListNode third1 =  new ListNode(3);
        p1.head.next = second1;
         second1.next = third1;
         third1.next = null;
        p.head = new ListNode(5);
        ListNode second = new ListNode(6);
        ListNode third =  new ListNode(7);
        // ListNode fourth =  new ListNode(3);
        // ListNode fifth =  new ListNode(3);
    
         p.head.next = second;
         second.next = third;
         third.next = null;
        //  fourth.next = fifth;
        //  fifth.next = null;
         

         p2.head = new ListNode(1);
         ListNode snd = new ListNode(2);
         ListNode trd = new ListNode(3);
        //  ListNode frth = new ListNode(4);
        //  ListNode fift = new ListNode(5);

         p2.head.next = snd;
         snd.next = trd;
         trd.next = null;
        //  frth.next = fift;
        //  fift.next  = null;

        

        //  boolean a = p.isLoopContain();
        //  System.out.println("IS there any loop in this list?: "+a);
        //  ListNode result = p.LoopStartingFrom();
        //  System.out.println("The loop is starting from: "+result.data);
        //  p.detectAndRemoveLoop();
        //  p.display(p.head);
        System.out.println("\np is: ");
        p.display();
        System.out.println("\np2 is");
        p2.display();
        System.out.println("\np1 is:");
        // p1.display();
        // System.out.println("\nafter adding p and p2 is:");

        // Practice final2 = new Practice();
        // final2.head = mergedSortedList(p2.head, p.head); 
        // final2.display();
        // System.out.println();
        // p2.display();
        // System.out.println();
        // p.display();
        // System.out.println();
        Practice p3 = new Practice();
        p3.head = addTwoSinglyLinkedList(p.head,p2.head);
        p3.display();
     }


    
}
