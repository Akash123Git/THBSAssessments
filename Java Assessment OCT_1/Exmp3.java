package nnn.collectionexmp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;
import java.util.Scanner;

public class Exmp3 {
    public static void main(String[] args) {

        Set<Integer> Obj1=new HashSet<>();
        int i=0;
        int key=0;
        Scanner in=new Scanner(System.in);

        Obj1.add(5);
        Obj1.add(20);// object type
        Obj1.add(10);
        Obj1.add(42);

        System.out.println("Enter the Element to be found:");
        try{
            key=in.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Integer data only");
            System.exit(0);
        }
        System.out.println(Obj1);
        for(int Element:Obj1) {
            if (Element==key){
                System.out.println("Element exists at position "+i);
                System.exit(0);
            }
            i++;
        }
        System.out.println("Element does not exists");
    }
}
