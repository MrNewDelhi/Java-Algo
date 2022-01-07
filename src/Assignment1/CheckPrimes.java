package Assignment1;
import java.util.Scanner;

public class CheckPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int i = 2;
        int sqrt = (int)Math.sqrt(input);
        int NotPrime = 0;
        while(i < sqrt){
            if(input % i == 0){
                NotPrime = 1;
                break;
            }
            i++;
        }
        if(NotPrime == 1){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }
    }
}
