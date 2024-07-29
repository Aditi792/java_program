package java_DSA.Linked_list.Double_linked_list;

/*
 * Given a doubly linked list of n elements. Your task is to reverse the doubly linked list in-place.

Example 1:

Input:
LinkedList: 3 <--> 4 <--> 5
Output: 5 4 3
Example 2:

Input:
LinkedList: 75 <--> 122 <--> 59 <--> 196
Output: 196 59 122 75


 */
public class Reverse_DLL {
    static Node head;

    public static Node reverseDLL(Node head){

        if (head == null || head.next == null) {
            return head; 
        }

        Node current = head;
        Node last = null;
        while(current != null){
            last = current.prev;
            current.prev = current.next;
            current.next = last;
            current = current.prev;
        }
        return last.prev;
    }

    public static void main(String[] args) {
        DoubleLinkedList DLL = new DoubleLinkedList();
        DLL.insertAtLast(5);
        DLL.insertAtLast(6);
        DLL.insertAtLast(7);
        DLL.insertAtLast(10);

        DLL.printDLL();

        DoubleLinkedList RDLL = new DoubleLinkedList();
        RDLL.head= reverseDLL(DLL.head);
        RDLL.printDLL();
    }
}
