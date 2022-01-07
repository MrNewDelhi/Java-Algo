package Lec_4;

public class Pat_21 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int nst = 1;
        int nsp = ((2 * n) - 1) - nst;
        while(row <= n){
            int cst = 1;
            while(cst <= nst){
                System.out.print("*  ");
                cst++;
            }
            int csp = 1;
            while(csp < nsp){
                System.out.print("   ");
                csp++;
            }
            int cst1 = 1;
            while(cst1 <= nst){
                System.out.print("*  ");
                cst1++;
                if(cst1 == n){
                    break;
                }
            }
            nsp-=2;
            if(nst < n) {
                nst++;
            }
            row++;
            System.out.println();
        }
    }
}
