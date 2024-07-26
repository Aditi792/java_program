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

    //we do this in two steps . first TC is - O(n) and second is - O(n/2) , so overall TC - (n + n/2) .Sc- O(1).....so to optimized this we use tortoise method.
    public static int countLength(Node list1){
        Node itr = list1;
        int count =0;
        while(itr != null){
            count++;
            itr = itr.next;
        }
        return count;
    }
 
    // both the cases for odd and even no. off list ...the return list always return from the middle point + 1 node.
    public static Node middleNode(Node list1){
        Node current = list1;
        int count = 1;
        int mid = (countLength(list1) /2) +1;
        while(current != null){
            if(count == mid){       
                return current;
            }
            count++;
            current = current.next;
        }
        return current;
    }



    //Optimal solution 
    //Tortoise method & hare solution
    // for this we use slow and fast pointer approach.
    //SC - O(1)  TC - O(n/2)=O(n)

    public static Node middleNodeLL(Node head){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
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

        System.out.println();
        
        singleLinkedlist middSll2 = new singleLinkedlist();
        middSll2.head = middleNodeLL(sll1.head);
        middSll2.printLinkedList();  //3-->5-->6-->null
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
