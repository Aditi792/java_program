package java_DSA.Linked_list.single_linked_list;

class Node{
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class singleLinkedList{
    Node head;
    
//Insert node at first 
    public void insertAtFirst(int data){
        Node node = new Node(data);

        if(head == null){
            head = node;
        }else{
            node.next = head;
            head = node;
        }
    }


//Insert node at last 
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


//Delete node at first 
    public void deleteFirst(){
        if(head == null){
            return;
        }
        else if (head.next == null){
            head = null;
            return;
        }
        head = head.next;
    }


//Delete node at last
    public void deleteLast(){
        if(head == null){
            return ;
        }
        else if (head.next == null){
            head = null;
            return;
        }
        Node n = head;
        while(n.next.next != null){
            n = n.next;
        }
        n.next = null;
    }


//Delete node bye value

    public void deleteNNode(int value){
        if(head.data == value){
            deleteFirst();
        }else{
            Node n = head;
            while(n.next.data != value){
                n= n.next;
            }
            n.next = n.next.next;
        }
    }


// delete node at value but without using head.

    public void deleteWithOutHead(Node node){ // suppose linked list is [2-->3-->5-->7] ,delete node 5
        if(node == null || node.next == null){
            return;
        }
        node.data = node.next.data;  //The data (value) of the next node (node.next.data) is copied into the current node (node.data) . [2-->3-->7-->7]
        node.next = node.next.next;  //The next pointer of the current node is updated to point to the node after the next node (node.next.next). [2-->3-->7]

    }


//Search a key in the linked list
    public boolean searchKey(int key){
        Node n = head;
        while(n != null){
            if(n.data == key){
                return true;
            }else{
            n = n.next;
            }
        }
        return false;
    }


// reverse linked list
    public Node reverseLL(Node head){
        if(head == null){
            return head;
        }
        Node previousNode = null;
        Node next = null;
        Node current = head;

        while(current != null){
            next = current.next;
            current.next = previousNode;
            previousNode = current;
            current = next;
        }
        return previousNode;
    }


//length of the linkedlist
    public void lengthLL(){
        int count = 0;
        Node n = head;
        while(n != null){
            count++;
            n = n.next;
        }
        System.out.println("Length of the Linked list is : " + count);
    }



//print Linked List
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

public class singleLL {

    public static void main(String[] args) {
        singleLinkedList sLL = new singleLinkedList();
        sLL.insertAtFirst(4);
        sLL.insertAtFirst(6);
        sLL.insertAtFirst(8);
        sLL.insertAtFirst(10);
        sLL.insertAtFirst(12);

        sLL.insertAtLast(2);
        sLL.printLinkedList();

        sLL.deleteFirst();
        sLL.printLinkedList();

        sLL.deleteLast();
        sLL.printLinkedList();

        System.out.println(sLL.searchKey(11));

        sLL.deleteNNode(6);

        sLL.printLinkedList();

        sLL.lengthLL();
    }
}


/*
 * 12-->10-->8-->6-->4-->2-->null
10-->8-->6-->4-->2-->null
10-->8-->6-->4-->null
false
10-->8-->4-->null
Length of the Linked list is : 3
 */