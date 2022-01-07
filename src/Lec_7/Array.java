package Lec_7;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println(arr);
//        arr = null;
        System.out.println(arr);
        //what happen to address ? where is the 5 x 4 byte memory
        //Garbage Collector !!, memory !!, jaha par koi address nhi hota !!,
//        arr = 5;
        //finding length of the array
        int len = arr.length;
        System.out.println(len);
        System.out.println(arr.length);
//        arr[0] = 10;
        System.out.println(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "th element : " + arr[i]);
        }
        arr[2] = 99;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "th element : " + arr[i]);
        }
        arr[arr.length - 1] = 90;
    }
}
