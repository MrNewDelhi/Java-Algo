package Lec_15;

import java.util.Scanner;

public class LongestSubstringWithAtmostKDistinctCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String str = sc.next();
        System.out.println(Substring(str, k));
    }
    public static int Substring(String str, int distinct){
        int[] arr = new int[26];
        int i = 0;
        int maxLength = 0;
        int k = 0;
        int j = 0;
        while(i < str.length()){
          char end = str.charAt(i);
          arr[end - 'a'] += 1;
          if(arr[end - 'a'] == 1){
              if(k < distinct) {
                  k++;
              }
              else{
                  char start = str.charAt(j);
                  arr[start - 'a'] -= 1;
                  if(arr[start - 'a'] == 0 && k > distinct){
                      k--;
                  }
                  j++;
              }
          }
          int length = str.substring(j, i+1).length();
          if (maxLength < length){
              maxLength = length;
          }
          i++;
        }
        return maxLength;
    }
}
