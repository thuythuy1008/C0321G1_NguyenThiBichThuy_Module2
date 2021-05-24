package bai14_xu_li_ngoai_le_va_debug.bai_tap;

import java.util.Scanner;

public class CheckSidesOfTriangle {
    static void validate(int a, int b, int c) throws IllegalRightTriangleException {
        if ((a + b < c || a + c < b || b + c < a || a <= 0 || b <= 0 || c <= 0)) {
            throw new IllegalRightTriangleException("Đây không phải là 3 cạnh của 1 tam giác");
        } else {
            System.out.println("Đây là 3 cạnh của 1 tam giác!!!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Hãy nhập cạnh a: ");
                int a = scanner.nextInt();
                System.out.println("Hãy nhập cạnh b: ");
                int b = scanner.nextInt();
                System.out.println("Hãy nhập cạnh c: ");
                int c = scanner.nextInt();
                validate(a, b, c);
                break;
            } catch (IllegalRightTriangleException e) {
                System.out.println("Ecxeption occured:" + e);
                System.out.println("Giá trị nhập vào là phải là số dương hoặc tổng 2 cạnh phải lớn hơn cạnh còn lại");
                System.out.println("Mời bạn nhập lại!!!");
            }
        }
    }
}
