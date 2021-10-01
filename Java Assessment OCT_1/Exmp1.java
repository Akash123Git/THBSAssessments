package nnn.collectionexmp;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.*;

public class Exmp1 {
    public static void main(String[] args) {

        List <Integer> Obj=new ArrayList<>();
        int ch;
        int i,n=0;
        Scanner in=new Scanner(System.in);


            System.out.println("Program To Traverse through ArrayList\n");
            System.out.println("Choose your operations to be performed:");
            while(true) {
                System.out.println("1.Add data\n2.Traverse\n3.Exit");
                ch = in.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println("Enter the number of elements to be added: ");
                        n=in.nextInt();
                        System.out.println("Enter your data: ");
                        for(i=0;i<n;i++){
                        try {
                            Obj.add(in.nextInt());
                        } catch (Exception e) {
                            System.out.println("Enter Int data only");
                        }
                        }
                        break;
                    case 2:
                        System.out.println("Traversing Data: ");
                        for (i = 0; i < Obj.size(); i++) {
                            System.out.println(Obj.get(i));
                        }
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("Please choose the Valid option\n");
                        break;
                }
            }
    }
}
