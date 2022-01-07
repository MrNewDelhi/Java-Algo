package Lec_4;

public class Prime_Factors {
    public static void main(String[] args) {
        int num = 26;
        int fact = 2;
        while(num > 1){
            if(num % fact == 0){
                System.out.println(fact);
                num /= fact;
            }
            else{
                fact++;
            }
        }
    }
}
