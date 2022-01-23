package Lec_13;

public class StringConcatProblem {
    public static void main(String[] args) {
        String s2 = "go".concat("od");
        //str.intern() --> it will send the string to the pool
        s2.intern();
        String s = "good";
        System.out.println(s==s2);
    }
}
