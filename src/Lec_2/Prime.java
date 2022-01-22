package Lec_2;

public class Prime {
    public static void main(String[] args) {
        int num = 6;
        int n = 2;
        int factors = 1;
        while(n <= num){
//            System.out.println(n);
//            check if n is a factor of num!!
            if(num % n == 0){
//                then n is a factor
                factors = factors + 1;
            }
            n=n+1;
        }
//        System.out.println(factors);
        if(factors == 2){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
