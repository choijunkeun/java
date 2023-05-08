package ch11;
// HashSet > set인터페이스를 구현한 대표적인 컬렉션 클래스
// 순서를 유지하려면 LinkendHashSet클래스를 사용하면 된다.

// TreeSet > 범위 검색과 정렬에 유리한 컬렉션 클래스
// HashSet보다 데이터 추가, 삭제에 시간이 더 걸림

import java.util.*;

public class ch11_34 {
    public static void main(String[] args) {
        Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4", "4"};

        Set set = new HashSet();    // 순서 x, 중복 X

        for(int i=0; i<objArr.length; i++) {
            System.out.println(set.add(objArr[i]));
            set.add(objArr[i]); // HashSet에 ObjArr의 요소들을 저장한다.
        }

        // HashSet에 저장되 요소들 출려
        System.out.println(set);

        Iterator it = set.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
