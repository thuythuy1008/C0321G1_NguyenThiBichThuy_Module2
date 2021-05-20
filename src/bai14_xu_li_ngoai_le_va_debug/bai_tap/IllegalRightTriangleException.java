package bai14_xu_li_ngoai_le_va_debug.bai_tap;

class IllegalRightTriangleException extends Exception {

    public IllegalRightTriangleException() {
    }

    public String getString() {
        return " Giá trị nhập vào là phải là số dương hoặc tổng 2 cạnh phải lớn hơn cạnh còn lại" +
                "\n --> Đây không phải là 3 cạnh của 1 tam giác";
    }
}
