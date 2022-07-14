package basic.java.clasic.thread;

// 멀티코어에서는 쓰레드의 우선순위에 따른 차이가
//거의 아니 전혀 없었다.
public class ThreadTester3 {
    public static void main(String[] args) {
        ThreadTester3_1 th1 = new ThreadTester3_1();
        ThreadTester3_2 th2 = new ThreadTester3_2();

        //메인 메소드의 디폴트 우선순위는 5이다
        th2.setPriority(7);

        System. out . println( "Priority of thl(-) "+ th1.getPriority()) ;
        System. out .println( "Priority of th2(|) "+ th2.getPriority());

        th1.start();
        th2.start();
    }
}

class ThreadTester3_1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("-");
            for (int j = 0; j < 1000000; j++);
        }
    }
}

class ThreadTester3_2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("|");
            for (int j = 0; j < 1000000; j++); // / 작업을 지연시키기 위한 for문
        }
    }
}
