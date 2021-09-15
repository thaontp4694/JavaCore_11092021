import entities.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("Nhập số lượng mảnh đất: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Shape[] list = new Shape[n];
        for (int i = 0; i < n; i++) {
            System.out.format("Mảnh đất thứ %d\n", i + 1);
            System.out.print("Loại hình mảnh đất (1. Vuông / 2. Chữ Nhật / 3. Tròn / 4. Tam giác): ");
            int choose = scanner.nextInt();
            list[i] = createShape(choose);
            list[i].input();
        }
        for (Shape ls : list) {
            System.out.println(ls.toString());
        }


        double total = 0;
        for (int i = 0; i < n; i++) {
            total += list[i].calculateArea();
        }

        System.out.print("Nhập giá 1 m2: ");
        int unitPrice = scanner.nextInt();
        System.out.format("Tổng tiền = %f\n", total * unitPrice);
    }

    private static Shape createShape(int choose) {
        switch (choose) {
            case 1:
                return new Square();

            case 2:
                return new Rectangle();

            case 3:
                return new Circle();

            case 4:
                return new Triangle();
            default:
                return null;
        }
    }
}



