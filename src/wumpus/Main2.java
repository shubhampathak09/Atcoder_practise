package wumpus;

import java.util.*;

class SinglyLinkedList {
    String data;
    SinglyLinkedList next;

    SinglyLinkedList(String d) {
        data = d;
        next = null;
    }
}

public class Main2 {
    public static boolean DoLinkedListsIntersect(Collection<SinglyLinkedList> lists) {
        Set<SinglyLinkedList> visited = new HashSet<>();
        Map<String, SinglyLinkedList> startNodes = new HashMap<>();

        for (SinglyLinkedList head : lists) {
            SinglyLinkedList current = head;
            while (current != null) {
                if (visited.contains(current)) {
                    // Cycle detected, throw an error
                    throw new RuntimeException("Error Thrown!");
                }
                visited.add(current);
                current = current.next;

                // Store the starting node for each list
                if (current == null && head != null) {
                    startNodes.put(head.data, head);
                }
            }
        }

        // Check for indirect intersections
        for (SinglyLinkedList head : lists) {
            SinglyLinkedList current = head;
            while (current != null) {
                if (startNodes.containsKey(current.data) && startNodes.get(current.data) != head) {
                    return true; // Indirect intersection found
                }
                current = current.next;
            }
        }

        // No intersection found
        return false;
    }

    public static void main(String[] args) {
        // Read input and construct the singly-linked lists based on the provided input format.

        // Example usage for Test 1:
        SinglyLinkedList a = new SinglyLinkedList("a");
        SinglyLinkedList b = new SinglyLinkedList("b");
        a.next = b;

        SinglyLinkedList r = new SinglyLinkedList("r");
        SinglyLinkedList s = new SinglyLinkedList("s");
        r.next = s;

        SinglyLinkedList x = new SinglyLinkedList("x");
        SinglyLinkedList c = new SinglyLinkedList("c");
        b.next = c;
        x.next = c;

        SinglyLinkedList q = new SinglyLinkedList("q");
        r.next = q;


        SinglyLinkedList w = new SinglyLinkedList("w");

        SinglyLinkedList y = new SinglyLinkedList("y");
        SinglyLinkedList z = new SinglyLinkedList("z");
        x.next = z;
        w.next = z;



        List<SinglyLinkedList> lists = new ArrayList<>();
        lists.add(a);
        lists.add(b);
      //  lists.add(x);

        // Call the function for Test 1
        try {
            boolean result = DoLinkedListsIntersect(lists);
            System.out.println(result);
        } catch (RuntimeException e) {
            System.out.println("Error Thrown!");
        }
    }
}

