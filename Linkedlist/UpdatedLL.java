package Linkedlist;

public class UpdatedLL {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add at beginning
    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    // Print linked list
    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }
    // Remove first node
    public void removeFirst() {
        if (head == null) {
            System.out.println("Empty list, nothing to delete");
            return;
        }
        head = head.next;
    }

    // Remove last node
    public void removeLast() {
        if (head == null) {
            System.out.println("Empty list, nothing to delete");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node curr = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            curr = curr.next;
            lastNode = lastNode.next;
        }
        curr.next = null;
    }

    // Count nodes
    public int countNodes() {
        int count = 0;
        Node curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    // Search for element
    public boolean search(String key) {
        Node curr = head;
        while (curr != null) {
            if (curr.data.equals(key))
                return true;
            curr = curr.next;
        }
        return false;
    }

    // Reverse linked list iteratively
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    // Find middle node
    public Node findMiddle() {
        if (head == null) return null;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Remove duplicates from sorted list
    public void removeDuplicatesSorted() {
        Node curr = head;
        while (curr != null && curr.next != null) {
            if (curr.data.equals(curr.next.data)) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
    }


    // Sum of numeric nodes (for Integer linked list)
    public int sumOfNodes() {
        Node curr = head;
        int sum = 0;
        while (curr != null) {
            sum += Integer.parseInt(curr.data);
            curr = curr.next;
        }
        return sum;
    }

    // Max node (for Integer linked list)
    public int maxNode() {
        if (head == null) return Integer.MIN_VALUE;
        int max = Integer.parseInt(head.data);
        Node curr = head.next;
        while (curr != null) {
            int val = Integer.parseInt(curr.data);
            if (val > max) max = val;
            curr = curr.next;
        }
        return max;
    } 

    // Min node (for Integer linked list)
    public int minNode() {
        if (head == null) return Integer.MAX_VALUE;
        int min = Integer.parseInt(head.data);
        Node curr = head.next;
        while (curr != null) {
            int val = Integer.parseInt(curr.data);
            if (val < min) min = val;
            curr = curr.next;
        }
        return min;
    }


    // Remove all occurrences of a key
    public void removeAllOccurrences(String key) {
        while (head != null && head.data.equals(key)) {
            head = head.next;
        }
        Node curr = head;
        while (curr != null && curr.next != null) {
            if (curr.next.data.equals(key)) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
    }

    // Find nth node from end
    public Node findNthFromEnd(int n) {
        if (head == null) return null;
        Node first = head;
        Node second = head;
        for (int i = 0; i < n; i++) {
            if (first == null) return null; // n > length
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        return second;
    }

    // Delete nth node from end
    public void deleteNthFromEnd(int n) {
        Node dummy = new Node("0");
        dummy.next = head;
        Node first = dummy;
        Node second = dummy;
        for (int i = 0; i <= n; i++) {
            if (first == null) return; // n > length
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        head = dummy.next;
    }

    // Detect loop in linked list
    public boolean detectLoop() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    // Main method to test
 public static void main(String[] args) {
    UpdatedLL list = new UpdatedLL();

    System.out.println("=== Adding nodes ===");
    list.addFirst("10");
    list.addFirst("20");
    list.addLast("30");
    list.addLast("40");
    list.addLast("40"); // duplicate for testing
    list.addLast("50");
    list.printList(); // 20->10->30->40->40->50->null

    System.out.println("\n=== Remove first node ===");
    list.removeFirst();
    list.printList(); // 10->30->40->40->50->null

    System.out.println("\n=== Remove last node ===");
    list.removeLast();
    list.printList(); // 10->30->40->40->null

    System.out.println("\n=== Count nodes ===");
    System.out.println("Node count: " + list.countNodes()); // 4

    System.out.println("\n=== Search for 30 ===");
    System.out.println("Found 30? " + list.search("30")); // true

    System.out.println("\n=== Sum, Max, Min ===");
    System.out.println("Sum: " + list.sumOfNodes()); // 10+30+40+40=120
    System.out.println("Max: " + list.maxNode());   // 40
    System.out.println("Min: " + list.minNode());   // 10

    System.out.println("\n=== Reverse list ===");
    list.reverse();
    list.printList(); // 40->40->30->10->null

    System.out.println("\n=== Find middle node ===");
    UpdatedLL.Node middle = list.findMiddle();
    System.out.println("Middle node: " + (middle != null ? middle.data : "null")); // 40

    System.out.println("\n=== Remove duplicates from sorted list ===");
    list.removeDuplicatesSorted();
    list.printList(); // 40->30->10->null (not fully sorted, but method works on sorted)

    System.out.println("\n=== Remove all occurrences of 30 ===");
    list.removeAllOccurrences("30");
    list.printList(); // 40->10->null

    System.out.println("\n=== Find 2nd node from end ===");
    UpdatedLL.Node nth = list.findNthFromEnd(2);
    System.out.println("2nd node from end: " + (nth != null ? nth.data : "null")); // 40

    System.out.println("\n=== Delete 2nd node from end ===");
    list.deleteNthFromEnd(2);
    list.printList(); // 10->null

    System.out.println("\n=== Detect loop ===");
    System.out.println("Loop detected? " + list.detectLoop()); // false
}

}


