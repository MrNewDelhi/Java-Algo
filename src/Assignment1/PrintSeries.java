package Assignment1;

import java.util.Scanner;

public class PrintSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int i = 1;
        while(num1 > 0){
            int res = ((3*i)+2);
            if(res % num2 != 0){
                System.out.println(res);
                num1--;
            }
            i++;
        }
    }
}
