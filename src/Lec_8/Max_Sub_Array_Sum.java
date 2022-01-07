package Lec_8;
//KADANE'S ALGORITHM
public class Max_Sub_Array_Sum {
    public static void main(String[] args) {
        int[] arr = {30, -99, 1, 25, 20, -30, -9, 4, 50};
        Max_SubArray_Sum(arr);
        Kadance_Algorithm(arr);
    }

    public static void Kadance_Algorithm(int[] arr){
        int sum = 0;
        int max_sum = 0;
        for (int i : arr) {
            sum += i;
            if (sum < 0) {
                sum = 0;
                continue;
            }
            max_sum = Math.max(sum, max_sum);
        }
        System.out.println(max_sum);
    }

    public static void Max_SubArray_Sum(int[] arr){
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = i; j < arr.length; j++){
                sum+=arr[j];
                if(sum < 0){
                    break;
                }
                max_sum = Math.max(sum,max_sum);
            }
        }
        System.out.println(max_sum);
    }

    public static void display(int[] arr,int start, int end){
        for (;start<=end;start++) {
            System.out.print(arr[start] + " ");
        }
        System.out.println();
    }
}
