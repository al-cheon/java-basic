package basic.java.clasic.thread;

import javax.swing.*;

/**
 * 두 스레드가 서로다른 자원을 사용하는 작업의 경우 싱글스레드 멀티스레드가 더 효율적이다.
 * 예를들면 사용자로부터 데이터를 입력받는 작업, 네트워크로 파일을 주고받는 작업, 프린터로 파일을 출력하는 작업과 같이 외부기기와의 입출력을 필요로 하는 경우
 * 두개의 작업을 두개의 스레드로 나눠서 처리한다면 더 빨리 마칠 수 있다
 */
public class ThreadTester2_Before {
    public static void main(String[] args) {
        //part1
        String input = JOptionPane.showInputDialog("아무값이나 입력하세요.");
        System.out.println("입력하신 값 :: " + input);
        //part2
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/** todo) 입력을 마치지 않아도 화면에 숫자가 출력된다 (아래 정리 ** 중요)
 * 위 예제는 작업 (part1)과 (part2)를 하나의 스레드에서 처리하고 있다
 * 아래 예제는 작업 (part1)과 (part2)를 두개의 스레드에서 처리하고 있다
 * 두
 */
class ThreadTester2_After {
    public static void main(String[] args) {
        //part1
        ThreadTester2_After_Parts threadTester2_after_parts = new ThreadTester2_After_Parts();
        threadTester2_after_parts.start();
        //part2
        String input = JOptionPane.showInputDialog("아무값이나 입력하세요.");
        System.out.println("입력하신 값 :: " + input);
    }
}

class ThreadTester2_After_Parts extends Thread {
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}