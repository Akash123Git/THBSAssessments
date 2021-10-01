package nnn.collectionexmp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exmp4 {
    public static void main(String[] args) {
        List<Integer> Obj1=new ArrayList<>();

        Obj1.add(5);
        Obj1.add(20);// object type
        Obj1.add(10);
        Obj1.add(42);
        Obj1.add(2,7);

        System.out.println("Length of array List is "+ Obj1.size());
    }
}
