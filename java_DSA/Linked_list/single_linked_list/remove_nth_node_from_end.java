package java_DSA.Linked_list.single_linked_list;

/*
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
Example 1:
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

Example 2:
Input: head = [1], n = 1
Output: []

Example 3:
Input: head = [1,2], n = 1
Output: [1]
 */

public class remove_nth_node_from_end {

    static Node head;

    //TC- O(2N)  as we use two loops using two pass solution. SC -O(1)
    public static Node removeNthNodeBrute(Node head,int n){
        if(head == null){
            return null;
        }
        Node temp = head;
        int count = 0;
        while(temp != null){    //count the no. of node in the linked list
            count++;
            temp = temp.next;
        }
        temp = head;
        int res = count - n ;  //Calculate the position of the node to delete

        if(count == n){       //for checking if no.of node are same as the delete node ,means 
            //if delete node is the head node then simply change the head. 
            head = head.next;
            return head;
        }

        while (temp != null) {   //Traverse to the node just before the one to delete 
            res--;
            if(res == 0){      //when we present just before the node then break the loop
                break;
            }
            temp = temp.next;           
        }
        temp.next = temp.next.next; //and set the next pointer to the next next node.
        return head;
    }


//this is th optimal solution as it is one pass solution . SC - O(1) ,TC - O(N) 
/*
 * in this case we use two pointer . 
 * first  - Move the fastptr pointer N nodes ahead .
 * second - Move both pointers until fastptr reaches the end.
 * if the fastptr becomes null.then slow pointer always point to the prev node of the deleted node
 * then delete the node by setting the slowptr next to the next next node.
 */
    public static Node removeNthNode(Node head,int n){
        Node fastptr = head;
        Node slowptr = head;

        for(int i = 0 ; i<n ;i++){  
            fastptr = fastptr.next;
        }

        if(fastptr == null){   //If fastptr becomes null, the Nth node from the end is the head
            head = head.next;
            return head;
        }

        while(fastptr.next != null){
            fastptr = fastptr.next;
            slowptr = slowptr.next;
        }
        slowptr.next = slowptr.next.next;
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
        sll.head = removeNthNodeBrute(sll2.head, 3);
        sll.printLinkedList();         //3-->5-->6-->9-->10-->null   delete 3rd node from the last.
    } 
}
