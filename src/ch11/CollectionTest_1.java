package ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class CollectionTest_1 {
    public static void main(String[] args) {

        ArrayList list1 = new ArrayList(10);
        // ArrayList에는 객체만 저장가능
        // 숫자만 입력 할 경우 autoboxing에 의해 기본형이 참조형으로 자동 변환
        list1.add(5);
        // list1.add(new Integer(5));
        list1.add(4);
        list1.add(2);
        list1.add(1);
        list1.add(7);
        list1.add(3);

        ArrayList list2 = new ArrayList(list1.subList(1, 4));

        System.out.println(list1);
        System.out.println(list2);

        Collections.sort(list1);    // Collections 는 유틸 클래스
        Collections.sort(list2);    // Collections 는 유틸 클래스

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1.containsAll(list2));   // list1이 list2의 모든 요소를 가지고 있니?

        list2.add("B");
        list2.add("C");

        System.out.println(list2);

        list2.add(3,"A");

        System.out.println(list2);

        list2.set(3, "AA");
        System.out.println(list2);
        System.out.println(list1);


        list1.add(0, "1");
        System.out.println(list1);

        list1.remove(0);
        list1.remove(new Integer(3));

        System.out.println(list1);


        int[] n = {1,3,5,7,8,9,10};

        String[] s = {"123", "234"};

        int a = 3;


        String aa = "!23";













    }
}
