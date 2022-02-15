package Lec_15;

import java.util.Scanner;

public class LongestSubstringWithAtmostKDistinctCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String str = sc.next();
        Substring(str, k);
    }
    public static void Substring(String str, int distinct){
        int[] batua = new int[26];
        int s = 0;
        int e = 0;
        int score = 0;
        int ans = 0;
        while(e < str.length()){
            if(score <= distinct){
                char ch = str.charAt(e);
                if(batua[ch-'a']==0){
                    score++;
                }
                batua[ch-'a']++;
                e++;
            } else {
                char ch = str.charAt(s);
                if(batua[ch-'a']==1){
                    score--;
                }
                batua[ch-'a']--;
                s++;
            }
            if(score <= distinct){
                System.out.println(str.substring(s,e) + " = " + score + "{" + s + "," + e +"}");
                ans = Math.max(e-s,ans);
            }
        }
    }
}
