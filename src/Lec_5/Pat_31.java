package Lec_5;

public class Pat_31 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        while(row <= n){
            int i = 5;
            while(i >= 1){
                if(i == row){
                    System.out.print("*  ");
                }
                else {
                    System.out.print(i + "  ");
                }
                i--;
            }
            System.out.println();
            row++;
        }
    }
}
