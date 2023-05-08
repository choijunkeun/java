package ch11;

import java.util.*;


// Comparable 기본 정렬기준을 구현하는데 사요
// Comparator 기본 정렬기준 외에 다른 기준으로 정렬하고자 할 때 사용
public class ch11_30 {
    public static void main(String[] args) {
        String[] strArr = {"cat", "Dog", "lion", "tiger"};

        Arrays.sort(strArr);    // String의 Comparable구현에 의한 정렬(영어 대문자 > 소문자)
        System.out.println("strArr = " + Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분 없이 정렬
        System.out.println("strArr = " + Arrays.toString(strArr));

        Arrays.sort(strArr, new Descending()); // 역순 정렬
        System.out.println("strArr = " + Arrays.toString(strArr));

    }
}

class Descending implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if( o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;
            return c2.compareTo(c1);
        }
        return -1;
    }
}
