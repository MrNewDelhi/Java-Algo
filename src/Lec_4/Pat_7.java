package Lec_4;

public class Pat_7 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int i = 1;
        while (row <= n) {
            int j = 1;
            while(j <= n){
                if(row == 1 || row == n || j == 1 || j == n){
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
                j++;
            }
            row++;
            System.out.println();
        }
    }
}
