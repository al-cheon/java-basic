package basic.java.clasic.lambda;

public class LambdaTest4 {
    public static void main(String[] args) {
        //pattern1
        VoidFunction f1 = () -> System.out.println("VoidFunction :: pattern1");
        f1.run();

        //pattern2
        VoidFunction f2 = new VoidFunction() {
            public void run() {
                System.out.println("VoidFunction :: pattern2");
            }
        };
        f2.run();

        //pattern3
        VoidFunction f3 = getFunction();
        f3.run();

        // run() 대신에 사용할 수 잇는 메서드
        execute(f1);
        execute(f2);
        execute(f3);
        //pattern4
        execute(() -> System.out.println("VoidFunction :: pattern4"));

    }


    //static method1
    static void execute(VoidFunction f) {
        f.run();
    }

    //static method2
    static VoidFunction getFunction() {
        VoidFunction f = () -> System.out.println("VoidFunction :: pattern3");
        return f;
    }

}

//interface
@FunctionalInterface
interface VoidFunction {
    void run();
}
