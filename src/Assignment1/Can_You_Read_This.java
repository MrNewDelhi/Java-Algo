package Assignment1;

import java.util.Scanner;

public class Can_You_Read_This {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.print(line.charAt(0));
        for(int character = 1; character < line.length(); character++){
            if(line.charAt(character) >= '\u0041' && line.charAt(character) <= '\u005A'){
                System.out.println();
                System.out.print(line.charAt(character));
            }
            else{
                System.out.print(line.charAt(character));
            }
        }
    }
}
