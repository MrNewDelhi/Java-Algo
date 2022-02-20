package Lec_16;

public class ExponentialPower {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(expPow(x,n));
    }
    public static int expPow(int x, int n){
        if(n == 0){
            return 1;
        }
        int sp = expPow(x,n-1);
        return x * sp;
    }
}
