package basic.java.clasic.abstrcts;

public class FightTestGettingStarted {
    public static void main(String[] args) {
        Fighter f = new Fighter();

        if (f instanceof Unit) {
            System.out.println("Unit");
        }
        if (f instanceof Fightable) {
            System.out.println("Fightable");
        }
        if (f instanceof Movable) {
            System.out.println("Movable");
        }
        if (f instanceof Attackable) {
            System.out.println("Attackable");
        }
        if (f instanceof Object) {
            System.out.println("Object");
        }

    }
}
