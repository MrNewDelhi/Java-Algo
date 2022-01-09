package Assignment1;

import java.util.Scanner;

public class Calculate_The_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int index = 0; index < size; index++){
            arr[index] = sc.nextInt();
        }
        int number_of_operations = sc.nextInt();
        for(int count = 0; count < number_of_operations; count++){
            int operation = sc.nextInt();
            operation = operation % size;
            int[] duplicate = new int[size];
            for(int index = 0; index < size; index++){
                duplicate[index] = arr[index];
            }
            for(int index = 0; index < size; index++){
                if(index - operation < 0) {
                    arr[index] = duplicate[index] + duplicate[index - operation + size];
                }else {
                    arr[index] = duplicate[index] + duplicate[index - operation];
                }
            }
        }
        int sum = 0;
        for(int elements : arr){
            sum += elements;
            sum %= ((int)Math.pow(10,9) + 7);
        }
        System.out.println(sum);
    }
}
