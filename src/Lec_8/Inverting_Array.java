package Lec_8;

public class Inverting_Array {
    public static void main(String[] args) {
        int[] arr = {2,4,3,1,0};
        Inverting(arr);
    }

    public static void Inverting(int[] arr){
        int[] ans = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            ans[arr[i]] = i;
        }
        display(ans);
    }
    public static void display(int[] arr){
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
