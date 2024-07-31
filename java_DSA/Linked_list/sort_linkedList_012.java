package java_DSA.Linked_list;
/*
 * Given a linked list of N nodes where nodes can contain values 0s, 1s, and 2s only. The task is to segregate 0s, 1s, and 2s linked list such that all zeros segregate to head side, 2s at the end of the linked list, and 1s in the one of 0s and 2s.

Example 1:

Input:
N = 8
value[] = {1,2,2,1,2,0,2,2}
Output: 0 1 1 2 2 2 2 2
Explanation: All the 0s are segregated
to the left end of the linked list,
2s to the right end of the list, and
1s in between.

Example 2:

Input:
N = 4
value[] = {2,2,0,1}
Output: 0 1 2 2
Explanation: After arranging all the
0s,1s and 2s in the given format,
the output will be 0 1 2 2.
 */


public class sort_linkedList_012 {

    static Node head;

    //using one pass solution 
    public static Node segregate(Node head) {

        if(head == null || head.next == null) return head;

        Node dummy1 = new Node(-1);
        Node zero = dummy1;
        Node dummy2 = new Node(-1);
        Node one = dummy2;
        Node dummy3 = new Node(-1);
        Node two = dummy3;
        
        Node itr = head;
        
        while(itr != null){
            if(itr.data == 0){
                zero.next = itr;
                zero = zero.next;
            }
            else if(itr.data == 1){
                one.next = itr;
                one = one.next;
            }
            else{
                two.next = itr;
                two = two.next;
            }
            itr = itr.next;
        }
        two.next = null;
        one.next = dummy3.next;
        zero.next = dummy2.next;
        return dummy1.next;
    }



    //using two pass solution .
    public static Node segregateBrute (Node head) {
        if(head == null || head.next == null) return head;

        int count0 = 0, count1 = 0 , count2 = 0;
        Node itr = head;
        while(itr != null){
            if(itr.data == 0) count0++;
            else if (itr.data == 1) count1++;
            else count2++;
            
            itr = itr.next;
        }
        
        itr = head;
        
        while(itr != null){
            if(count0 != 0){
                itr.data = 0;
                count0--;
            }
            else if(count1 != 0){
                itr.data = 1;
                count1--;
            }
            else{
                itr.data = 2;
                count2--;
            }
            itr = itr.next;
        }
        return head;
    }



    public static void main(String[] args) {
        singleLinkedlist sll1 = new singleLinkedlist();
        sll1.insertAtLast(2);
        sll1.insertAtLast(1);
        sll1.insertAtLast(2);
        sll1.insertAtLast(1);
        sll1.insertAtLast(1);
        sll1.insertAtLast(0);

        sll1.printLinkedList();   //2-->1-->2-->1-->1-->0-->null

        singleLinkedlist sll = new singleLinkedlist();
        sll.head = segregate(sll1.head);     //0-->1-->1-->1-->2-->2-->null
        sll.printLinkedList();
    }
}
