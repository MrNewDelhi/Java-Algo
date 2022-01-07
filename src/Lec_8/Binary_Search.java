package Lec_8;

import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5, 7, 11, 12, 15, 20, 31, 33, 35, 40, 45, 55, 58, 66, 71};
        int i = 0;
        while (i < arr.length) {
            int key = sc.nextInt();
            Binary_Search(arr, key);
            i++;
        }
    }

    public static void Binary_Search(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int NotFound = 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == arr[mid]) {
                System.out.println(mid + 1 + "th position : " + arr[mid] + " found");
                NotFound = 0;
                break;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else if (key > arr[mid]) {
                start = mid + 1;
            }
        }
        if (NotFound == 1) {
            System.out.println("Not Found");
        }
    }
////leetcode :: https://leetcode.com/problems/first-bad-version/
    public int firstBadVersion(int n) {
        int s = 1;
        int e = n;
        int ans = n;
        while (s <= e) {
            int mid = s - (s - e) / 2;
            if (isBadVersion(mid)) {
                e = mid - 1;
                ans = mid;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    private boolean isBadVersion(int mid) {
        return false;
    }
}