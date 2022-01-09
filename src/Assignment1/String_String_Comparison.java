package Assignment1;
import java.util.*;
public class String_String_Comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int frequency = 1;
        int size = input.length();
        if (size == 1) {
            System.out.print(input.charAt(0));
        } else {
            for (int current = 0; current < size - 1; current++) {
                int next = current + 1;
                if (input.charAt(current) == input.charAt(next)) {
                    frequency++;
                } else if (frequency != 1) {
                    System.out.print(input.charAt(current) + "" + frequency);
                    frequency = 1;
                } else {
                    System.out.print(input.charAt(current) + "");
                }
            }
            if (input.charAt(size - 1) == input.charAt(size - 2)) {
                System.out.print(input.charAt(size - 1) + "" + frequency);
            } else {
                System.out.print(input.charAt(size - 1));
            }
        }
    }
}
