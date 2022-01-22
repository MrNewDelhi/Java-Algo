package Lec_12;

public class isPalindrome {
    public static void main(String[] args) {
        String str1 = "nitin";
        isPalin_SS(str1);
    }
    public static void isPalin_SS(String str){
        for(int i = 0; i < str.length(); i++){
            for(int j = i+1; j <= str.length(); j++){
                if(isPalin(str.substring(i,j))){
                    System.out.println(str.substring(i,j));
                }
            }
        }
    }
    public static boolean isPalin(String str){
        int start = 0;
        int end = str.length()-1;
        while(start < end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
