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
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("2");
        list.addLast("4");
        list.addLast("2");
        list.printList(); // 1->2->3->2->4->2->null

        System.out.println("Removing all occurrences of 2...");
        list.removeAllOccurrences("2");
        list.printList(); // 1->3->4->null

        System.out.println("2nd node from end: " + (list.findNthFromEnd(2) != null ? list.findNthFromEnd(2).data : "null"));

        System.out.println("Deleting 2nd node from end...");
        list.deleteNthFromEnd(2);
        list.printList(); // 1->3->null

        System.out.println("Loop detected? " + list.detectLoop()); // false

        list.reverse();
        System.out.print("Reversed list: ");
        list.printList(); // 3->1->null
    }
}


