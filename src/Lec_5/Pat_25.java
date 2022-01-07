package Lec_5;

public class Pat_25 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int nst = 1;
        int nsp = n - 1;
        int c_num = 1;
        while(row <= n){
            int csp = 1;
            while(csp <= nsp){
                System.out.print("\t");
                csp++;
            }
            int cst = 1;
            while(cst <= nst){
                System.out.print(c_num + "\t");
                cst++;
                c_num++;
            }
            nsp--;
            nst += 2;
            row++;
            System.out.println();
            System.out.println();
        }
    }
}