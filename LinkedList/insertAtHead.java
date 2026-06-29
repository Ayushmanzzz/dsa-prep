// Problem: Insert at the head of a Linked List
// Platform: Striver A2Z
// Link: https://takeuforward.org/linked-list/insert-at-the-head-of-a-linked-list
// Approach:
// Time Complexity: O(1)
// Space Complexity: O(1)

package LinkedList;

public class insertAtHead {
    static Node head;
    public static void insertAtHead(int data){
        Node newNode = new Node(data);

        newNode.next = head;

        head = newNode;
    }
}
