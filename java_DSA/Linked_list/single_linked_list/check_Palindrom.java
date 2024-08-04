package java_DSA.Linked_list.single_linked_list;

import java.util.Stack;

/*
 * Given the head of a singly linked list, return true if it is a 
palindrome
 or false otherwise.

Example 1:
Input: head = [1,2,2,1]
Output: true

Example 2:
Input: head = [1,2]
Output: false
 */

public class check_Palindrom{
    static Node head;

    //using stack to store the data.then check every element from stack same or not . SC-O(n) TC-O(2n)

    public static boolean revSLLStack(Node head){
        Stack<Integer> stack = new Stack<>();
        Node itr = head;
        while(itr!= null){
            stack.push(itr.data);
            itr = itr.next;
        }

        itr = head;
        while(itr != null){
            if(itr.data != stack.peek()){
                return false;
            }
            stack.pop();
            itr=itr.next;
        }

        return true;
    }

    //check palindrome or not. SC-O(1) TC-O(n)

    public static Node reverseLL(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node prevNode = null;
        Node nextNode = null;
        Node current = head;

        while(current != null){
            nextNode = current.next;
            current.next = prevNode;
            prevNode = current;
            current = nextNode;
        }
        return prevNode;
    }

    public static boolean checkPalindrom(Node head){
        if(head == null || head.next == null){
            return true;
        }
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        Node newHead = reverseLL(slow.next);
        Node second = newHead;
        Node first = head;
        while(second != null){
            if (first.data != second.data){
                reverseLL(newHead);
                return false;
            } 
            first = first.next;
            second = second.next;
        }
        reverseLL(newHead);
        return true;
    }



    public static void main(String[] args) {
    }
        
}