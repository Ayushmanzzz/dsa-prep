// Problem: Delete Last Node of Linked List
// Platform: Striver A2Z
// Link: https://takeuforward.org/data-structure/delete-last-node-of-linked-list
// Approach:
// Time Complexity: O(n) -> without Node tail
// Space Complexity: O(1)

package LinkedList;

public class deleteAtTail {

    public static void deleteAtTail(Node head){
        if(head == null || head.next == null){
            return;
        }

        Node tmep = head;

        while(tmep.next.next != null){
            tmep = tmep.next;
        }

        tmep.next = null;
    }
}