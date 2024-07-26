package java_DSA.Linked_list;

/*
 * You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.
The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start using 0-based indexing, where ⌊x⌋ denotes the largest integer less than or equal to x.
For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2, respectively.
 

Example 1:

1-->2-->4-->[7]-->1-->2-->6

Input: head = [1,3,4,7,1,2,6]
Output: [1,3,4,1,2,6]
Explanation:
The above figure represents the given linked list. The indices of the nodes are written below.
Since n = 7, node 3 with value 7 is the middle node, which is marked in red.
We return the new list after removing this node.indexing start from 0.

Example 2:

1-->2-->[3]-->4

Input: head = [1,2,3,4]
Output: [1,2,4]
Explanation:
The above figure represents the given linked list.
For n = 4, node 2 with value 3 is the middle node, which is marked in red.

Example 3:

2-->[1]

Input: head = [2,1]
Output: [2]
Explanation:
The above figure represents the given linked list.
For n = 2, node 1 with value 1 is the middle node, which is marked in red.
Node 0 with value 2 is the only node remaining after removing node 1
 */

public class middle_node_delete {

    //extending tortoise method.
    //optimal solution with Tc - O(n) and SC-O(1)

    public static Node middleNodeDel(Node head){
        Node fast = head;
        Node slow = head;

        if(head == null || head.next == null){
            return null;
        }

        fast = fast.next.next;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        if(slow.next != null){
            slow.next = slow.next.next;
        }

        return head;
    }



    
    //brute force solution with two pass solution.total TC -O(n+n/2) , Sc-O(1) 

    public static int countLength(Node head){    //O(n)
        Node itr = head;
        int count = 0;
        while(itr != null){
            count++;
            itr = itr.next;
        }
        return count;
    }

    public static Node middleNode(Node head){   //O(n/2)
        Node current = head;
        int count = 1;
        int mid = (countLength(head) /2) + 1;
        while(current != null){
            if(count == (mid -1)){       
                current.next = current.next.next;
            }
            count++;
            current = current.next;
        }
        return head;
    }



    public static void main(String[] args) {
        singleLinkedlist sll1 = new singleLinkedlist();
        sll1.insertAtLast(3);
        sll1.insertAtLast(2);
        sll1.insertAtLast(4);
        sll1.insertAtLast(3);
        sll1.insertAtLast(5);
        sll1.insertAtLast(6);

        sll1.printLinkedList();

        sll1.head = middleNodeDel(sll1.head);
        sll1.printLinkedList();

        //sll1.head = middleNode(sll1.head);
        //sll1.printLinkedList();

        /*
         *  3-->2-->4-->3-->5-->6-->null
            3-->2-->4-->5-->6-->null
         */
    }
}
