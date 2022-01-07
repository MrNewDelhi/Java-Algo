package Lec_9;

public class Wave_2D_Array {
    public static void main(String[] args) {
        int[][] arr = {{11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34},
                {41, 42, 43, 44}};
//        for (int r = 0; r < arr.length; r++) {
//            for (int c = 0; c < arr[r].length; c++) {
//                if (r % 2 != 0) {
//                    System.out.print(arr[arr[c].length - 1 - c][r] + "  ");
//                } else {
//                    System.out.print(arr[c][r] + "  ");
//                }
//            }
//            System.out.println();
//        }
        wave(arr);
    }
        public static void wave(int[][] arr){
            for(int c = 0; c < arr.length; c++){
                for(int r = 0; r < arr.length; r++){
                    int row_to_print = r;
                    if(c % 2 != 0){
                        row_to_print = arr.length - r - 1;
                    }
                    System.out.print(arr[row_to_print][c] + "  ");
                }
                System.out.println();
            }
        }
}