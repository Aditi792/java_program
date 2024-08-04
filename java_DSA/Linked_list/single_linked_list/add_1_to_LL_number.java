package java_DSA.Linked_list.single_linked_list;

/*
 * You are given a linked list where each element in the list is a node and have an integer data. You need to add 1 to the number formed by concatenating all the list node numbers together and return the head of the modified linked list. 

Note: The head represents the first element of the given array.

Examples :

Input: LinkedList: 4->5->6
Output: 457
Explanation: 4->5->6 represents 456 and when 1 is added it becomes 457.

Input: LinkedList: 1->2->3
Output: 124
Explanation:  1->2->3 represents 123 and when 1 is added it becomes 124. 
 */

public class add_1_to_LL_number{
    static Node head;
    //reverse the linked list
    //add 1 into it
    //reverse the linked list

    public static Node reverse(Node head){
        if(head == null || head.next == null) return head;
        
        Node prev = null;
        Node next = null;
        Node current = head;
        
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static Node addOne(Node head) {
        Node dummy = new Node(0);
        Node tail = dummy;
        Node reversehead = reverse(head);
        int carry = 1;
        Node itr = reversehead;
        while(itr != null){
            int sum = itr.data + carry;
            tail.next = new Node(sum % 10);
            carry = sum/10;
            tail = tail.next;
            itr = itr.next;
        }
        if (carry >=1){
            tail.next = new Node(carry);
        }
        Node head1 = reverse(dummy.next);
        return head1;
    }



    public static void main(String[] args) {
        singleLinkedlist sll1 = new singleLinkedlist();
        // sll1.insertAtLast(9);
        // sll1.insertAtLast(9);
        // sll1.insertAtLast(9);
        // sll1.insertAtLast(9);  ////9-->9-->9-->9-->null

        sll1.insertAtLast(2);
        sll1.insertAtLast(3);
        sll1.insertAtLast(4);
        sll1.insertAtLast(9);   //2-->3-->4-->9-->null

        sll1.printLinkedList();

        singleLinkedlist sll = new singleLinkedlist();
        sll.head = addOne(sll1.head);

        sll.printLinkedList(); //1-->0-->0-->0-->0-->null
        //2-->3-->5-->0-->null
    }
}