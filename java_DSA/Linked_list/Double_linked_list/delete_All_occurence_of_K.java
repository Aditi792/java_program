package java_DSA.Linked_list.Double_linked_list;

/*
 * You are given the head_ref of a doubly Linked List and a Key. Your task is to delete all occurrences of the given key if it is present and return the new DLL.

Example1:

Input: 
2<->2<->10<->8<->4<->2<->5<->2
2
Output: 
10<->8<->4<->5
Explanation: 
All Occurences of 2 have been deleted.

Example2:

Input: 
9<->1<->3<->4<->5<->1<->8<->4
9
Output: 
1<->3<->4<->5<->1<->8<->4
Explanation: 
All Occurences of 9 have been deleted.
 */

public class delete_All_occurence_of_K {
    static Node head;


    //TC - O(n) SC- O(1)
    public static Node deleteAll(Node head , int k){
        Node itr = head;
        while (itr != null) {
            if(itr.data == k){
                if(itr == head){    // if k is in head 
                    head = head.next;
                }else if(itr.next == null){  // if k is in last
                    itr.prev.next = itr.next;
                }else{
                    itr.prev.next = itr.next;
                    itr.next.prev = itr.prev;
                }
            }
            itr = itr.next;
        }
        return head;
    }



    public static void main(String[] args) {
        DoubleLinkedList DLL = new DoubleLinkedList();
        DLL.insertAtLast(10);
        DLL.insertAtLast(10);
        DLL.insertAtLast(5);
        DLL.insertAtLast(10);
        DLL.insertAtLast(6);
        DLL.insertAtLast(7);
        DLL.insertAtLast(10);
        DLL.insertAtLast(10);

        DLL.printDLL();       //10 --> 10 --> 5 --> 10 --> 6 --> 7 --> 10 --> 10 --> null

        DoubleLinkedList DLL1 = new DoubleLinkedList();
        DLL1.head = deleteAll(DLL.head, 10);
        DLL1.printDLL();      //5 --> 6 --> 7 --> null
    }
}
