package day03;

import java.util.Arrays;

public class ArrayInsert {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        // 20이랑 30사이에 넣고 싶음
        int targetIndex = 2;
        int newData = 25; // 2번인덱스에 넣어야 함

        // 1. 배열의 사이즈를 먼저 1 늘려놓음
        int[] newarr = new int[arr.length + 1];

        // 2. 원본배열을 다 복사해놓음
        for (int i = 0; i <arr.length ; i++) {
            newarr[i] =  arr[i];
        }
        // 3. 맨 뒤부터 타겟인덱스까지 한칸씩 뒤로 민다.
        for (int i = newarr.length - 1; i >= targetIndex ; i--) {
            if(i == targetIndex) {
            // 4. 타겟인덱스 자리에 새 데이터를 넣는다.
                newarr[i] = newData;
            } else{
                newarr[i] = arr[i-1];
            }
        }
        System.out.println(Arrays.toString(arr));
        arr = newarr; newarr = null;
        // 5. 주소를 바꾼다.

    }
}