package basic.java.clasic.abstrcts;

public interface Attackable {

    void attack(Unit unit);

    default void sample(int a){}

}
