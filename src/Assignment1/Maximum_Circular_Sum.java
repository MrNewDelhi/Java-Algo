package Assignment1;

import java.util.Scanner;

public class Maximum_Circular_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while(testcase > 0){
            int size = sc.nextInt();
            int[] arr = new int[size];
            for(int index = 0; index < size; index++){
                arr[index] = sc.nextInt();
            }
            int max = 0;
            for(int index_i = 0; index_i < size; index_i++){
                int sum = 0;
                for(int index_j = index_i; index_j < size + index_i; index_j++){
                    int index = index_j;
                    if(index_j >= size){
                        index = index_j - size;
                    }
                    sum += arr[index];
                    if(max < sum){
                        max = sum;
                    }
                }
            }
            System.out.println(max);
            testcase--;
        }
    }
}
