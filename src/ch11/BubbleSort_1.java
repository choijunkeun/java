package ch11;

import java.util.Arrays;

class BubbleSort_1 {


    static int[] bubbleSortMethod(int[] arrInt) {
        int temp = 0;

        for(int i=0; i<arrInt.length; i++) {

            // 1회전 돌면 1씩(i씩) 줄어야한다.
            //  (1) j=1 부터 시작하는 이유
            //  --  ArrayIndexOutOfBoundsException 발생
            //  --  [j-1]로 0번 인덱스부터 접근
            //  (2) arrInt.length-i 하는 이유
            //  -- ex) 한번 순회 할 떄마다 가장 큰 원소가 맨 뒤로 정렬된다. 따라서 이미 정렬된 가장 큰 원소는
            //          검색 대상일 필요가 없다.
            //
            for(int j=1; j<arrInt.length-i; j++) {
                if(arrInt[j-1] > arrInt[j]) { // 앞의 원소값 > 뒤의 원소값 -> 자리교체
                    temp = arrInt[j-1];
                    arrInt[j-1] = arrInt[j];
                    arrInt[j] = temp;
                }
            }
        }
        return arrInt;

    }



    public static void main(String args[]) {
        int[] inputArr = {1,2,3,6,4,5,8,7};

        for(int i : bubbleSortMethod(inputArr)) {
            System.out.println(i);
        }
    }

}
