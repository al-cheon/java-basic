package basic.java.clasic.utils;

import org.springframework.beans.BeanUtils;

import java.util.Arrays;

public class CloneTest {
    public static void main(String[] args) {

        Circle circle = new Circle(new Point(1), 1.0);
        Circle clone = circle.clone();

        System.out.println(circle);
        System.out.println(clone);

        clone.p.digit = 2;
        clone.r = 2.0;
        System.out.println(circle);
        System.out.println(clone);


    }
}

class Point {
    int digit;

    public Point(int digit) {
        this.digit = digit;
    }
}

class Circle implements Cloneable {
    Point p;
    double r;

    public Circle(Point p, double r) {
        this.p = p;
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circld {Point (" + p.digit + "), " + r + "}";
    }

    @Override
    protected Circle clone() {
        Circle o = null;
        try {
            o = (Circle)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        o.p = new Point(o.p.digit); //todo) 깊은 복사
        return o;
    }
}