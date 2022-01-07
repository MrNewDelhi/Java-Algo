package Lec_4;

public class Pat_18 {
    public static void main(String[] args) {
        int n = 7;
        int row = 1;
        int nst = 1;
        int nsp = 3;
        while(row <= n){
            int csp = 1;
            while(csp <= nsp){
                System.out.print("   ");
                csp++;
            }
            int cst = 1;
            while(cst <= nst){
                System.out.print("*  ");
                cst++;
            }
            row++;
            if(row > ((n/2) + 1)){
                nst-=2;
                nsp++;
            }
            else{
                nst+=2;
                nsp--;
            }
            System.out.println();
        }
    }
}
