package Lec_2;
import java.util.*;
public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = 0;
        int ans = 0;
        while (n <= num) {
            ans += n;
            System.out.println(n);
            n = n + 1;
        }
        System.out.println(ans);
    }
}