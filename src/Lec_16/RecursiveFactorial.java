package Lec_16;

import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {
        int n = 5;

    }
    public static int recFact(int n){
        if(n == 1){
            return 1;
        }
        int sp = recFact(n-1);
        return sp * n;
    }
}
