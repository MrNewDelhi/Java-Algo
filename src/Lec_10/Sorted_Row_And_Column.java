package Lec_10;

public class Sorted_Row_And_Column {
    public static void main(String[] args) {
        int arr[][] = { {10,20,30,40},
                        {15,25,35,45},
                        {27,28,37,48},
                        {29,33,39,50} };
    }
    public static void Search(int[][] arr, int key){
        int row =
    }
    public static int BinarySearch(int[][] arr, int start, int end, int row, int column, int key){
        int ans = 0;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[row][mid] == key){
                ans = mid;
            }
            else if(arr[row][mid] > key){
                end = mid - 1;
            }
            else if(arr[row][mid] < key)
        }
        return ans;
    }
}
