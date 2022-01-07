package Lec_2;
import java.util.*;
public class Rev_Number {
    public static void main(String[] args) {
        int num = 6318;
        int ans = 0;
        while(num > 0){
            int digit = num % 10;
            ans = ans * 10 + digit;
//            System.out.println(digit);
            num = num / 10;
        }
        System.out.println(ans);
    }
}
