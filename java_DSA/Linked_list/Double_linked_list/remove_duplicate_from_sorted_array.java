package java_DSA.Linked_list.Double_linked_list;
/*
 * Given a doubly linked list of n nodes sorted by values, the task is to remove duplicate nodes present in the linked list.

Example 1:

Input:
n = 6
1<->1<->1<->2<->3<->4
Output:
1<->2<->3<->4
Explanation:
Only the first occurance of node with value 1 is 
retained, rest nodes with value = 1 are deleted.

Example 2:

Input:
n = 7
1<->2<->2<->3<->3<->4<->4
Output:
1<->2<->3<->4
Explanation:
Only the first occurance of nodes with values 2,3 and 4 are 
retained, rest repeating nodes are deleted.
 */

public class remove_duplicate_from_sorted_array {

    public static Node removeDuplicates(Node head) {
        if (head == null)
            return head;
        Node i = head;
        Node j = head.next;
        while (j != null) {
            if (i.data == j.data) {
                if (j.next != null) {
                    // Removing the duplicate node j
                    i.next = j.next;
                    j.next.prev = i;
                } else {
                    // Removing the duplicate node j when j.next == null
                    i.next = j.next;
                }
            } else {
                // Move the pointer i to the next node only if no duplicate was found
                i = i.next;
            }
             // Move the pointer j to the next node in all cases
            j = j.next;
        }
        return head;
    }

    public static void main(String[] args) {
        DoubleLinkedList DLL = new DoubleLinkedList();
        DLL.insertAtLast(1);
        DLL.insertAtLast(2);
        DLL.insertAtLast(2);
        DLL.insertAtLast(4);
        DLL.insertAtLast(4);
        DLL.insertAtLast(7);
        DLL.insertAtLast(7);
        DLL.insertAtLast(7);

        DLL.printDLL();  //1 --> 2 --> 2 --> 4 --> 4 --> 7 --> 7 --> 7 --> null

        DoubleLinkedList DLL1 = new DoubleLinkedList();
        DLL1.head = removeDuplicates(DLL.head);
        DLL1.printDLL();  //1 --> 2 --> 4 --> 7 --> null

    }
}
