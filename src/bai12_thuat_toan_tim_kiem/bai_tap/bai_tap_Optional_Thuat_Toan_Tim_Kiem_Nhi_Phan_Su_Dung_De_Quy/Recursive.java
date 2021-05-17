package bai12_thuat_toan_tim_kiem.bai_tap.bai_tap_Optional_Thuat_Toan_Tim_Kiem_Nhi_Phan_Su_Dung_De_Quy;

import java.util.Arrays;
import java.util.Scanner;

public class Recursive {
    public static void main(String[] args) {
        System.out.println("Nhập vào độ dài của mảng: ");
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            size = scanner.nextInt();
        } while (size <= 0);
        int[] arr = input(size);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhập vào số mà bạn muốn tìm kiếm: ");
        int value = scanner.nextInt();
        int left = 0, right = size - 1;
        System.out.println("Vị trí index của phần tử trong mảng là: " + binarySearch(arr, left, right, value));

    }

    private static int[] input(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập vào phần tử thứ " + i);
            Scanner scanner = new Scanner(System.in);
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    static int binarySearch(int[] arr, int left, int right, int value) {
        left = 0;
        right = arr.length - 1;
        while (right >= left) {
            int mid = (left + right) / 2;
            if (value < arr[mid])
                right = mid - 1;
            else if (value == arr[mid])
                return mid;
            else
                left = mid + 1;
        }
        return -1;
    }
}
