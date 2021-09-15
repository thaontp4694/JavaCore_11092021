package entities;

import entities.Point;
import entities.Shape;

import java.util.Scanner;

public class Rectangle extends Shape {
    private Point topLeft;
    private int width, height;

    public Rectangle() {
    }

    public Rectangle(Point topLeft, int width, int height) {
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }


    @Override
    public void input() {
        System.out.println("Nhập tọa độ điểm trái trên: ");
        System.out.print("x = ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.print("y = ");
        int y = scanner.nextInt();
        this.topLeft = new Point(x, y);

        System.out.print("Nhập chiều dài: ");
        this.height = scanner.nextInt();
        System.out.print("Nhập chiều rộng: ");
        this.width = scanner.nextInt();
    }
    //Tính diện tích đất
    @Override
    public double calculateArea() {
        return this.width * this.height;
    }
    @Override
    public String toString() {
        Rectangle rectangle = new Rectangle();
        final StringBuffer sb = new StringBuffer("Miếng đất hình chữ nhật {");
        sb.append("Điểm trái trên = ").append(topLeft.toString());
        sb.append(", chiều dài = ").append(height);
        sb.append(", chiều rộng = ").append(width);
        sb.append(" ,diện tích: ").append(calculateArea());
        sb.append('}');
        return sb.toString();
    }


}