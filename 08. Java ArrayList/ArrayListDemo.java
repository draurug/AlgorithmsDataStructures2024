import java.util.ArrayList;
import java.util.Collections;

//0. Write a Java class with main method consist of:
public class ArrayListDemo {
    public static void main(String[] args) {

        // 1. Create a new ArrayList, add some colors (strings) and print out the collection

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Orange");
        colors.add("Red");
        colors.add("Purple");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Grey");
        System.out.println("Colors: " + colors);

        // 2. Iterate through all elements in the ArrayList

        System.out.println("Iterating through colors:");
        for (String color : colors) {
            System.out.println(color);
        }

        // 3. Insert an element into the ArrayList at the first position

        colors.add(0, "Yellow");
        System.out.println("After inserting yellow at first position: " + colors);

        // 4. Retrieve an element (at a specified index) from the ArrayList

        String colorAtIndex3 = colors.get(3);
        System.out.println("Element at index 3: " + colorAtIndex3);

        // 5. Update specific ArrayList element by given element

        colors.set(3, "Lilac");
        System.out.println("After updating element at index 3 to lilac: " + colors);

        // 6. Remove the third element from the ArrayList

        colors.remove(3);
        System.out.println("After removing the 4th element: " + colors);

        // 7. Search an element in the ArrayList
        
        String searchColor = "Yellow";
        boolean containsColor = colors.contains(searchColor);
        System.out.println("Does the list contain " + searchColor + "? " + containsColor);

        // 8. Sort the ArrayList

        Collections.sort(colors);
        System.out.println("After sorting: " + colors);

        // 9. Copy one ArrayList into another

        ArrayList<String> copiedColors = new ArrayList<>(colors);
        System.out.println("Copied list: " + copiedColors);

        // 10. Reverse elements in the ArrayList

        Collections.reverse(colors);
        System.out.println("After reversing: " + colors);

        // 11. Compare two ArrayLists

        boolean areListsEqual = colors.equals(copiedColors);
        System.out.println("Are the original and copied lists equal? " + areListsEqual);

        // 12. Empty the ArrayList

        colors.clear();
        System.out.println("After emptying the list: " + colors);

        // 13. Test if the ArrayList is empty

        boolean isEmpty = colors.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);

        // 14. Increase the size of the ArrayList

        colors.ensureCapacity(25);
        System.out.println("Increased the capacity of the list to 25.");

        // 15. Trim the capacity of the ArrayList to the current list size

        colors.trimToSize();
        System.out.println("Trimmed the capacity of the list to its current size.");
    }
}
