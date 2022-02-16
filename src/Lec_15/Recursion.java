package Lec_15;
// identify bigger problem
// identify smaller problem
// assume it works
// create bigger solution from smaller solution
public class Recursion {
    public static void main(String[] args) {
        int value = 4;
        rec(4);
    }
    public static void rec(int value){
        // BP : PD (n)
        // SP : PD (n-1)
        if(value == 0){
            return;
        }
        System.out.println(value);
        rec(value-1);

    }
    public static void rec1(int value){
        // BP : PD (n)
        // SP : PD (n-1)

        System.out.println(value);
        if(value > 0) {
            rec1(value - 1);
        }
    }
}
