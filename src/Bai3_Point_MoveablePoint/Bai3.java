package Bai3_Point_MoveablePoint;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập giá trị của X: ");
        float x = input.nextInt();
        System.out.print("Nhập giá trị của Y: ");
        float y = input.nextInt();
        Point p = new Point(x, y);
        MoveablePoint mp = new MoveablePoint(x, y,x,y);
        p.setX(x);
        p.setY(y);
        mp.setxSpeed(x);
        mp.setySpeed(y);
        System.out.println(p.toString());
        System.out.println(mp.toString());
        System.out.println(mp.move());
    }
}
