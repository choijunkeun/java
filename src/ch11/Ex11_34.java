package ch11;

import java.util.*;

public class Ex11_34 {

    public static void main(String[] args) {
        Set set = new HashSet();    // HashSet 객체 생성

        // set의 크기가 6보다 작은 동안 1~45 사이의 난수를 저장
        while(set.size() < 6) {
            int num = (int)(Math.random() * 45) + 1;
            set.add(num);
        }

        System.out.println(set);

//        Collections.sort(set);   컴파일 에러, Set은 정렬 불가.. List로 만들어줘서 정렬해야함

        List list = new LinkedList(set);
        Collections.sort(list);
        System.out.println(list);

    }
}
