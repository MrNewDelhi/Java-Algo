package Lec_15;

public class PrintIncDec {
    public static void main(String[] args) {
        int value = 4;
        rec(value, 1);
    }

    public static void rec(int value, int start) {
        // BP : print 1 at start and at end 1
        // SP : print 2 3 4 4 3 2
        if (start == value + 1) {
            return;
        }
        System.out.println(start);
        rec(value, start + 1);
        System.out.println(start);
    }
}
