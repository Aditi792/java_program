package java_DSA.Linked_list;

public class insert_node_sorted_ll {
    static Node head;

    public static void insertAtLast(int data){
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

    //insert node in a sorted linked list
    
    public static void insertNodeLL(int data){
        Node node = new Node(data);
        Node current = head;
        Node temp = null; // for storing previous node 
        while(current != null && current.data < data ){
            temp = current;  //assigning current node to temp
            current = current.next; //going forward
        }
        temp.next = node;
        node.next = current;
    }

    public static void printLinkedList(){
        Node n = head;
        while (n != null) {
            System.out.print(n.data + "-->");
            n = n.next;    
        }
        System.out.print("null");
        System.out.println();
    }
    
    public static void main(String[] args) {
       insertAtLast(1);
       insertAtLast(1);
       insertAtLast(2);
       insertAtLast(4);
       insertAtLast(5);
       insertAtLast(6);

       insertNodeLL(3);  //1-->1-->2-->3-->4-->5-->6-->null     

       printLinkedList();

       insertNodeLL(10); //1-->1-->2-->3-->4-->5-->6-->10-->null
       printLinkedList();
    }
}
