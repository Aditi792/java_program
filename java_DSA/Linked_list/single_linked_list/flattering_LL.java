package java_DSA.Linked_list.single_linked_list;

/*
 * Given a Linked List, where every node represents a sub-linked-list and contains two pointers:
(i) a next pointer to the next node,
(ii) a bottom pointer to a linked list where this node is head.
Each of the sub-linked lists is in sorted order.
Flatten the Link List so all the nodes appear in a single level while maintaining the sorted order.

Note: The flattened list will be printed using the bottom pointer instead of the next pointer. Look at the printList() function in the driver code for more clarity.

Examples:

Input:

Output:  5-> 7-> 8- > 10 -> 19-> 20-> 22-> 28-> 30-> 35-> 40-> 45-> 50.
Explanation: The resultant linked lists has every node in a single level.(Note: | represents the bottom pointer.)

Input:
Output: 5-> 7-> 8-> 10-> 19-> 22-> 28-> 30-> 50
Explanation: The resultant linked lists has every node in a single level.(Note: | represents the bottom pointer.)
 */


class ListNode{
    int data;
    ListNode next;
    ListNode bottom;

    ListNode(int x){
        data = x;
        next = null;
        bottom = null;
    }
}


public class flattering_LL {

    ListNode flatten(ListNode root) {
        ListNode head = root;
        if(head == null || head.next == null) return head;
        
        ListNode newHead = flatten(head.next);
        head = merge(head,newHead);
        return head;
    }
    
    ListNode merge(ListNode list1,ListNode list2){
        ListNode dummy = new ListNode(0);
        ListNode itr = dummy;
        while(list1 != null && list2 != null)
        {
            if(list1.data < list2.data){
                itr.bottom = list1;
                itr = list1;
                list1 = list1.bottom;
            }else{
                itr.bottom = list2;
                itr = list2;
                list2 = list2.bottom;
            }
            itr.next = null;
        }
        
        if(list1 != null) itr.bottom = list1;
        else itr.bottom = list2;
        
        if (dummy.bottom != null) {
            dummy.bottom.next = null;
        }
        
        return dummy.next;
    }



    public static void main(String[] args) {
        
    }
}
