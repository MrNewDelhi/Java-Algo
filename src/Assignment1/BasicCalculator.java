package Assignment1;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            char ch = sc.next().charAt(0);
            if(ch == 'X' || ch == 'x'){
                break;
            }
            else {
                if(ch == '+'){
                    long num1 = sc.nextLong();
                    long num2 = sc.nextLong();
                    System.out.println(num1 + num2);
                }
                else if(ch == '-'){
                    long num1 = sc.nextLong();
                    long num2 = sc.nextLong();
                    System.out.println(num1 - num2);
                }
                else if(ch == '*'){
                    long num1 = sc.nextLong();
                    long num2 = sc.nextLong();
                    System.out.println(num1 * num2);
                }
                else if(ch == '/'){
                    long num1 = sc.nextLong();
                    long num2 = sc.nextLong();
                    System.out.println(num1 / num2);
                }
                else if(ch == '%'){
                    long num1 = sc.nextLong();
                    long num2 = sc.nextLong();
                    System.out.println(num1 % num2);
                }
                else {
                    System.out.println("Invalid operation. Try again.");
                }
            }
        }
    }
}
