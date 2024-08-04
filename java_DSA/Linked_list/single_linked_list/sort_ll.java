package java_DSA.Linked_list.single_linked_list;
/*
 * Given the head of a linked list, return the list after sorting it in ascending order.
 * 
Example 1:
Input: head = [4,2,1,3]
Output: [1,2,3,4]

Example 2:
Input: head = [-1,5,3,4,0]
Output: [-1,0,3,4,5]

Example 3:
Input: head = []
Output: []

we do it using divide and merge method.

also we can do it using a list.first store the element in the list then sort the list and put the sorted list value to the linked list.

but for this case SC will be O(n) , as we use a extra space to store the element in the list. TC - O(nlogn)

so to optimize this we use divide and conquer method and sort the linked list just like merge sort.
for this case SC- O(1) and TC - O(nlogn)
 */
public class sort_ll {
    static Node head;

    public static Node mergeSort(Node head){
        if(head == null || head.next == null) return head;

        Node mid = findMid(head);
        Node leftHead = head;
        Node rightHead = mid.next;
        mid.next = null;

        leftHead = mergeSort(leftHead);
        rightHead = mergeSort(rightHead);

        return merge(leftHead,rightHead);

    }


    //for find the mid od the list 
    public static Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }


    //for merge the list in sorted order.
    public static Node merge(Node list1, Node list2) {
        Node dummy = new Node(0);
        Node temp = dummy;
        while(list1 != null && list2 != null){
            if (list1.data <= list2.data){
                temp.next = list1;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        if(list1 != null){
            temp.next = list1;
        }else{
            temp.next = list2;
        }
        return dummy.next;
    }

    

    public static void main(String[] args) {
        singleLinkedlist sll1 = new singleLinkedlist();
        sll1.insertAtLast(35);
        sll1.insertAtLast(12);
        sll1.insertAtLast(24);
        sll1.insertAtLast(13);
        sll1.insertAtLast(56);
        sll1.insertAtLast(6);

        sll1.printLinkedList();

        singleLinkedlist sll = new singleLinkedlist();
        sll.head = mergeSort(sll1.head);
        sll.printLinkedList();

    }
}
