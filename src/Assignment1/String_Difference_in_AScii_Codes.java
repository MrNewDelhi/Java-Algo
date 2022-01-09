package Assignment1;

import java.util.Scanner;

public class String_Difference_in_AScii_Codes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.print(word.charAt(0));
        for(int index = 0; index < word.length() - 1; index++){
            int difference = word.charAt(index + 1) - word.charAt(index);
            System.out.print(difference + "" + word.charAt(index+1));
        }
    }
}
