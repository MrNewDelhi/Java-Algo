package Lec_16;

public class FibonacciRecursive {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fibRec(n));
    }
    public static int fibRec(int n){
        if(n <= 1){
            return n;
        }
        int sp1 = fibRec(n-1);
        int sp2 = fibRec(n-2);
        return sp1 + sp2;
    }
}
