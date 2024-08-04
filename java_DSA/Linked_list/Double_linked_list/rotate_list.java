package java_DSA.Linked_list.Double_linked_list;

/*
 * Given the head of a linked list, rotate the list to the right by k places.

Example 1:
Input: head = [1,2,3,4,5], k = 2

rotate 1 : [5,1,2,3,4]
rotate 2 : [4,5,1,2,3]

Output: [4,5,1,2,3]

Example 2:
Input: head = [0,1,2], k = 4

rotate 1: [2,0,1]
rotate 2: [1,2,0]
rotate 3: [0,1,2]
rotate 2: [2,0,1]

Output: [2,0,1]
 */

public class rotate_list {

    //but it is inefficient if the k value is large so,we need to optimize it 
    //TC = O(n^2)  SC- O(1)
    public Node rotateRight(Node head, int k) {
        int i = 1 ;
        while(i <= k){
            if(head == null || head.next == null) return head;
            Node slow = head;
            Node fast = head.next;
            while(fast.next != null){
                slow = slow.next;
                fast = fast.next;
            }
            fast.next = head;
            head = fast;
            slow.next = null;
            i++;
        }
        return head;
    }


    //TC - O(n) SC- O(1)
    /*
     * Here's a more efficient approach:

        Compute the length of the list.
        Connect the tail to the head to form a circular list.
        Find the new tail and head.
        Break the circular link to form the new list.
     */

    public Node rotateRightOpt(Node head, int k) {
        if(head == null || head.next == null || k == 0) return head;

        Node itr = head;
        int len = 1;

        // Compute the length of the list
        while(itr.next != null){
            len++;
            itr = itr.next;   
        }
        Node tail = itr;  //detect the tail of the  list

        // Make the list circular
        tail.next = head;

        // Find the new tail: (length - k % length)th node
        // and the new head: (length - k % length)th node
        int newtailIndx = len - (k % len);
        Node newtail = head;
        for(int i = 1 ; i < newtailIndx ; i++){
            newtail = newtail.next;
        }
        Node newHead = newtail.next;

        //// Break the circular list
        newtail.next=null;

        return newHead;
    }



    public static void main(String[] args) {
        DoubleLinkedList DLL = new DoubleLinkedList();
        DLL.insertAtLast(1);
        DLL.insertAtLast(2);
        DLL.insertAtLast(3);
        DLL.insertAtLast(4);
        DLL.insertAtLast(5);
    }
}
