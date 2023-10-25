import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

class SinglyLinkedList {
    int data;
    SinglyLinkedList next;

    SinglyLinkedList(int d) {
        data = d;
        next = null;
    }
}

public class Main {

    public static int countNodes(SinglyLinkedList head) {
        int count = 0;
        SinglyLinkedList current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static int findIntersection(int dis, SinglyLinkedList head1, SinglyLinkedList head2) {
        SinglyLinkedList cr1 = head1;
        SinglyLinkedList cr2 = head2;

        for (int i = 0; i < dis; i++) {
            if (cr1 == null)
                return -1;
            cr1 = cr1.next;
        }
        while (cr1 != null && cr2 != null) {
            if (cr1.data == cr2.data) {
                return cr1.data;
            }
            cr1 = cr1.next;
            cr2 = cr2.next;
        }
        return -1;  // no intersection
    }

    public static boolean doLinkedListsIntersect(List<SinglyLinkedList> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int common = findIntersection(0, list.get(i), list.get(j));
                if (common != -1)
                    return true;
            }
        }
        return false; // no intersection found;
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
    }
}
