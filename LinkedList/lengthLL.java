// Problem: Find the Length of a Linked List
// Platform: Striver A2Z
// Link: https://takeuforward.org/linked-list/find-the-length-of-a-linked-list
// Approach:
// Time Complexity: O(n)
// Space Complexity: O(1)

package LinkedList;

public class lengthLL {
    public static int lengthLL(Node head){
        Node temp = head;
        int count=0;

        while(temp != null){
            count++;
            temp = temp.next;
        }

        return count;
    }
}
