package basic.java.clasic.thread;

public class ThreadTester1 {

    public static void main(String[] args) {
        System.out.println("=========" + Thread.currentThread().getName() + "Start" + "=========");
        long startTIme = System.currentTimeMillis();
        Runnable runnableOne = new ThreadOne();
        Thread threadOne = new Thread(runnableOne);
        System.out.println("소요시간 :: " + (System.currentTimeMillis() - startTIme));
        threadOne.start();

        try { //join() 사용
            threadOne.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("=========" + Thread.currentThread().getName() + "End" + "=========");
    }
}

class ThreadOne implements Runnable{
    @Override
    public void run() {
        System.out.println("스레드 1단계");
        thread2();
    }

    public void thread2() {
        System.out.println("스레드 2단계");
        thread3();
    }

    public void thread3() {
        System.out.println("스레드 3단계");
    }
}
