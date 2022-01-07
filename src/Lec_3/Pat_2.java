package Lec_3;

public class Pat_2 {
    public static void main(String[] args) {

        int row = 1;
        int n = 5;
        int nst = 1;

        while(row <= n){
            int cst =  1;
            while(cst <= nst ){
                System.out.print("*  ");
                cst++;
            }
            System.out.println();
            row++;
            nst++;
        }
    }
}
