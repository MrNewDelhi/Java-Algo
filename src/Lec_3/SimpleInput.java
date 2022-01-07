package Lec_3;

import java.util.Scanner;

public class SimpleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sum >= 0) {
            int i = sc.nextInt();
            sum += i;
            if (sum >= 0) {
                System.out.println(i);
            }
        }
    }
}