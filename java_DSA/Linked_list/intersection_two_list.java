package java_DSA.Linked_list;

/*
 * Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.

For example, the following two linked lists begin to intersect at node c1:


The test cases are generated such that there are no cycles anywhere in the entire linked structure.

Note that the linked lists must retain their original structure after the function returns.

Example 1:

Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
Output: Intersected at '8'
Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).
From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5]. There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.
- Note that the intersected node's value is not 1 because the nodes with value 1 in A and B (2nd node in A and 3rd node in B) are different node references. In other words, they point to two different locations in memory, while the nodes with value 8 in A and B (3rd node in A and 4th node in B) point to the same location in memory.

Example 2:

Input: intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
Output: Intersected at '2'
Explanation: The intersected node's value is 2 (note that this must not be 0 if the two lists intersect).
From the head of A, it reads as [1,9,1,2,4]. From the head of B, it reads as [3,2,4]. There are 3 nodes before the intersected node in A; There are 1 node before the intersected node in B.

Example 3:

Input: intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
Output: No intersection
Explanation: From the head of A, it reads as [2,6,4]. From the head of B, it reads as [1,5]. Since the two lists do not intersect, intersectVal must be 0, while skipA and skipB can be arbitrary values.
Explanation: The two lists do not intersect, so return null.
 */
public class intersection_two_list {

    static Node head;
    public static Node intersectNode(Node headA , Node headB){
        if(headA == null || headB == null ) return null;

        Node t1 = headA;
        Node t2 = headB;

        while(t1 != t2){
            t1 = (t1 == null) ? headB : t1.next;
            t2 = (t2 == null) ? headA : t2.next;
        }
        return t2;
    }

    public static void main(String[] args) {

        singleLinkedlist sll1 = new singleLinkedlist();
        sll1.insertAtLast(2);
        sll1.insertAtLast(3);
        sll1.insertAtLast(4);
        sll1.insertAtLast(9); 
        sll1.printLinkedList();

        singleLinkedlist sll2 = new singleLinkedlist();
        sll2.insertAtLast(7);
        sll2.insertAtLast(5);
        sll2.insertAtLast(2);
        sll2.insertAtLast(2);
        sll2.insertAtLast(3);
        sll2.insertAtLast(4);
        sll2.insertAtLast(9); 
        sll2.printLinkedList();

        singleLinkedlist sll = new singleLinkedlist();
        sll.head = intersectNode(sll1.head, sll2.head);
        sll.printLinkedList();
    }
}
