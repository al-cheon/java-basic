package basic.java.clasic.array;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] = (int)(Math.random() * 10));
        }
        System.out.println();
        int size = a.length;

        //찾은 최소값을 위치시켜야 하는 곳은 size-1 까지
        for (int i = 0; i < size-1; i++) {
            int min_index = i;  //디폴트 최소값의 인덱스 지정 & 라운드
            //최소값 찾기
            for (int j = i+1; j < size; j++) {
                if (a[j] < a[min_index]) {
                    min_index = j;  // 위 디폴트 최소값의 인덱스을 변경
                }
            }
            //위치 교환
            int temp = a[min_index];
            a[min_index] = a[i];
            a[i] = temp;
            // Done!
            Arrays.stream(a).forEach(System.out::print);
            System.out.println();
        }

    }

}
