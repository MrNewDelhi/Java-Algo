package Lec_10;

public class Spiral_2D_Array_Improved {
    public static void main(String[] args) {

        int[][] arr1 = { {11, 12, 13, 14} };
        Spiral(arr1);

        int[][] arr2 =  {   {11},
                            {12},
                            {13},
                            {14}    };
        Spiral(arr2);
    }

    public static void Spiral(int[][] arr){
        int min_row = 0;
        int max_row = arr.length-1;
        int min_column = 0;
        int max_column = arr[0].length-1;
        int count = 0;
        int total_number_of_elements = arr.length * arr[0].length;

        while(min_row<=max_row && min_column<=max_column) {

            //Part 1 : Top
            for (int c = min_column; c <= max_column && count < total_number_of_elements; c++) {
                System.out.print(arr[min_row][c] + "\t");
                count++;
            }
            min_row++;
            System.out.println();

            //Part 2 : Left
            for (int r = min_row; r <= max_row && count < total_number_of_elements; r++) {
                System.out.print(arr[r][max_column] + "\t");
                count++;
            }
            max_column--;
            System.out.println();

            //Part 3 : Bottom
            for (int c = max_column; c >= min_column && count < total_number_of_elements; c--) {
                System.out.print(arr[max_row][c] + "\t");
                count++;
            }
            max_row--;
            System.out.println();

            //Part 4 : Right
            for (int r = max_row; r >= min_row && count < total_number_of_elements; r--) {
                System.out.print(arr[r][min_column] + "\t");
                count++;
            }
            min_column++;
            System.out.println();
        }
    }
}
