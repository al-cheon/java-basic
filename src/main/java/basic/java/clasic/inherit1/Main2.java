package basic.java.clasic.inherit1;

/**
 * interface 의 추상메소드를 대신 구현해주는 조상클래스
 */
public class Main2 {
    public static void main(String[] args) {
        Worker worker = new Engineer();
        worker.work();
    }
}

interface Worker {
    void work();
}

class Employee {
    public void work() {
        System.out.println("work");
    }
}

class Engineer extends Employee implements Worker {
}