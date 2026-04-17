import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Original List: " + list);

        // i. Add element at first position
        list.addFirst(5);
        System.out.println("After adding at first: " + list);

        // ii. Delete last element
        list.removeLast();
        System.out.println("After deleting last: " + list);

        // iii. Display size of LinkedList
        System.out.println("Size of LinkedList: " + list.size());
    }
}