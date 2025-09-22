import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        PriorityQueue<ListNode> heap = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));

        // add all list heads
        for (ListNode node : lists) {
            if (node != null) heap.add(node);
        }

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (!heap.isEmpty()) {
            ListNode min = heap.poll();
            tail.next = min;
            tail = tail.next;
            if (min.next != null) heap.add(min.next);
        }

        return dummy.next;
    }

    // Quick test
    public static void main(String[] args) {
        // Example: lists = [[1,4,5],[1,3,4],[2,6]]
        ListNode l1 = new ListNode(1); l1.next = new ListNode(4); l1.next.next = new ListNode(5);
        ListNode l2 = new ListNode(1); l2.next = new ListNode(3); l2.next.next = new ListNode(4);
        ListNode l3 = new ListNode(2); l3.next = new ListNode(6);

        MergeKSortedLists sol = new MergeKSortedLists();
        ListNode res = sol.mergeKLists(new ListNode[]{l1, l2, l3});

        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
        // Output: 1 1 2 3 4 4 5 6
    }
}
