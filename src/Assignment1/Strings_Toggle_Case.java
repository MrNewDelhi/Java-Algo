package Assignment1;

import java.util.Scanner;

public class Strings_Toggle_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        for (int character_index = 0; character_index < word.length(); character_index++) {
            if (word.charAt(character_index) >= '\u0041' && word.charAt(character_index) <= '\u005A') {
                System.out.print((char)(word.charAt(character_index) + 32));
            }
            else if (word.charAt(character_index) >= '\u0061' && word.charAt(character_index) <= '\u007A') {
                System.out.print((char)(word.charAt(character_index) - 32));
            }
        }
    }
}
