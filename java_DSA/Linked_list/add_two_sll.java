package java_DSA.Linked_list;

/*
 * add two list value in reverse order . and add the sum in the new list in revers order. all the list contain a single digit number.
 * 
 * example 1 :
 * 
 * list1 : 1-->2-->8-->null
 * list2 : 9-->1-->2-->null
 * new list :  0-->4-->0-->1-->null
 * 
 * 821 + 219 = 1040
 */

public class add_two_sll {

    static Node head;
    
    public static Node addTwoLL(Node a , Node b){
        Node dummy = new Node(0);
        Node tail = dummy;
        int carry = 0;
        while(a != null || b != null){
            int x = ( a != null) ? a.data : 0;
            int y = (b != null) ? b.data : 0;
            int sum = carry + x + y;
            carry = sum / 10;               //calculate carry for the add it with the next sum.
            tail.next = new Node(sum %10);  //add the remainder as anode in the new list.
            tail = tail.next;           //new list point to the next node.
            if(a != null) a = a.next;  //if the first list is not null then go to the next node
            if(b != null) b = b.next;  //if the second list is not null then go to the next node
        }
        if(carry > 0) tail.next = new Node(carry);  // after sum if there present any carry then it will add it in last of the node.
        return dummy.next;
    }
    
    public static void main(String[] args) {
        
        singleLinkedlist sll1 = new singleLinkedlist();
        sll1.insertAtLast(3);
        sll1.insertAtLast(2);
        sll1.insertAtLast(4);

        singleLinkedlist sll2 = new singleLinkedlist();
        sll2.insertAtLast(3);
        sll2.insertAtLast(5);
        sll2.insertAtLast(6);
        //sll2.insertAtLast(7);
        sll2.insertAtLast(9);

        sll1.printLinkedList();
        sll2.printLinkedList();

        //3-->2-->4-->null    
        //3-->5-->6-->7-->null

        //423
        //7653 
        //+423
        //-----
        //8076  

        singleLinkedlist addSll = new singleLinkedlist();

        addSll.head = addTwoLL(sll1.head, sll2.head);
        addSll.printLinkedList();      // it will print the sum in reverse order

        //6-->7-->0-->8-->null

        /*
         * if the last value is 9 then it will print :
         * 
         *  3-->2-->4-->null
            3-->5-->6-->9-->null
            6-->7-->0-->0-->1-->null

            423 + 9653 = 10076 // add carry at the last node.
         * 
         */




    

    }
}
