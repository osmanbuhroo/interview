package Array;

class ListNode {
//    int data;
//    ListNode next;
//
//    ListNode(int data) {
//        this.data = data;
//        this.next = null;
//    }

    int val;
    ListNode next;
    ListNode (int val){
        this.val =val;
    }
}

class MergeSortedLinkedLists {
    public  static  ListNode mergeList(ListNode head1, ListNode head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        ListNode mergedNode, tail;
        if (head1.val <= head2.val) {
            mergedNode = head1;
            head1 = head1.next;
        } else {
            mergedNode = head2;
            head2 = head2.next;
        }
        tail = mergedNode;
        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }
        if (head1 != null) {
            tail.next = head1;
            head1 = head1.next;
        } else {
            tail.next = head2;
        }
        return mergedNode;
    }// Return the head of the merged list.
        public static void main(String[] args) {
        // Create two sorted linked lists
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        // Merge the two lists
        ListNode mergedList = mergeList(list1, list2);

        // Print the merged list
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
  }



//    public static ListNode mergeTwoLists(ListNode head1, ListNode head2) {
//        if (head1 == null) {
//            return head2;  // If the first list is empty, return the second list.
//        }
//        if (head2 == null) {
//            return head1;  // If the second list is empty, return the first list.
//        }
//
//        ListNode mergedHead, tail;
//
//        // Initialize mergedHead and tail based on the first node.
//        if (head1.data <= head2.data) {
//            mergedHead = head1;
//            head1 = head1.next;
//        } else {
//            mergedHead = head2;
//            head2 = head2.next;
//        }
//        tail = mergedHead;  // Set the tail to the current head.
//
//        // Merge the lists while they both have elements.
//        while (head1 != null && head2 != null) {
//            if (head1.data <= head2.data) {
//                tail.next = head1;
//                head1 = head1.next;
//            } else {
//                tail.next = head2;
//                head2 = head2.next;
//            }
//            tail = tail.next;  // Move the tail to the newly added node.
//        }
//
//        // Attach the remaining elements from either list.
//        if (head1 != null) {
//            tail.next = head1;
//        } else {
//            tail.next = head2;
//        }
//
//        return mergedHead;  // Return the head of the merged list.
//    }
//
//    public static void main(String[] args) {
//        // Create two sorted linked lists
//        ListNode list1 = new ListNode(1);
//        list1.next = new ListNode(3);
//        list1.next.next = new ListNode(5);
//
//        ListNode list2 = new ListNode(2);
//        list2.next = new ListNode(4);
//        list2.next.next = new ListNode(6);
//
//        // Merge the two lists
//        ListNode mergedList = mergeTwoLists(list1, list2);
//
//        // Print the merged list
//        while (mergedList != null) {
//            System.out.print(mergedList.data + " ");
//            mergedList = mergedList.next;
//        }
//    }
//}
