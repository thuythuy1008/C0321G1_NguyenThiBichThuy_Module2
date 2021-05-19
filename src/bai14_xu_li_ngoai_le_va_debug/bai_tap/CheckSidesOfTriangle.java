package bai14_xu_li_ngoai_le_va_debug.bai_tap;

import java.util.Scanner;

public class CheckSidesOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập cạnh a: ");
        int a = scanner.nextInt();
        System.out.println("Hãy nhập cạnh b: ");
        int b = scanner.nextInt();
        System.out.println("Hãy nhập cạnh c: ");
        int c = scanner.nextInt();
        CheckSidesOfTriangle check = new CheckSidesOfTriangle();
        check.checkSide(a, b, c);
    }

    public void checkSide(int a, int b, int c) {
        try {
            RightTriangle rightTriangle = new RightTriangle(a, b, c);
        } catch (IllegalRightTriangleException e) {
            System.out.println(e.getString());
        }
    }
}
