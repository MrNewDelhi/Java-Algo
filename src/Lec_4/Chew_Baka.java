package Lec_4;

public class Chew_Baka {
    public static void main(String[] args) {
        int num = 12345;
        int new_num = 0;
        int mul = 1;
        while(num > 0){
            int digit = num % 10;
            if(digit >= 5){
                digit = 9 - digit;
            }
            new_num = new_num + digit * mul;
            mul *= 10;
            num /= 10;
        }
        System.out.println(new_num);
    }
}
