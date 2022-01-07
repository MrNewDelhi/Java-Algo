package Lec_3;

public class Pat_6 {
    public static void main(String[] args) {
        int n = 5;
        int nst = n;
        int nsp = 8;
        int row = 1;
        while(row <= n){
            int csp = 8;
            while(csp > nsp){
                System.out.print("   ");
                csp--;
            }
            int cst = 1;
            while(cst <= nst){
                System.out.print("*  ");
                cst++;
            }
            nsp -= 2;
            row++;
            nst--;
        System.out.println();
        }
    }

}
