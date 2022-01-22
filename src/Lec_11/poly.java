package Lec_11;

public class poly {
    public static void main(String[] args) {
        int x = 7;
        int n = 3;
        int pow = x;
        int sum = 0;
        while(n >= 1) {
            sum = sum + pow * n;
            pow = pow * x;
            n--;
        }
        System.out.println(sum);
    }
}
