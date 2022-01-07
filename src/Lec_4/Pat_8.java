package Lec_4;

public class Pat_8 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int i = 1;
        while (row <= n) {
            int j = 1;
            while(j <= n){
                if(row == j){
                    System.out.print("*  ");
                }
                else if(row == ((n-j)+1)){
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
