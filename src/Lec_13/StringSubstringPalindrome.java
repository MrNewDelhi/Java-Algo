package Lec_13;

public class StringSubstringPalindrome {
    public static void main(String[] args) {
        String str = "nittin";
        Palin_SS(str);
    }

    //we did approximation because of the even length of the strings.
    public static void Palin_SS(String str){
        int count = 0;
        for(int c = 0; c < str.length(); c++){
            for(int r = 0; r+c < str.length() && c-r >= 0; r++){
                if(str.charAt(r+c) == str.charAt(c-r)){
                    count++;
                }
                else{
                    break;
                }
            }
        }

        for(double c = 0.5; c < str.length(); c++){
            for(double r = 0.5; r+c < str.length() && c-r >= 0; r++){
                if(str.charAt((int)(r+c)) == str.charAt((int)(c-r))){
                   count++;
                }
                else{
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
