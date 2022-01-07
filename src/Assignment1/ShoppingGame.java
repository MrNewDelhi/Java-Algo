package Assignment1;

import java.util.Scanner;

public class ShoppingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases > 0){
            int Aayush = sc.nextInt();
            int Harshit = sc.nextInt();
            int phones = 1;
            while(phones <= Aayush && phones <= Harshit){
                if(phones % 2 != 0){
                    Aayush -= phones;
                    phones++;
                }
                else{
                    Harshit -= phones;
                    phones++;
                }
            }
            if(phones > Aayush){
                System.out.println("Harshit");
            }
            else{
                System.out.println("Aayush");
            }
            testCases--;
        }
    }
}
