package bai9_danh_sach.bai_tap;

import java.util.ArrayList;

public class MylistTest {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        //sử dụng phương thức add() để thêm phần tử cho mảng languages
        languages.add("JavaScript");
        languages.add("Java");
        languages.add("Python");
        System.out.println("Các phần tử trong mảng languages: " + languages);
    }
}
