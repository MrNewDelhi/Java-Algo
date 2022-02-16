package Lec_15;

public class PrintDecInc {
    public static void main(String[] args) {
        int value = 4;
        rec(value);
    }
    public static void rec(int value){
        // BP : print 4 at start and at end 4
        // SP : print 3 2 1 1 2 3
        if(value == 0){
            return;
        }
        System.out.println(value);
        rec(value-1);
        System.out.println(value);
    }
}
