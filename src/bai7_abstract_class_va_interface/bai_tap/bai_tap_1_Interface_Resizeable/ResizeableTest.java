package bai7_abstract_class_va_interface.bai_tap.bai_tap_1_Interface_Resizeable;

public class ResizeableTest {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0);
        Rectangle rectangle = new Rectangle(2.0, 3.0);
        Square square = new Square(4.0);
        double[] resizeableTest = new double[3];

        System.out.println("Before resizing: ");
        resizeableTest[0] = circle.getArea();
        resizeableTest[1] = rectangle.getArea();
        resizeableTest[2] = square.getArea();
        for (double resizeable : resizeableTest) {
            System.out.println(resizeable);
        }

        System.out.println("After resizing: ");
        for (double resizeable : resizeableTest) {
            System.out.println(Math.floor(resizeable * circle.resize(Math.random() * 100)));
        }
    }
}
