package bai13_thuat_toan_sap_xep.bai_tap.bai_tap_1_Minh_Hoa_Thuat_Toan_Sap_Xep_Chen;

import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSortByStep(list);
    }

    public static void insertionSortByStep(int[] list) {
        int pos, x;
        for (int i = 1; i < list.length; i++) {
            System.out.println("X = " + list[i] + " and Pos = " + i);
            x = list[i];
            pos = i;

            while (pos > 0 && x < list[pos - 1]) {
                System.out.println("Swap " + list[pos] + " with " + list[pos - 1]);
                int temp = list[pos];
                list[pos] = list[pos - 1];
                list[pos - 1] = temp;
                pos--;
            }
            list[pos] = x;

            System.out.print("List after the  " + i + " sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }

    }
}
