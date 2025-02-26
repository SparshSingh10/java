import java.util.ArrayList;
import java.util.Arrays;

class GroceryItem {
    String name;
    String type;
    int count;

    // Constructor with only name
    public GroceryItem(String name) {
        this.name = name;
    }

    // Constructor with name, type, and count
    public GroceryItem(String name, String type, int count) {
        this.name = name;
        this.type = type;
        this.count = count;
    }

    @Override
    public String toString() {
        return "GroceryItem{name='" + name + "', type='" + type + "', count=" + count + "}";
    }
}

public class ArrayList1 {
    public static void main(String[] args) {
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("Milk");
        groceryArray[1] = new GroceryItem("Apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("Oranges", "PRODUCE", 5);

        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        System.out.println(objectList);

        // // Accessing elements (will cause ClassCastException if treated incorrectly)
        // GroceryItem item = (GroceryItem) objectList.get(0); // ✅ Safe
        // System.out.println(item.name);

        // // This will cause an error at runtime if uncommented
        GroceryItem errorItem = (GroceryItem) objectList.get(1); //
        // ClassCastException

        // System.out.println(objectList.get(1)); // Works, but it's a String, not
        // GroceryItem
    }
}
