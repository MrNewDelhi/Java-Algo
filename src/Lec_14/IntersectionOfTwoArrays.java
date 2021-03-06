package Lec_14;

import java.util.ArrayList;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[] {5,7,10,10,10,20,30,30,50,60,60,80};
        int[] arr2 = new int[] {10,10,15,20,30,30,30,60,70,80,80,90};
        ArrayList<Integer> AL = Intersection(arr1,arr2);
        System.out.println(AL);
    }

    public static ArrayList<Integer> Intersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> AL = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] == arr2[j]){
                AL.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i] > arr2[j]){
                j++;
            }
            else{
                i++;
            }
        }
        return AL;
    }
}
