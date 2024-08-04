package java_DSA.Linked_list.Double_linked_list;

/*
 * Given a sorted doubly linked list of positive distinct elements, the task is to find pairs in a doubly-linked list whose sum is equal to given value target.

Example 1:

Input:  
1 <-> 2 <-> 4 <-> 5 <-> 6 <-> 8 <-> 9
target = 7
Output: (1, 6), (2,5)
Explanation: We can see that there are two pairs 
(1, 6) and (2,5) with sum 7.
 
Example 2:

Input: 
1 <-> 5 <-> 6
target = 6
Output: (1,5)
Explanation: We can see that there is one pairs  (1, 5) with sum 6.

 */

import java.util.ArrayList;

public class find_pair_with_targetValue {
    
    static Node head;

    //TC - O(n) SC - O(1)
    public static ArrayList<ArrayList<Integer>> findPair(Node head , int target){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        Node itr = head;

        //find the right node of the linked list
        while(itr.next != null){
            itr = itr.next;
        }
        Node right = itr;
        Node left = head;

        //check for the target value with the sum of left and right
        while(left != right && left.prev != right){   //left <= right
            int sum = left.data + right.data;

            if(sum == target){
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(left.data);
                pair.add(right.data);
                list.add(pair);

                left = left.next;
                right = right.prev;
            }
            else if (sum > target) right = right.prev;
            else left = left.next;

        }
        return list;
    }


    //TC - O(n^2)  SC - O(1)
    public static ArrayList<ArrayList<Integer>> findPair2(Node head , int target){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        Node temp1 = head;
        while(temp1 != null && temp1.data <target){
            Node temp2 = temp1.next;
            while (temp2 != null) {
                int sum = temp1.data + temp2.data;
                if(sum == target){
                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(temp1.data);
                    pair.add(temp2.data);
                    list.add(pair);
                }
                else if(sum > target) break;
                temp2= temp2.next;
            }
            temp1  = temp1.next;
        }
        return list;
    }



    public static void main(String[] args) {
        DoubleLinkedList DLL = new DoubleLinkedList();
        DLL.insertAtLast(1);
        DLL.insertAtLast(2);
        DLL.insertAtLast(3);
        DLL.insertAtLast(4);
        DLL.insertAtLast(5);
        DLL.insertAtLast(6);
        DLL.insertAtLast(7);
        DLL.insertAtLast(10);

        DLL.printDLL();

        System.out.println(findPair(DLL.head, 6));
        //[[1, 5], [2, 4]]
    }
}
