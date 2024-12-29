package linkedlist;


public class CreateLinkedList {
    public static void main(String[] args){
        ListNode linkedList = new ListNode();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);

        System.out.println("Original Linked List with Length : "+linkedList.calculateLength());
        linkedList.display();

        linkedList.delete(20);

        System.out.println("Linked List after deletion ");
        linkedList.display();
    }
}

