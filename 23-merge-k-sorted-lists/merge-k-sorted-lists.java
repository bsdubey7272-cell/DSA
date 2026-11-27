
import java.util.*;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        // Min Heap
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a.val, b.val)
        );

        // Add the first node of every list
        for (ListNode node : lists) {
            if (node != null) {
                pq.add(node);
            }
        }

        // Dummy node
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Process smallest nodes
        while (!pq.isEmpty()) {

            ListNode node = pq.poll();

            current.next = node;
            current = current.next;

            // Add next node from the same list
            if (node.next != null) {
                pq.add(node.next);
            }
        }

        return dummy.next;
    }
}
