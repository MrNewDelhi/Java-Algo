package Assignment1;

import java.util.Scanner;

public class Revising_Quadratic_Equations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = (b * b) - (4 * a * c);
        if(d > 0){
            System.out.println("Real and Distinct");
            int root1 = (-b + (int)(Math.sqrt(d)))/(2 * a);
            int root2 = (-b - (int)(Math.sqrt(d)))/(2 * a);
            System.out.print(root2 + " " + root1);
        }
        else if(d == 0){
            System.out.println("Real and Equal");
            int root = (-b/(2 * a));
            System.out.print(root + " " + root);
        }
        else {
            System.out.println("Imaginary");
        }
    }
}
