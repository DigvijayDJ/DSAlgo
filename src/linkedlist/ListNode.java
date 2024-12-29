package linkedlist;

public class ListNode{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head;

//    display linked list
    public void display(){
        if(head == null){
            System.out.println("Linked List is Empty : ");
            return;
        }
        Node current = head;
        while (current != null){
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.println("null");
    }

//      Method to add a node at the end of the LinkedList
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }

        else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

//    Method to add a node at the end of the LinkedList
    public void delete(int key){
        if(head == null){
            System.out.println("Linked List is Empty.");
            return;
        }

        else if(head.data == key){
            head = head.next;
        }
        Node currentNode =head;
        while (currentNode.next != null && currentNode.data != key){
            currentNode = currentNode.next;
        }
        if(currentNode.next == null){
            System.out.println("Key is not found in LinkedList.");
        }
        else {
            currentNode.next = currentNode.next.next;
        }
    }

    public int calculateLength(){
        Node currentNode = head;
        int length = 0;
        while (currentNode != null){
            currentNode = currentNode.next;
            length++;
        }
        return length;
    }

}
