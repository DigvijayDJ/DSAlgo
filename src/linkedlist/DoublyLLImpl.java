package linkedlist;

public class DoublyLLImpl {
    public static void main(String[] args) {
    DoublyLL dll = new DoublyLL();
    dll.add(1);
    dll.add(2);
    dll.add(3);
    dll.add(4);
    dll.add(5);
    System.out.println("Original List : ");
    dll.displayDLL();
    dll.delete(3);
    System.out.println("Modified List : ");
    dll.displayDLL();

    }

}
