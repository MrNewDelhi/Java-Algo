package Assignment1;

import java.util.Scanner;

public class Conversion_Fahrenheit_to_Celsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int step = sc.nextInt();
        for(;start <= end; start += step){
            int Celsius =(int)((5/9.0) * (start - 32));
            System.out.println(start + " " + Celsius);
        }
    }
}
