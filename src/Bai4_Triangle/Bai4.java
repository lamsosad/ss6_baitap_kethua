package Bai4_Triangle;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập độ dài cạnh a của tam giác: ");
        double a = input.nextDouble();
        System.out.print("Nhập độ dài cạnh b của tam giác: ");
        double b = input.nextDouble();
        System.out.print("Nhập độ dài cạnh c của tam giác: ");
        double c = input.nextDouble();
        Triangle triangle = new Triangle(a,b,c);
        triangle.setSide1(a);
        triangle.setSide2(b);
        triangle.setSide3(c);
        System.out.println("tam giác có Chiều cao: "+triangle.height()+"và các Cạnh là: "+triangle.toString());
        System.out.println("Tam giác có Diện tích là: "+triangle.getArea()+" và Chu vi là: "+triangle.getPerimeter());
    }
}
