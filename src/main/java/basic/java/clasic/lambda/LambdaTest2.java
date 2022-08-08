package basic.java.clasic.lambda;

public class LambdaTest2 {
    public static void main(String[] args) {

        MyFunction f = (int[] arr) -> {
            int max = arr[0];
            for (int i = 1; i < arr.length-1 ; i++) {
                if (arr[i] < arr[i + 1]) max = arr[i];
            }
            return max;
        };

        exeFunction(f, 4, 1, 3, 5, 9);
    }


    /////////////////////////////////////////////////////

    // Wow !!
    static void exeFunction(MyFunction f, int ...arr) {
        System.out.println(f.customMax(arr));
    }
}

@FunctionalInterface
interface MyFunction {
    public abstract int customMax(int... arr);
}
