package basic.java.clasic.lambda;

import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.function.*;

public class LambdaTest1 {
    public static void main(String[] args) {

        //pattern1
        IntBinaryOperator lambda1 = (int a, int b) -> {
            return Math.max(a, b);
        };
        IntBinaryOperator lambda2 = (int a, int b) -> Math.min(a, b);
        IntBinaryOperator lambda2_2 = Math::min;
        IntBinaryOperator methodReference = Math::min;


        //pattern2
        ObjIntConsumer<String> stringObjIntConsumer = (String name, int i) -> {
            System.out.println(name + " :: " + i);
        };
        ObjIntConsumer<String> stringObjIntConsumer2 = (name, i) -> {
            System.out.println(name + i);
        };
        ObjIntConsumer<String> stringObjIntConsumer3 = (String name, int i) -> System.out.println(name + i);
        ObjIntConsumer<String> stringObjIntConsumer4 = (name, i) -> System.out.println(name + i);


        //pattern3
        IntFunction<Integer> oneParameter = (int oneParam) -> oneParam + oneParam;
        IntFunction<Integer> oneParameter2 = (oneParam) -> oneParam + oneParam;
        IntFunction<Integer> oneParameter3 = oneParam -> oneParam + oneParam;


        //pattern4
        Callable<Integer> doubleCallable = () -> {
            return (int) (Math.random() * 45) + 1;
        };
        Callable<Double> doubleCallable1 = () -> Math.random() + 1;


        //pattern5
        Runnable noParam = () -> {
            Properties properties = System.getProperties();
            System.out.println(properties);
        };
        Runnable runnable = () -> System.out.println(System.getProperties());
        Runnable runnable2 = System::getProperties;


        //pattern6 :: array
        Function<int[], Integer> function = (int[] arr) -> {
            int sum = 0;
            for (int i : arr) sum += i;
            return sum;
        };


    }


}
