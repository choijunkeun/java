package ch11;

import java.util.*;

// 배열을 다루기 편리한 메서드(static) 제공
public class ArraysClassTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // 배열의 출력 - toString()
//        System.out.println(Arrays.toString(arr));

        // 배열의 복사 copyOf(), copyOfRagne()
        // copyOf() >> 두번째 매개변수 만큼 복사, 넘어가면 제외
        // copyOfRange >> 범위 내의 배열 복사
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, 3);
        int[] arr4 = Arrays.copyOfRange(arr, 3,6);

//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.toString(arr3));
//        System.out.println(Arrays.toString(arr4));

        // 배열 채우기 fill() , setAll()
        int[] arrF = new int[10];
        Arrays.fill(arrF, 10);  // 두번째 매개변수로 값을 채움

//        System.out.println(Arrays.toString(arrF));

        Arrays.setAll(arrF, (i) -> (int) (Math.random() * 5) + 1);

//        System.out.println(Arrays.toString(arrF));

        int[] arrS = {3, 2, 0, 1, 4, 5, 7, 6};
        int idx = Arrays.binarySearch(arrS, 2); // 이진탐색은 정렬된 배열에만 사용 가능,
//        System.out.println(idx);            // 잘못된 결과가 나옴

        Arrays.sort(arrS);
        int idx2 = Arrays.binarySearch(arrS, 2);
//        System.out.println(idx2);

        // 다차원 배열의 출력  deepToString()
        int[] arrTest = {0, 1, 2, 3, 4};
        int[][] arrTest2 = {{0, 1, 2, 3, 4}, {5, 6, 7, 8, 9}};

//        System.out.println(Arrays.toString(arrTest));
//        System.out.println(Arrays.deepToString(arrTest2));

        // 다차원배열의 비교 deepEquals()

        // 배열을 List로 변환 asList(Object... a)
        int[] intArr = {1, 3, 4, 5, 6, 7};

        List list = Arrays.asList(new Integer[]{1, 2, 3, 4, 5});
        List list2 = Arrays.asList(1, 2, 3, 4, 5);
        List list3 = Arrays.asList(intArr);
//        list.add(6);    // UnsupportedOperationException 예외 발생

        List list4 = new ArrayList(Arrays.asList(intArr));

        System.out.println("###########");
        System.out.println(list);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);

















    }
}
