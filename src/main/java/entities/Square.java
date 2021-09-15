package entities;

import java.util.Scanner;

public class Square extends Shape {
    private Point topLeft;
    private int width;

    public Square() {
    }

    public Square(Point topLeft, int width) {
        this.topLeft = topLeft;
        this.width = width;
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

        System.out.print("Nhập chiều rộng: ");
        this.width = scanner.nextInt();
    }

    //Tính diện tích đất
    @Override
    public double calculateArea() {
        return this.width * this.width;
    }

    @Override
    public String toString() {
        Square square = new Square();
        final StringBuffer sb = new StringBuffer("Miếng đất hình vuông {");
        sb.append("Điểm trái trên = ").append(topLeft.toString());
        sb.append(", chiều rộng = ").append(width);
        sb.append(", diện tích = ").append(calculateArea());
        sb.append('}');
        return sb.toString();
    }

}
