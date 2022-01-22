package Lec_12;

import java.util.Arrays;

//soe
public class PrimeNumbersTillN {
    public static void main(String[] args) {
        int n = 25;
        SOE(n);
    }
    public static void SOE(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        for(int i = 2; i*i <= n; i++){
            for(int prod = i + i; prod <= n; prod += i){
                isPrime[prod] = false;
            }
        }
        for(int i = 2; i <= n; i++){
            if(isPrime[i]){
                System.out.println(i);
            }
        }

    }
}
