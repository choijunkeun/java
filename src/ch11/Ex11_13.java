package ch11;

import java.util.*;


public class Ex11_13 {
    public static void main(String[] args) {
//        Set set = new TreeSet();      // 범위검색, 정렬. 정렬 필요 없음
        Set set = new TreeSet();      // 범위검색, 정렬. 정렬 필요 없음
//        Set set = new HashSet();        // 따로 정렬이 필요

//        while(set.size() < 6) {
//            int num = (int)(Math.random()*45) + 1;
////            set.add(num);   // set.add(new Integer(num));
        set.add(new Test());
        set.add(new Test());    // 추가 하는 객체가 비교 기준을 갖고 있던지, TreeSet이 비교기준을 갖고 있던지 둘 중에 하나는 해야함
//        }

        System.out.println(set);
    }

}

class Test implements Comparable {

    @Override
    public int compareTo(Object o) {
        return -1;
    }
}   //  비교 기준이 없음. add할 땐 비교 기준이 있어야함

class TestComp implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
