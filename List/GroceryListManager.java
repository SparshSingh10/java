import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GroceryListManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> groceryList = new ArrayList<>();

        while (true) {
            // Display menu options
            System.out.println("Available actions:");
            System.out.println("0 to shutdown");
            System.out.println("1 to add item(s) to grocery list (comma delimited list)");
            System.out.println("2 to remove item(s) from grocery list (comma delimited list)");

            // Get user input for action choice
            System.out.print("Enter a number for which action you want to do: ");
            int action = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (action) {
                case 0:
                    System.out.println("Shutting down...");
                    return;

                case 1:
                    System.out.print("Enter items to add (comma delimited): ");
                    String addItems = scanner.nextLine();
                    String[] addItemArray = addItems.split(",");
                    for (String item : addItemArray) {
                        String trimmedItem = item.trim();
                        if (!groceryList.contains(trimmedItem)) {
                            groceryList.add(trimmedItem);
                        } else {
                            System.out.println("Item \"" + trimmedItem + "\" is already in the list.");
                        }
                    }
                    printSortedList(groceryList);
                    break;

                case 2:
                    System.out.print("Enter items to remove (comma delimited): ");
                    String removeItems = scanner.nextLine();
                    String[] removeItemArray = removeItems.split(",");
                    for (String item : removeItemArray) {
                        String trimmedItem = item.trim();
                        if (groceryList.contains(trimmedItem)) {
                            groceryList.remove(trimmedItem);
                        } else {
                            System.out.println("Item \"" + trimmedItem + "\" is not in the list.");
                        }
                    }
                    printSortedList(groceryList);
                    break;

                default:
                    System.out.println("Invalid action. Please enter 0, 1, or 2.");
                    break;
            }
        }
    }

    // Method to print the grocery list sorted alphabetically
    private static void printSortedList(ArrayList<String> list) {
        Collections.sort(list);
        System.out.println("Sorted Grocery List: " + list);
    }
}
