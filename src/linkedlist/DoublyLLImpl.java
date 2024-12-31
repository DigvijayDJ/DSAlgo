package linkedlist;

public class DoublyLLImpl {
    public static void main(String[] args) {
    DoublyLL dll = new DoublyLL();
    dll.add(1);
    dll.add(2);
    dll.add(3);
    dll.add(4);
    dll.add(5);
    System.out.println("Original List of Length : "+dll.lengthDLL());
    dll.displayDLL();
    dll.delete(6);
    System.out.println("Modified List of Length : "+dll.lengthDLL());
    dll.displayDLL();

    }

}
