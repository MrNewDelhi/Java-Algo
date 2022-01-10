package Assignment1;

import java.util.Scanner;

public class Strings_Odd_Even_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        for(int index = 0; index < word.length(); index++){
            if(index % 2 == 0){
                System.out.print((char)(word.charAt(index) + 1));
            }
            else{
                System.out.print((char)(word.charAt(index) - 1));
            }
        }
    }
}
