package basic.java.clasic.abstracts1;

/**
 * [[ 인터페이스 특징 ]]
 * - 모든 맴버변수는 public static final 이어야 하며, 이를 생략할 수 있다
 * - 모든 메서드는 public abstract 이어야 하며, 이를 생ㅇ략할 수 있다
 * (단. static 메서드와 default 메서드는 예외)
 */
public interface Fightable extends Movable, Attackable {
}
