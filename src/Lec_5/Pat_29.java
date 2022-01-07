package Lec_5;

public class Pat_29 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int nst = 1;
        int nsp = n - 1;
        int c_num = 1;
        while(row <= n){
            int csp = 1;
            while(csp <= nsp){
                System.out.print("   ");
                csp++;
            }
            int cst = 1;
            while(cst <= nst){
                if(cst == 1 || cst == nst) {
                    System.out.print(c_num + "  ");
                }
                else{
                    System.out.print("0  ");
                }
                cst++;
            }
            nsp--;
            nst += 2;
            row++;
            c_num++;
            System.out.println();
        }
    }
}
