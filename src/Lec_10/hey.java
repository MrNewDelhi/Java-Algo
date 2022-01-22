package Lec_10;
import java.util.*;
public class hey {
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                long N=sc.nextLong();
                long rev=0,pow=1;
                if(N == 0){
                    System.out.println(5);
                }
                else {
                    while (N != 0) {
                        long dig = N % 10;
                        if (dig == 0) {
                            dig = 5;
                        }
                        rev += dig * pow;//2+50+100
                        pow *= 10;
                        N /= 10;
                    }
                    System.out.println(rev);
                }
            }
        }