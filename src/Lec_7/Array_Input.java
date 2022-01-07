package Lec_7;

import java.util.Scanner;

public class Array_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "th index : " + arr[i]);
        }
//        whatever we change in this will not be reflected in the array
        for (int element : arr) {
            System.out.println(element);
        }
        int[] arr2 = {10,20,30,40,50,60};
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
