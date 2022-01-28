package Assignment1;

import java.util.Scanner;

public class Increasing_Decreasing_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        boolean isIncDec = true;
        if(size == 1){
            isIncDec = false;
        }
        else {
            int current = sc.nextInt();
            int next = sc.nextInt();
            if (current < next) {
                for (int i = 2; i < size; i++) {
                    current = next;
                    next = sc.nextInt();
                    if (current > next) {
                        isIncDec = false;
                    }
                }
            } else if (current > next) {
                for (int i = 2; i < size; i++) {
                    current = next;
                    next = sc.nextInt();
                    if (current < next) {
                        isIncDec = false;
                    }
                }
            } else {
                isIncDec = false;
            }
        }
        System.out.println(isIncDec);
    }
}
