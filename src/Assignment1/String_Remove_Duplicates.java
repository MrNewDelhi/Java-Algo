package Assignment1;

import java.util.Scanner;

public class String_Remove_Duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        for (int index = 0; index < word.length() - 1; index++) {
            if (word.charAt(index) != word.charAt(index + 1)) {
                System.out.print(word.charAt(index));
            }
        }
        System.out.print(word.charAt(word.length()-1));
    }
}
