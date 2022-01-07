package Lec_9;
public class Sorting_Algorithm {
    public static void main(String[] args) {
        int[] arr = {50, 40, 45, 20, 10};
//        Bubble_Sort(arr);
//        Selection_Sort_enhanced(arr);
//        Selection_Sort(arr);
//        Selection_Sort_Sir(arr);
//        Insertion_Sort(arr);
    }
    public static void Bubble_Sort(int[] arr){
        int end = arr.length;
        for (int start = 0; start < end; end--) {
            for(int i = start+1; i < end; i++) {
                if (arr[start] > arr[i]) {
                    swap(arr, start, i);
                    start++;
                }
            }
            start = 0;
            display(arr);
        }
    }

    public static void Selection_Sort_Sir(int[] arr){
        for(int last = arr.length - 1; last >= 1; last--){
            int max = last;
            for(int i = 0; i <= last; i++){
                if(arr[i] > arr[max]){
                    max = i;
                }
            }
            if(last != max) {
                swap(arr, max, last);
            }
            display(arr);
        }
    }

    public static void Selection_Sort(int[] arr){
        int end = arr.length - 1;
        for(int start = 0; start < end; end--){
            int max_index = 0;
            for(int i = 1; i <= end; i++){
                if(arr[max_index] < arr[i]){
                    max_index = i;
                }
                start++;
            }
            if(end != max_index) {
                swap(arr, max_index, end);
            }
            start = 0;
            display(arr);
        }
    }

    public static void Selection_Sort_enhanced(int[] arr){
        int end = arr.length - 1;
        for(int start = 0; start < end; end--){
            boolean asc = false;
            int max_index = 0;
            for(int i = 1; i <= end; i++){
                if(arr[max_index] < arr[i]){
                    max_index = i;
                }
                start++;
            }
            swap(arr,max_index,end);
            start = 0;
            for (int element = 0; element < end-1; element++) {
                if(arr[element] > arr[element+1]){
                    asc = false;
                    break;
                }
                else{
                    asc = true;
                }
            }
            display(arr);
            if(asc){
                break;
            }
        }
    }

    public static void Insertion_Sort(int[] arr) {
        for (int last_index = 1; last_index < arr.length; last_index++) {
            int index = last_index - 1;
            int num = arr[last_index];
            while (index != -1 && arr[index] > num) {
                arr[index + 1] = arr[index];
                index--;
            }
            arr[index + 1] = num;
            display(arr);
        }
    }

    public static void rev(int[] arr, int start, int end){
        for(; start < end; start++,end--){
            swap(arr,start,end);
        }
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void display(int[] arr){
        for (int elements : arr) {
            System.out.print(elements + " ");
        }
        System.out.println();
    }
}