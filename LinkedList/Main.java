package LinkedList;

public class Main {
    public static void main(String[] args) {
        Node head = null;

        insertAtHead.insertAtHead(10);
        insertAtHead.insertAtHead(20);
        insertAtHead.insertAtHead(30);

        System.out.print("Linked List: ");
        printLL.printLL(insertAtHead.head);
        System.out.println();

        int length = lengthLL.lengthLL(insertAtHead.head);
        System.out.println("Length of Linked List: " + length);

        int key = 20;
        boolean found = searchInLL.searchInLL(insertAtHead.head, key);
        System.out.println("Is " + key + " present in the Linked List? " + found);

        deleteAtTail.deleteAtTail(insertAtHead.head);
        System.out.print("Linked List after deleting the last node: ");
        printLL.printLL(insertAtHead.head);
        System.out.println();
    }
}