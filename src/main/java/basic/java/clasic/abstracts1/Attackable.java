package basic.java.clasic.abstracts1;

public interface Attackable {

    void attack(Unit unit);

    default void sample(int a){}

}
