package Bai2_Point2D_3D;

import java.util.Arrays;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập giá trị của X: ");
        float x = input.nextInt();
        System.out.print("Nhập giá trị của Y: ");
        float y = input.nextInt();
        System.out.print("Nhập giá trị của Z: ");
        float z = input.nextInt();
        Point2D d2 = new Point2D(x, y);
        Point3D d3 = new Point3D(x, y, z);
        d2.setX(x);
        d2.setY(y);
        d3.setZ(z);
        System.out.println("Hình 2D có tọa độ: " + Arrays.toString(d2.getXY()));
        System.out.println("Hình 3D có tọa độ: " + Arrays.toString(d3.getXYZ()));
    }
}
