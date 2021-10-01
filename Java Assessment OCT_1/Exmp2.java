package nnn.collectionexmp;

import java.util.ArrayList;
import java.util.*;

public class Exmp2 {
    public static void main(String[] args) {

        List<Integer> Obj1=new ArrayList<>();
        int i;
        int key;
        Scanner in=new Scanner(System.in);

        Obj1.add(5);
        Obj1.add(20);// object type
        Obj1.add(10);
        Obj1.add(42);
        Obj1.add(2,7);

        System.out.println("Enter the Element to be found:");
        key=in.nextInt();

        for(i=0;i<Obj1.size();i++){
            if (key==Obj1.get(i)) {
                System.out.println("Element Exists at position: " + i);
                System.exit(0);
            }
        }
        System.out.println("Element does not exists");

    }
}
