package Assignment1;

import java.util.Scanner;

public class Strings_Max_Frequency_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int max_frequency = 0;
        char max = ' ';
        for(int index_i = 0; index_i < word.length(); index_i++){
            int frequency = 0;
            for(int index_j = index_i; index_j < word.length(); index_j++){
                if(word.charAt(index_i) == word.charAt(index_j)){
                    frequency++;
                }
            }
            if(frequency > max_frequency){
                max_frequency = frequency;
                max = word.charAt(index_i);
            }
        }
        System.out.println(max);
    }
}
