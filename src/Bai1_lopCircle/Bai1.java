package Bai1_lopCircle;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập bán kính: ");
        double r = input.nextInt();
        System.out.print("Nhập chiều cao: ");
        double h = input.nextInt();
        Circle_hinhtron circle = new Circle_hinhtron(r, "green");
        Cylinder_hinhtru cylinder = new Cylinder_hinhtru(h, r, "green");
        circle.setRadius(r);
        cylinder.setHeight(h);
        System.out.println("Diện tích hình tròn là : " + circle.getArea());
        System.out.println("Thể tích khối trụ có bán kính: " + circle.getRadius() + " và chiều cao: " + cylinder.getHeight() + " là: \n" + cylinder.getHeight() + " x " + circle.getArea() + " = " + cylinder.getVolume());
    }
}
