package Assignment1;

import java.util.Scanner;

public class String_isPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println(isPalindrome(word));

    }
    public static boolean isPalindrome(String word){
        int size = word.length()-1;
        for(int index = size; index > size/2 ; index--){
            if(word.charAt(index) != word.charAt(size - index)){
                return false;
            }
        }
        return true;
    }
}
