
import java.util.LinkedList;

public class Iterator {

    public static void main(String[] args) {

        // LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);
        testIterator(placesToVisit);

    }

    private static void addMoreElements(LinkedList<String> list) {

        list.addFirst("Darwin");
        list.addLast("Hobart");
        // Queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba"); 
        // Stack Methods
        list.push("Alice Springs");

    }

    private static void testIterator(LinkedList<String> list) {

        var iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("Brisbane")) {
                iterator.remove();
            }
        }

        System.out.println(list);
    }

}
