package Office_code;

import java.util.LinkedList;

public class LinkedListAccessExample {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Element 1");
        linkedList.add("Element 2");
        linkedList.add("Element 3");

        // Accessing elements by index
        int index = 1;
        String elementAtIndex = getElementAtIndex(linkedList, index);

        if (elementAtIndex != null) {
            System.out.println("Element at index " + index + ": " + elementAtIndex);
        } else {
            System.out.println("Index " + index + " is out of bounds.");
        }
    }

    // Method to get element at specified index in a LinkedList
    public static <E> E getElementAtIndex(LinkedList<E> list, int index) {
        // Check if index is within bounds
        if (index >= 0 && index < list.size()) {
            // Traverse the list from the head
            int currentIndex = 0;
            for (E element : list) {
                if (currentIndex == index) {
                    return element;
                }
                currentIndex++;
            }
        }
        // Index is out of bounds or list is empty
        return null;
    }
}
