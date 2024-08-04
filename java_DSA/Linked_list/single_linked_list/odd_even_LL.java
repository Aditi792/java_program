package java_DSA.Linked_list.single_linked_list;

import java.util.ArrayList;
import java.util.List;

/*
 * Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
The first node is considered odd, and the second node is even, and so on.
Note that the relative order inside both the even and odd groups should remain as it was in the input.
You must solve the problem in O(1) extra space complexity and O(n) time complexity.

Example 1:

Input: head = [1,2,3,4,5]
Output: [1,3,5,2,4]

Example 2:

Input: head = [2,1,3,5,6,4,7]
Output: [2,3,6,7,1,5,4]
 */
public class odd_even_LL {
    static Node head;

    //in brute force we can do it using list . first store the data in the list in odd ,even manner.and then change the value of linked list with the list value. but for this TC-O(2n) ..
    //1st loop - getting the odd number from the LL and store it in list (array). TC- O(n/2)
    //2nd loop - getting the even number from the LL and store it in list (array).TC- O(n/2)
    //2rd loop - get the value from list and store it in LL . TC - O(n)
    //so total TC - O(2n) and SC - O(n)

    public static Node oddEvenBrute(Node head){
        List<Integer> list = new ArrayList<>();
        Node itr = head;
        while(itr != null && itr.next != null){
            list.add(itr.data);
            itr = itr.next.next;
        }
        itr = head.next;
        while(itr != null && itr.next != null){
            list.add(itr.data);
            itr = itr.next.next;
        }
        itr = head;
        int i = 0;
        while(itr != null && i<list.size()){
            itr.data = list.get(i);
            itr = itr.next;
            i++;
        }
        return head;
    }


//this is the optimal solution . TC- O(n) and SC - O(1)
    public static Node oddEvenLL(Node head){
        Node odd = head;
        Node even = head.next;
        Node evenHead = head.next;
        while(even != null && even.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
    
    public static void main(String[] args) {
        singleLinkedlist sll2 = new singleLinkedlist();
        sll2.insertAtLast(3);
        sll2.insertAtLast(5);
        sll2.insertAtLast(6);
        sll2.insertAtLast(7);
        sll2.insertAtLast(9);
        sll2.insertAtLast(10);

        sll2.printLinkedList();        //3-->5-->6-->7-->9-->10-->null

        singleLinkedlist sll = new singleLinkedlist();
        sll.head = oddEvenBrute(sll2.head);//3-->6-->9-->5-->7-->10-->null
        sll.head = oddEvenLL(sll2.head);
        sll.printLinkedList();  //3-->6-->9-->5-->7-->10-->null
    }
}
