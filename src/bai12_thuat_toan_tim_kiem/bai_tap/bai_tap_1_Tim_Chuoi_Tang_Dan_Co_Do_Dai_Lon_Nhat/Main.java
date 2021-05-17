package bai12_thuat_toan_tim_kiem.bai_tap.bai_tap_1_Tim_Chuoi_Tang_Dan_Co_Do_Dai_Lon_Nhat;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi: ");
        String string = scanner.nextLine();

        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }

        System.out.println("Chuỗi tăng dần dài nhất là: ");
        for (Character character : max) {
            System.out.print(character);
        }
    }
}
