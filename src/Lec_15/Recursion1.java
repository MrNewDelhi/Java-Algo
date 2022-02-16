package Lec_15;

public class Recursion1 {
    public static void main(String[] args) {
        int value = 4;
        rec(4);
    }
    public static void rec(int value){
        // BP : print 4
        // SP : print 1 2 3
        if(value > 1) {
            rec(value - 1);
        }
        System.out.println(value);
    }
}
