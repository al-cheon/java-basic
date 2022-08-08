package basic.java.clasic.generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;

public class Generic_1 {
    public static void main(String[] args) {

        FruitBox<? extends Fruit> fruitBox1 = new FruitBox<Fruit>();
        FruitBox<? extends Fruit> fruitBox2 = new FruitBox<Apple>();
        FruitBox<? extends Fruit> fruitBox3 = new FruitBox<Grape>();

        FruitBox<Apple> appleFruitBox = new FruitBox<>();
        FruitBox<Grape> grapeFruitBox = new FruitBox<>();

        appleFruitBox.add(new Apple("Apple", 300));
        appleFruitBox.add(new Apple("Apple", 100));
        appleFruitBox.add(new Apple("Apple", 200));

        grapeFruitBox.add(new Grape("Grape", 400));
        grapeFruitBox.add(new Grape("Grape", 300));
        grapeFruitBox.add(new Grape("Grape", 200));


        System.out.println(Juicer.<Apple>makeJuice(appleFruitBox));
        System.out.println(Juicer.<Grape>makeJuice(grapeFruitBox));

        Collections.sort(appleFruitBox.list, new FruitComp());
        Collections.sort(grapeFruitBox.list, new FruitComp());

        System.out.println(appleFruitBox);
        System.out.println(grapeFruitBox);
    }
}

class FruitBox<T extends Fruit & Eatable> extends Box<T> { }

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
}
//////////////////////////////////////////////

interface Eatable { }

class Fruit implements Eatable{
    String name;
    int weight;

    public Fruit() {
    }

    public Fruit(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return name + "::" + weight;
    }
}

class Apple extends Fruit {
    public Apple(String name, int weight) {
        super(name, weight);
    }

    public String toString() {
        return "Apple";
    }
}

class Grape extends Fruit {
    public Grape(String name, int weight) {
        super(name, weight);
    }

    public String toString() {
        return "Grape";
    }
}

class Toy {
    public String toString() {
        return "Toy";
    }
}

//////////////////////////////////////////////

class Juicer {
//    static Juice makeJuice(FruitBox<? extends Fruit> box) {
//        StringBuffer sb = new StringBuffer("");
//        for (Fruit fruit : box.list) {
//            sb.append(fruit + " ");
//        }
//        return new Juice(sb.toString());
//    }
    static <T extends Fruit> Juice makeJuice(FruitBox<T> box) {
        StringBuffer sb = new StringBuffer("");
        for (Fruit fruit : box.list) {
            sb.append(fruit + " ");
        }
        return new Juice(sb.toString());
    }
}

class Juice {
    String name;

    public Juice(String name) {
        this.name = name + "Juice";
    }

    @Override
    public String toString() {
        return name;
    }
}

//////////////////////////////////////////////

class AppleComp implements Comparator<Apple> {
    @Override
    public int compare(Apple o1, Apple o2) {
        return o1.weight - o2.weight;
    }
}

class GrapeComp implements Comparator<Grape> {
    @Override
    public int compare(Grape o1, Grape o2) {
        return o1.weight - o2.weight;
    }
}

class FruitComp implements Comparator<Fruit> {
    @Override
    public int compare(Fruit o1, Fruit o2) {
        return o1.weight - o2.weight;
    }
}