package Lec_3;

public class Pat_1 {
    public static void main(String[] args) {
        int n = 5;
        int nst = n;
        int row = 1;
        while (row <= n) {
            int cst = 1; //cst is current star
            while (cst <= nst) { //nst is number of star in each row
                System.out.print("*  ");
                cst++;
            }
            System.out.println();
            row++;
        }
    }
}
