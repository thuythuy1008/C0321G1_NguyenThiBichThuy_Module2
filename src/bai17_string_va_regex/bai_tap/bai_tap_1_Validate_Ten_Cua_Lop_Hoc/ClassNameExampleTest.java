package bai17_string_va_regex.bai_tap.bai_tap_1_Validate_Ten_Cua_Lop_Hoc;

public class ClassNameExampleTest {
    private static ClassNameExample classNameExample;

    public static final String[] validClassName = new String[]{"C1234M", "A8765K", "P9540G", "A0324H", "C8952I"};
    public static final String[] invalidClassName = new String[]{"B9654A", "M9876C", "K8976L", "S5641P"};

    public static void main(String[] args) {
        classNameExample = new ClassNameExample();
        for (String className : validClassName) {
            boolean isvalid = classNameExample.validate(className);
            System.out.println("Class name is " + className + " is valid: " + isvalid);
        }
        for (String className : invalidClassName) {
            boolean isvalid = classNameExample.validate(className);
            System.out.println("Class name is " + className + " is valid: " + isvalid);
        }
    }
}
