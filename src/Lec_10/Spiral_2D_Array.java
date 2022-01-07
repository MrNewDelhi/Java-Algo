package Lec_10;
public class Spiral_2D_Array {
    public static void main(String[] args) {

        int[][] arr = {  {11,12,13,14},
                         {21,22,23,24},
                         {31,32,33,34},
                         {41,42,43,44}  };
        Spiral(arr);
    }

    public static void Spiral(int[][] arr){
        int min_row = 0;
        int max_row = arr.length-1;
        int min_column = 0;
        int max_column = arr[0].length-1;
        while(min_row<max_row && min_column<max_column) {

            //Part 1 : Top
            for (int c = min_column; c <= max_column; c++) {
                System.out.print(arr[min_row][c] + "\t");
            }
            min_row++;
            System.out.println();

            //Part 2 : Left
            for (int r = min_row; r <= max_row; r++) {
                System.out.print(arr[r][max_column] + "\t");
            }
            max_column--;
            System.out.println();

            //Part 3 : Bottom
            for (int c = max_column; c >= min_column; c--) {
                System.out.print(arr[max_row][c] + "\t");
            }
            max_row--;
            System.out.println();

            //Part 4 : Right
            for (int r = max_row; r >= min_row; r--) {
                System.out.print(arr[r][min_column] + "\t");
            }
            min_column++;
            System.out.println();
        }
    }
}
