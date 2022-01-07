package Lec_4;

public class Pat_13 {
    public static void main(String[] args) {
        int n = 5;
        int row = (2*(n)) - 1;
        int nst = 1;
        int i = 1;
        while(i <= row){
            int cst = 1;
            while(cst <= nst){
                System.out.print("*   ");
                cst++;
            }
            if(i >= n){
                nst--;
            }
            else {
                nst++;
            }
            i++;
            System.out.println();
        }
    }
}
