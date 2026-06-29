// Problem: Print a Linked List
// Platform: 
// Link: 
// Approach:
// Time Complexity: O(n)
// Space Complexity: O(1)

package LinkedList;

public class printLL {
    public static void printLL(Node head){
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data);
            temp = temp.next;
        }
    }
}
