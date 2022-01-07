package Lec_2;
import java.util.*;
public class ReportCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        System.out.println("input 1 is taken");
        int marks1 = sc.nextInt();
        System.out.println("input 2 is taken");
        int marks2 = sc.nextInt();
        System.out.println("input 3 is taken");

        System.out.println(marks);
        System.out.println(marks1);
        System.out.println(marks2);
//        sc.close();

        if (marks >= 90 && marks < 100){
            System.out.println("A");
        }
        else if(marks >= 80 && marks < 90){
            System.out.println("B");
        }
        else if(marks >= 70 && marks < 80){
            System.out.println("C");
        }
        else if(marks >= 60 && marks < 70){
            System.out.println("D");
        }
        else if(marks >= 50 && marks < 60){
            System.out.println("E");
        }
        else{
            System.out.println("F");
        }
        System.out.println("END");
    }
}
