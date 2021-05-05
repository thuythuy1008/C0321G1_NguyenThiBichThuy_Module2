package bai4_lop_va_doi_tuong_trong_java.bai_tap.bai_tap_1_QuadraticEquation;

public class QuadraticEquation {
    double a, b, c, delta, r1, r2;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return delta = (Math.pow(this.b,2) - (4 * this.a * this.c));
    }

    public double getRoot1() {
        return r1 = (-this.b + Math.pow(delta,0.5))/ (2 * this.a);
    }

    public double getRoot2() {
        return r2 = (-this.b - Math.pow(delta,0.5))/ (2 * this.a);
    }

    public String display() {
        return "QuadraticEquation{" + "a=" + a + ", b=" + b + " , c=" + c + "}";
    }
}
