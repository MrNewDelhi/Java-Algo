package Lec_14;

import java.util.ArrayList;
import java.util.Scanner;

public class AddingDigitsArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {9,9,1,9};
        int[] arr2 = {9,9,9};
        System.out.println(Add(arr1,arr2));
    }
    public static ArrayList<Integer> Add(int[] arr1, int[] arr2){
        ArrayList<Integer> AL = new ArrayList<>();
        int i = arr1.length-1;
        int j = arr2.length-1;
        int carry = 0;
        while(i >= 0 || j >= 0){
            int sum = 0;
            if(i >= 0){
                sum += arr1[i];
            }
            if(j >= 0){
                sum += arr2[j];
            }
            sum += carry;
            carry = sum / 10;
            AL.add(0, sum % 10);
            i--;
            j--;
        }
        if(carry == 1){
            AL.add(0,1);
        }
        return AL;
    }
}
