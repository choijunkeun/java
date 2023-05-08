package ch11;

import java.util.*;

public class Ex11_12 {
    public static void main(String[] args) {
        HashSet setA = new HashSet();
        HashSet setB = new HashSet();
        HashSet setHab = new HashSet();
        HashSet setKyo = new HashSet();
        HashSet setCha = new HashSet();

        setA.add("1");
        setA.add("2");
        setA.add("3");
        setA.add("4");
        setA.add("5");
        System.out.println("A = " + setA);

        setB.add("4");
        setB.add("5");
        setB.add("6");
        setB.add("7");
        setB.add("8");
        System.out.println("B = " + setB);


        // 교집합
//        setA.retainAll(setB);       // 교집합.setA의 요소들 중 setB와 공통된 요소들만 남기고 삭제
//        System.out.println(setA);

        // 합집합
        setA.addAll(setB);          // 합집합. setB의 모든 요소들을 setA에 추가(중복 된 요소는 제외)
        System.out.println(setA);

        // 차집합
        setA.removeAll(setB);
        System.out.println(setA);



        System.out.println("A n B = " + setKyo);

        System.out.println("A - B = " + setCha);

        System.out.println("A U B = " + setHab);




    }
}