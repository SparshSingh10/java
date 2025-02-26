
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArraysAndArrayList {
    public static void main(String[] args) {

        String[] originaArray = new String[] { "First", "Second", "Third" };

        var originalList = Arrays.asList(originaArray);

        // original Array is fixed so we can change it but if we cover it or wrap with array lis 
        //   var originalList = new ArrayList<>(Arrays.asList(originaArray));

        originalList.set(0, "one");
        System.out.println("List" + originalList);
        System.out.println("Array" + Arrays.toString(originaArray));
        originalList.sort(Comparator.naturalOrder());
        System.out.println(originalList);
        originalList.add("fourth");
    }
}
