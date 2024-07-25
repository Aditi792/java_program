package java_DSA.Linked_list;

/*
 * Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.

Example 1:

1-->2-->3-->4-->5

Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.

Example 2:

1-->2-->3-->4-->5-->6

Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.

 */

public class middle_node_ll {

    static Node head;

    public static int countLength(Node list1){
        Node itr = list1;
        int count =1;
        while(itr.next != null){
            count++;
            itr = itr.next;
        }
        return count;
    }
 
    // both the cases for odd and even no. off list ...the return list always return from the middle point + 1node.
    public static Node middleNode(Node list1){
        Node current = list1;
        int count = 1;
        while(current != null){
            if(count == ((countLength(list1) /2) +1)){       
                return current;
            }
            count++;
            current = current.next;
        }
        return current;
    }

    public static void main(String[] args) {
        singleLinkedlist sll1 = new singleLinkedlist();
        sll1.insertAtLast(3);
        sll1.insertAtLast(2);
        sll1.insertAtLast(4);
        sll1.insertAtLast(3);
        sll1.insertAtLast(5);
        sll1.insertAtLast(6);

        singleLinkedlist sll2 = new singleLinkedlist();
        sll2.insertAtLast(3);
        sll2.insertAtLast(5);
        sll2.insertAtLast(6);
        sll2.insertAtLast(7);
        sll2.insertAtLast(9);

        sll1.printLinkedList();

        singleLinkedlist middSll = new singleLinkedlist();
        int count = countLength(sll1.head);
        System.out.println(count);
        middSll.head = middleNode(sll1.head);
        middSll.printLinkedList();

        System.out.println();
        sll2.printLinkedList();

        singleLinkedlist middSll1 = new singleLinkedlist();
        int count1 = countLength(sll2.head);
        System.out.println(count1);
        middSll1.head = middleNode(sll2.head);
        middSll1.printLinkedList();
    }
}

/*
 * 3-->2-->4-->3-->5-->6-->null
6
3-->5-->6-->null

3-->5-->6-->7-->9-->null
5
6-->7-->9-->null
 */
