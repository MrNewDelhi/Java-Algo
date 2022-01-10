package Assignment1;

import java.util.Scanner;

public class Playing_with_Good_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int max = 0;

        for (int start = 0; start < word.length(); start++) {
            int length = 0;
            if (isVowel(word.charAt(start))) {
                length++;
                for (int end = start + 1; end < word.length(); end++) {
                    if (isVowel(word.charAt(end))) {
                        length++;
                    }
                    else{
                        break;
                    }
                }
            }
            if(length > max){
                max = length;
            }
        }
        System.out.println(max);
    }

    public static boolean isVowel(char character) {
        String vowels = "aeiou";
        for (int index = 0; index < vowels.length(); index++) {
            if (character == vowels.charAt(index)) {
                return true;
            }
        }
        return false;
    }
}
