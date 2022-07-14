package basic.java.clasic.thread;

/**
 * 스레드를 구현하는 방법
 * 1. Thread 클래스를 상속
 * 2. Runnable 인터페이스를 구현
 * 1번으로 하면 다른 클래스를 상속받지 못하므로 보통 2번으로 구현한다
 * todo) 여러 쓰레드가 여러 작업을 동시에 진행하는 것을 병행 (concurrent) 라고 하고，하나의 작업을 여러 쓰레드가 나눠 서 처리하는 것을 영렬 (parallel) 이라고 한다.
 */
public class ThreadType1 extends Thread{
    @Override
    public void run() {
        System.out.println("ThreadType_1");
        System.out.println(currentThread()); //todo == Thread.currentThread()
        System.out.println(getName()); //todo == Thread.currentThread().getName()
    }
}

class ThreadType2 implements Runnable {
    @Override
    public void run() {
        System.out.println("ThreadType_2");
        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().getName());
    }
}

class ThreadMain {
    public static void main(String[] args) {
        //두개의 인스턴스 생성방법이 다르다
        ThreadType1 t1 = new ThreadType1();
        Runnable r2 = new ThreadType2();
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}