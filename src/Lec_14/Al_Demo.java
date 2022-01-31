package Lec_14;

import java.util.ArrayList;

public class Al_Demo {
    public static void main(String[] args) {
        Integer I = 11; //memory in heap, I address !!
        int i = 10; //i in FF, stack
        System.out.println(I);
        System.out.println(i);
        System.out.println(I + 10);
        //unboxing === taking out value from address present in I and then put it in the i
        i = I;
        System.out.println(i);
        //autoboxing == taking value and put it in the address present in I
        I = i;
        System.out.println(Integer.MAX_VALUE);

        // Generics
        System.out.println("==================================");

        //Declare, Initialize!!
        ArrayList<Integer> AL = new ArrayList<>();
        ArrayList<Integer> AL2;
        int[] arr = new int[0];
        AL2 = AL;

        //Indexing ?? get !!
//        arr[1];
        int a = AL.get(0);
        System.out.println(a);
        //Set!!
//        arr[3] = 100;
        AL.set(3,10);


    }
}
