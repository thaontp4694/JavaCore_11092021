package entities;

import java.util.Scanner;

public class Triangle extends Shape {
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle() {
    }

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double calculatePerimeter() {
        double a = this.p1.distance(this.p2);
        double b = this.p1.distance(this.p3);
        double c = this.p2.distance(this.p3);
        return a + b + c;
    }

    public double calculateArea() {
        double a = this.p1.distance(this.p2);
        double b = this.p1.distance(this.p3);
        double c = this.p2.distance(this.p3);
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm A: ");
        int p1 = scanner.nextInt();
        System.out.print("Nhập điểm B: ");
        int p2 = scanner.nextInt();
        System.out.print("Nhập điểm C: ");
        int p3 = scanner.nextInt();
    }

    @Override
    public String toString() {
        Triangle triangle = new Triangle();
        final StringBuilder sb = new StringBuilder("Miếng đất hình tam giác {");
        sb.append("đỉnh A: ").append(p1);
        sb.append(", đỉnh B: ").append(p2);
        sb.append(", đỉnh C: ").append(p3);
        sb.append(", diện tích: ").append(calculateArea());
        sb.append('}');
        return sb.toString();
    }


}
