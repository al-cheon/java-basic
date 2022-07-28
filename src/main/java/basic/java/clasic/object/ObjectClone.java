package basic.java.clasic.object;

public class ObjectClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point original = new Point(3, 5);
        Point clone = original.clone();
        System.out.println(original);
        System.out.println(clone);
    }
}

class Point implements Cloneable {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Point clone() throws CloneNotSupportedException {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (Point) obj;
    }
}
