package murf;

class NodeList {
    int val;
    NodeList next;

    NodeList(int val) {
        this.val = val;
    }
}

public class MiddleLinkedList {
    public static NodeList findMid(NodeList head) {
        NodeList slow = head;
        NodeList fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        NodeList head = new NodeList(1);
        head.next = new NodeList(2);
        head.next.next = new NodeList(3);
        head.next.next.next = new NodeList(4);
        head.next.next.next.next = new NodeList(5);
        head.next.next.next.next.next= new NodeList(5);

        NodeList midNode = findMid(head);
        System.out.println("Middle Element: " + midNode.val);
    }
}
