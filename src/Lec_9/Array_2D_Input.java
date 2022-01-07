package Lec_9;

public class Array_2D_Input {
    public static void main(String[] args) {
        int rows = 2;
        int columns = 5;
        int[][] arr = new int[rows][columns];
        arr[0] = new int[10]; //jagged array : when each row is not uniform

        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[r].length; c++){
                arr[r][c] = c;
            }
        }

        for(int[] row : arr){
            for(int column : row){
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
