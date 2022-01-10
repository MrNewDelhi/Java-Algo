package Assignment1;

import java.util.Scanner;

public class String_Count_Palindromic_Substrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int count = word.length();
        if(word.length() >= 2) {
            for (int index = 0; index < word.length() - 1; index++){
                if(word.charAt(index) == word.charAt(index + 1)){
                    count++;
                }
            }
        }
        if(word.length() > 2){
            for(int index_i = 0; index_i < word.length() - 2; index_i++){
                for(int index_j = index_i + 2; index_j < word.length(); index_j++){
                    count += isPalindrome(word.substring(index_i,index_j+1), count);
                }
            }
        }
        System.out.println(count);
    }
    public static int isPalindrome(String word, int count){
        for(int index = 0; index < word.length()/2 + 1; index++){
            if(word.charAt(index) != word.charAt(word.length()-1-index)){
                return 0;
            }
        }
        return 1;
    }
}
