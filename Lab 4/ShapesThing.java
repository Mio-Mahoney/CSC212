package shapes;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class ShapesThing {
    public static void main(String[] args) {
        SSquare square = new SSquare(400);
        System.out.println("sqaure: " + square.toString());
        System.out.println("area of square: " +  square.area());
        System.out.println("Perimeter of sqaure: " + square.perimeter());
        System.out.println("Diagonal of square: " + square.diagonal());

        SCircle disk = square.inscribingCircle();
        System.out.println("disk: " + disk.toString());
        System.out.println("disk area: " + disk.area());
        System.out.println("disk perimeter: " + disk.perimeter());

        SSquare diamond = disk.inscribingSquare();
        System.out.println("diamond: " + diamond.toString());

    }
}
