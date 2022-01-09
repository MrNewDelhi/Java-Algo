package Assignment1;

import java.util.Scanner;

public class Lower_Upper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        if(input >= '\u0041' && input <= '\u005A'){
            System.out.println("UPPERCASE");
        }
        else if(input >= '\u0061' && input <= '\u007A'){
            System.out.println("lowercase");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
