package Lec_3;

public class GCD {
    public static void main(String[] args) {
        int a1 = 50;
        int a2 = 64;

        int divisor = a1;
        int dividend = a2;

        while(true){
            int rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;

        }

    }
}
