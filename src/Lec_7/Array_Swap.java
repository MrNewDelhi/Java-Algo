package Lec_7;

public class Array_Swap {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4};
        int[] a2 = {23, 12, 14, 7};
        swap(a1[0],a2[0]);
        swap_nil(a1, a2, 0);
        System.out.println(a1[0] +" " + a2[0]);
    }
    public static void swap (int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
    public static void swap_nil (int[] a, int[] b, int c){
        int temp = a[c];
        a[c] = b[c];
        b[c] = temp;
    }
}
