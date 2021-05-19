package bai14_xu_li_ngoai_le_va_debug.bai_tap;

public class RightTriangle {
    public RightTriangle(int side1, int side2, int side3) throws IllegalRightTriangleException {
        if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1 || side1 <= 0 || side2 <= 0 || side3 <= 0)
            throw new IllegalRightTriangleException();
        else {
            System.out.println("Đây là 3 cạnh của 1 tam giác");
        }
    }
}
