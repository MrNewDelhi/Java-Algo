package Lec_10;

public class Sorted_Row_And_Column {
    public static void main(String[] args) {
        int arr[][] = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 28, 37, 48},
                {29, 33, 39, 50}};
        Search(arr, 5);
    }

    public static void Search(int[][] arr, int key) {
        int row = 0;
        int column = arr.length - 1;
        while (column >= 0 && row < arr.length) {
            if (arr[row][column] == key) {
                System.out.println("Key found : " + row + "," + column);
                break;
            } else if (arr[row][column] > key) {
                column--;
            } else {
                row++;
            }
        }
    }
}
