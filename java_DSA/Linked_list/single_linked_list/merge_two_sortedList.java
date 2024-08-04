package java_DSA.Linked_list.single_linked_list;

//Tc - O(N) SC - O(1)

public class merge_two_sortedList {
    
    static Node head;

    public static Node mergeWithOutDummy(Node a ,Node b){
        Node head = null;           // we first declare the head as null
        if(a.data <= b.data){       //then check two list which first value is small,
            head = a;               //assign that value to head.
            a= a.next;
        }else{
            head = b;
            b = b.next;          //in this case we don't create any extra list.
        }
        Node tail = head;    //
        while(a != null && b != null){
            if(a.data <= b.data){
               tail.next = a;
                a = a.next;
            }else{
               tail.next = b;
                b= b.next;
            }
           tail =tail.next;
        }

        if(a == null){            //if two list is not in same length 
           tail.next = b;
        }else{
           tail.next = a;
        }
        return head;
    }



    public static Node merge(Node a ,Node b){
        Node dummy = new Node(0);    //here we use dummy node to avoid the error like null pointer exception
        //0-->
        Node tail = dummy;   //tail indicate the dummy node at first.
        
        //1-->2-->4-->7-->null
        //3-->5-->6-->8-->null
        //0-->1-->2-->3-->4-->5-->6-->7-->8-->null

        while(a != null && b != null){
            if(a.data <= b.data){
               tail.next = a;
                a = a.next;
            }else{
               tail.next = b;
                b= b.next;
            }
           tail =tail.next;
        }

        //1-->2-->4-->7-->null
        //3-->5-->null
        //1-->2-->3-->4-->5-->7-->null

        if(a == null){            //if two list is not in same length 
           tail.next = b;
        }else{
           tail.next = a;
        }
        return dummy.next; //ans would be from 1-->2-->3-->..... so it return dummy.next.... as it is start from 0.
    }

    public static void main(String[] args) {
        
        singleLinkedlist sll1 = new singleLinkedlist();
        sll1.insertAtLast(1);
        sll1.insertAtLast(2);
        sll1.insertAtLast(4);
        sll1.insertAtLast(8);

        singleLinkedlist sll2 = new singleLinkedlist();
        sll2.insertAtLast(3);
        sll2.insertAtLast(5);
        sll2.insertAtLast(6);
        sll2.insertAtLast(7);
        sll2.insertAtLast(9);
        sll2.insertAtLast(10);
        
        sll1.printLinkedList();  //1-->2-->4-->8-->null
        sll2.printLinkedList();  //3-->5-->7-->6-->9-->10-->null

        singleLinkedlist result = new singleLinkedlist();
        result.head = mergeWithOutDummy(sll1.head, sll2.head);
        //result.head = merge(sll1.head, sll2.head);
        result.printLinkedList();  //1-->2-->3-->4-->5-->6-->7-->8-->9-->10-->null

        
    }
}
