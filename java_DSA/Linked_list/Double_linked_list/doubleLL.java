package java_DSA.Linked_list.Double_linked_list;

import java.util.NoSuchElementException;

class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoubleLinkedList{
    Node head;
    Node tail;

    //checking list empty or not
    public boolean isEmpty(){
        return head == null;
    }


    //insert node at first 
    public void insertNodeAtFirst(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }


    //insert node at last
    public void insertAtLast(int data){
        Node node = new Node(data);
        if(isEmpty()){
            head = node;
            node.prev = head;
        }
        else{
            Node itr = head;
            while(itr.next != null){
                itr = itr.next;
            }
            itr.next = node;
            node.prev= itr;
        }  
    }

    //insert data in last using head and tail pointer
    // public void constructDLL(int data) {
    //        if(head == null){
    //            head = new Node(data);
    //            tail = head;
    //        }else{
    //            Node node = new Node(data);
    //            tail.next = node;
    //            node.prev = tail;
    //            tail = node;
    //        }
    // }


    //insert at after value
    public void insertAfter(int val,int data){
        Node node = new Node(data);
        Node itr = head;
        while(itr != null){
            if(itr.data == val){
                node.next = itr.next;
                itr.next.prev= node;
                itr.next = node;
                node.prev= itr;
            }
            itr = itr.next;
        }
    }


    //delete first node 
    public void deleteFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }else if (head.next == null){
            head = head.next;
        }
        else{
            head.next.prev = null;
            head = head.next;
        } 
    }


    //delete last
    public void deleteLast(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }else if (head.next == null){
            head = head.next;
        }
        else{
            Node itr = head;
            while(itr.next != null){
                itr = itr.next;
            }
            itr.prev.next = null;
            itr.prev= null;
        } 
    }


    //for printing the length of the double linked list
    public int printLengthDLL(){
        Node itr = head;
        int len = 1;
        if(itr == null) return 0;
        while(itr.next != null){
            len++;
            itr = itr.next;
        }
        return len;
    }



    //for printing the linked list
    public void printDLL(){
        Node itr = head;
        while(itr != null){
            System.out.print(itr.data + " --> ");
            itr = itr.next;
        }
        System.out.print("null");
        System.out.println();
    }
}



public class doubleLL {
    public static void main(String[] args) {
        DoubleLinkedList DLL = new DoubleLinkedList();

        DLL.insertNodeAtFirst(1);
        //DLL.insertNodeAtFirst(2);
        //DLL.insertNodeAtFirst(4);

        DLL.printDLL();                  //4 --> 2 --> 1 --> null
        System.out.println("Length of the List is : " + DLL.printLengthDLL());    ///Length of the List is : 3

        DLL.insertAtLast(5);
        DLL.insertAtLast(6);
        DLL.insertAtLast(7);

        DLL.printDLL();      //4 --> 2 --> 1 --> 5 --> 6 --> 7 --> null  
        System.out.println("Length of the List is : " + DLL.printLengthDLL());   //Length of the List is : 6

        DLL.insertAfter(1, 0);
        DLL.printDLL();    //4 --> 2 --> 1 --> 0 --> 5 --> 6 --> 7 --> null

        DLL.deleteFirst();
        DLL.printDLL();    //2 --> 1 --> 0 --> 5 --> 6 --> 7 --> null

        DLL.deleteLast();
        DLL.printDLL();   //2 --> 1 --> 0 --> 5 --> 6 --> null
    }

}
