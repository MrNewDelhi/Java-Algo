package Lec_4;

public class Digit_Extract {
    public static void main(String[] args) {
        int num = 12345;
        int new_num = 0;
        int mul = 1;
        while(num > 0){
            int digit = num % 10;
            System.out.println(digit);
            new_num = new_num + digit * mul;
            mul *= 10;
            num /= 10;
        }
        System.out.println(new_num);
    }
}
