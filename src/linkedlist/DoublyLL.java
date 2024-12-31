package linkedlist;

public class DoublyLL {
    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;

    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;    //  link current tail to new node
            newNode.prev = tail;    //  link tail to newNode prev
            tail = newNode;         //  update tail
        }
    }

    public void delete(int key){
        if(head == null){
            System.out.println("List is Empty.");
            return;
        }

        Node current = head;
        while(current != null && current.data != key){
            current = current.next;
        }
        if(current == null){
            System.out.println("Key is not found in List.");
            return;
        }
        if(current ==head){         //  if head is the key element
            head = head.next;
            if (head!=null){        //
                head.prev = null;
            }else {
                tail = null;
            }
        }

        if(current == tail){
            tail = tail.prev;
            if(tail!=null){
                tail.next = null;
            }
            else {
                head = null;
            }
        }

        else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    public void displayDLL(){
        if(head == null){
            System.out.println("List is Empty : ");
            return;
        }
        Node current = head;
        while (current!=null){
            System.out.print(current.data+" <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int lengthDLL(){
        Node current = head;
        int count = 0;
        while (current!=null){
            current = current.next;
            count++;
        }
        return count;
    }

}
