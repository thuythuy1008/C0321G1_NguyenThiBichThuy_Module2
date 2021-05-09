package bai7_abstract_class_va_interface.bai_tap.bai_tap_2_Interface_Colorable;

public class ColorableTest {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(3.0, 4.0, "black", false);
        Square square = new Square(3.0, "blue", true);
        Square square1 = new Square(2.0, "yellow", false);

        Rectangle[] colorables = {rectangle, square, square1};
        for (Rectangle colorable : colorables) {
            System.out.println("Area is: " + colorable.getArea());
            if (colorable.isFilled() == true) {
                colorable.howToColor();
            }
        }
    }
}
