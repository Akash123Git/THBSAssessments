package nnn.collectionexmp;

import java.util.ArrayList;
import java.util.List;

public class Exmp5 {
    public static void main(String[] args) {

        List<Integer> values = new ArrayList<Integer>();

        values.add(5);
        values.add(20);// object type
        values.add(10);
        values.add(42);
        values.add(2, 5);

        System.out.println("List Elements: " + values);

        int[] arr = new int[values.size()];

        for (int i = 0; i < values.size(); i++) {
            arr[i] = values.get(i);
            System.out.println("\n After converting from list to array: " + arr[i]);
        }
    }
}
