package Lec_4;

public class Pat_15 {
    public static void main(String[] args) {
        int n = 5;
        int nst = n;
        int nsp = 0;
        int row = 1;
        while(row <= (2*n)-1){
            int csp = 1;
            while(csp <= nsp){
                System.out.print("    ");
                csp++;
            }
            int cst = 1;
            while(cst <= nst){
                System.out.print("*   ");
                cst++;
            }
            if(row >= n){
                nst++;
                nsp-=2;
            }
            else{
                nst--;
                nsp+=2;
            }
            System.out.println();

            row++;
        }
    }
}
