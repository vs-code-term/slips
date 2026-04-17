import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        
        // Create TreeSet
        TreeSet<String> colors = new TreeSet<>();

        // Add colors
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Print TreeSet (automatically sorted)
        System.out.println("Colors in ascending order:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}