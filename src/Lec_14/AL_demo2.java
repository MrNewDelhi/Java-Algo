package Lec_14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class AL_demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer I = sc.nextInt();
        ArrayList<Integer> AL = new ArrayList<>();
        AL.add(10);
        AL.add(20);
        AL.add(30);
        AL.add(40);
        System.out.println(AL);
        System.out.println(AL.get(0));
        //SIZE
        System.out.println(AL.size());
        System.out.println(AL.get(AL.size()-1));

        AL.set(2,null);
        System.out.println(AL);

        //2-D ArrayList
        ArrayList<ArrayList<Integer>> AL2 = new ArrayList<>();
        AL2.add(new ArrayList<Integer>());
        AL2.get(0).add(5);
        System.out.println(AL2);
        AL2.add(new ArrayList<Integer>());
        AL2.get(1).add(9);
        System.out.println(AL2);

        //insert == add at index
        AL.add(2,100);
        System.out.println(AL);

        //Remove
        AL.remove(0);
        System.out.println(AL);

        int removedElement = AL.remove(0);
        System.out.println(removedElement);

        for(int e: AL){
            System.out.println(e + "-");
        }
        System.out.println();

        //reverse
        Collections.reverse(AL);
        System.out.println(AL);
    }
}
