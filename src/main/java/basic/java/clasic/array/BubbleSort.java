package basic.java.clasic.array;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // Ready
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] = (int)(Math.random() * 10));
        }
        System.out.println();
        int size = a.length;
        // Execute
        //라운드는 배열크기 - 1 만큼 진행됨
        for (int i = 1; i < size; i++) {
            //각 라운드별 비교횟수는 배열 크기의 현재 라운드를 뺀 만큼 비교함
            for (int j = 0; j < size-i; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j + 1] = temp;
                }
            }
            // Done!
            Arrays.stream(a).forEach(System.out::print);
            System.out.println();
        }
    }

}
