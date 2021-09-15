package entities;

import java.util.Scanner;

public class Triangle extends Shape {
    private Point p1, p2, p3;

    public Triangle() {
    }

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public double chuVi() {
        int result = 0;
        result += this.p1 + this.p2 + this.p3;
        return result;
    }

    public double calculateArea() {
        double dienTich;
        double p = chuVi() / 2;
        dienTich = Math.sqrt(p * (p - this.p1) * (p - this.p2) * (p - this.p3));
        return dienTich;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Miếng đất hình tam giác {");
        sb.append("đỉnh A: ").append(p1);
        sb.append(", đỉnh B: ").append(p2);
        sb.append(", đỉnh C: ").append(p3);
        sb.append(')');
        return sb.toString();
    }


    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập đỉnh A: ");
        this.p1 = scanner.nextInt();
        System.out.print("Nhập đỉnh B: ");
        this.p2 = scanner.nextInt();
        System.out.print("Nhập đỉnh C: ");
        this.p3 = scanner.nextInt();
    }
}
