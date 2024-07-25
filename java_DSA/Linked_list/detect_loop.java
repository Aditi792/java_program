package java_DSA.Linked_list;

//TC - O(N)  SC - O(1)

public class detect_loop {

    static Node head;

    //detect loop follow floyd's cycle detection algorithm

    //detect Loop in a linked list
    public static boolean detectLoop(){
        Node fastPtr = head;
        Node slowPtr = head;
        while(fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(fastPtr == slowPtr) {
                getStartLoop(slowPtr);   // this is for getting the starting node . to get the start node we first need to detect the loop.
                return true;
            }
        }
        return false;
    }


    //getting the staring node of the loop
    public static void getStartLoop(Node slowPtr){
        Node temp = head;   //assign fasptr as the head of the list
        while(temp != slowPtr){
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        System.out.println("Starting Node is : " + temp.data);
    }


    /*
        also we can write it like this .

     * public ListNode detectStartPointInCycle(ListNode head) {
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while(fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(fastPtr == slowPtr){
                fastPtr = head;
                while(fastPtr != slowPtr){
                    fastPtr = fastPtr.next;
                    slowPtr = slowPtr.next;
                }
                return fastPtr;
            }
        }
        return null;
    }
     */

     //within a function.
     public static int countNodesinLoop()
    {
        Node fast = head;
        Node slow = head;
        int count = 1;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){    // detect loop
                fast = head;
                while(fast != slow){  //starting point
                    fast = fast.next;
                    slow=slow.next;
                }                     // if starting point found
                Node temp = slow.next;  // assign a temp node to "slow node's next" node.if we assign "slow node as temp node" then in the first iteration it will return. so use slow.next.
                while(temp != slow){
                    count++;
                    temp = temp.next;
                }
                return count;
            }
        }
        return 0;
    }


    //remove loop in the linked list.
    //remove th loop from the linked list we first need to detect the loop.

    public static void detectLoopToRemove(){
        Node fastptr = head;
        Node slowPtr = head;
        while(fastptr != null && fastptr.next != null){
            fastptr = fastptr.next.next;
            slowPtr = slowPtr.next;
            if(fastptr == slowPtr){
                removeLoop(slowPtr);
                return;
            }
        }
    }

    public static void removeLoop(Node slowPtr){
        Node temp = head;
        while(temp.next != slowPtr.next){   //here we check the next node is same or not.if same then assign slowptr next to null.
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        slowPtr.next = null;
    }


    //create a looped linked list 
    public static void createLoopLL(){
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth= new Node(5);
        Node sixth = new Node(6);   //1->2->3->4->5->6->3

        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;  // contain loop as sixth node next point to the third node
    }


    public static void main(String[] args) {

        createLoopLL();
        
        if(detectLoop()) System.out.println("Linked List contain Loop"); 
        else System.out.println("No loop in Linked list");

        System.out.println("No. of node in loop is : " + countNodesinLoop());;

    //after this output is : 
        //Starting Node is : 3
        //Linked List contain Loop
        //No. of node in loop is : 4

        detectLoopToRemove();

        if(detectLoop()) System.out.println("Linked List contain Loop"); 
        else System.out.println("No loop in Linked list");


        System.out.println("No. of node in loop is : " + countNodesinLoop());
    }

    //after the second part code run the output is :
        // Starting Node is : 3
        // Linked List contain Loop
        ////No. of node in loop is : 4
        // No loop in Linked list
        ////No. of node in loop is : 0

}
