package Assignment1;

import java.util.Scanner;

public class From_Minimum_Number_from_Given_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for(int count = 0; count < size; count++){
            String input = sc.next();
            if(input.startsWith("D")){
                for(int counter = input.length()+1; counter > 0; counter--){
                    System.out.print(counter);
                }
            }
            else if(input.startsWith("I")){
                for(int counter = 1; counter <= input.length()+1; counter++){
                    System.out.print(counter);
                }
            }
            System.out.println();
        }
    }
}
