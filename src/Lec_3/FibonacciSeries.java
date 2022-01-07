package Lec_3;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 5;
        int i = 0;
        int a = 0;
        int b = 1;
        while(i < n){
            int c = a + b;
            System.out.println(a);
            a = b;
            b = c;
            i++;
        }
    }
}
