package Lec_13;

//Input : The sky is blue
//Output : blue is sky The
public class ReverseWordsInASentence {
    public static void main(String[] args) {
        String str = "The sky is blue";
        tokenization(str);

    }
    public static void tokenization(String str){
        while(str.lastIndexOf(" ") != -1){
            System.out.println(str.substring(str.lastIndexOf(" ")+1));
            str = str.substring(0, str.lastIndexOf(" "));
        }
        System.out.println(str);
    }
}
