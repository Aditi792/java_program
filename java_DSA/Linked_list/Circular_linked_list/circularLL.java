package java_DSA.Linked_list.Circular_linked_list;

import java.util.NoSuchElementException;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class circularLinkedList {
    Node tail;


    //insert node at first
    public void insertAtFirst(int data) {
        Node node = new Node(data);
        if (tail == null) {
            tail = node;
            //tail.next = node;
        } else {
            //Node temp = tail.next;
            //tail.next = node;
            //node.next = temp;
            node.next = tail.next;
        }
        tail.next = node;
    }



    //insert node at last
    public void insertAtLast(int data) {
        Node node = new Node(data);
        if (tail == null) {
            tail = node;
            tail.next = node;
        } else {
            node.next = tail.next;
            //Node temp = tail.next;
            tail.next = node;
            //node.next = temp;
            tail = node;
        }
    }


//remove node from first
    public void removeFirst(){
        if(tail == null){
            throw new NoSuchElementException();
        }
        Node temp = tail.next;
        if(tail.next == tail){
            tail = null;
        }else{ 
            tail.next = temp.next;
        }
        temp.next = null;
    }


    //print circular linked list
    public void printCLL() {
        if (tail == null)
            System.out.println("null");
        else {
            Node first = tail.next;
            while (first != tail) {
                System.out.print(first.data + "-->");
                first = first.next;
            }
            System.out.print(first.data);
            System.out.println();
        }
    }
}

public class circularLL {
    public static void main(String[] args) {
        circularLinkedList CLL = new circularLinkedList();

        CLL.insertAtFirst(1);
        CLL.insertAtFirst(2);
        CLL.insertAtFirst(3);
        CLL.printCLL();          //3-->2-->1

        CLL.insertAtLast(4);
        CLL.insertAtLast(5);
        CLL.insertAtLast(6);
        CLL.printCLL();          //3-->2-->1-->4-->5-->6

        CLL.removeFirst();
        CLL.printCLL();         //2-->1-->4-->5-->6
    }
}
