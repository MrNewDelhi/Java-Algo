package Lec_16;

public class FibonacciRecursive {
    public static void main(String[] args) {
        int n = 5;

    }
    public static int fibRec(int n){
        if(n == 0 || n == -1 ){
            return 0;
        }
        int sp = fibRec(n-1) + fibRec(n-2);
        return n + sp;
    }
}
