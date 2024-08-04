package java_DSA.Linked_list.single_linked_list;

class singleLinkedlist{
    Node head;

    public void insertAtLast(int data){
        Node node = new Node(data);

        if(head == null){
            head = node;
        }else{
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }

//remove duplicate from an list

    public void removeDuplicate(){
        Node itr = head;
        while (itr != null && itr.next != null) {
            int prev = itr.data;
            if (itr.next.data == prev){
                itr.next = itr.next.next;
            }
            itr = itr.next;
        }
    }



    public void printLinkedList(){
        Node n = head;
        while (n != null) {
            System.out.print(n.data + "-->");
            n = n.next;    
        }
        System.out.print("null");
        System.out.println();
    }

}

public class remove_duplicate_sorted_list {
    public static void main(String[] args) {
        singleLinkedlist sll = new singleLinkedlist();
        sll.insertAtLast(1);
        sll.insertAtLast(1);
        sll.insertAtLast(2);
        sll.insertAtLast(3);
        sll.insertAtLast(3);
        sll.insertAtLast(4);
        sll.insertAtLast(4); 

        sll.printLinkedList(); //1-->1-->2-->3-->3-->4-->4-->null


        //after removing duplicates

        sll.removeDuplicate();
        sll.printLinkedList();  //1-->2-->3-->4-->null
    }
}
