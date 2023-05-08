package ch11;

import java.util.*;

public class Ex11_5 {

    public static void main(String[] args) {
        Collection c = new TreeSet();    // Set은 Collection의 자손
        c.add("1");
        c.add("2");
        c.add("3");
        c.add("4");
        c.add("5");

        Iterator it = c.iterator();  // iterator는 list든 set이나 다 똑같이 동작하게 되어있음

        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }

        System.out.println("##############");
        // iterator는 1회용. 다 쓰면 다시 얻어와야함.
        it = c.iterator();   // 새로운 iterator 객체 얻기
//        for(int i=0; i<list.size(); i++) {
//            Object obj = list.get(i);
//            System.out.println(obj);
//        }


        // Map에는 iterator()가 없다.
        // list,set은 collection interface의 자손 interface이지만 map은 아니다.
        // 따라서 KeySet(), entrySet() , values()를 호출해야 함

        Map map = new HashMap();

        map.put("PLU_CD", "88000001");
        map.put("STR_CD", "009001");
        map.put("CO_CD", "1001283");

        Iterator it2= map.entrySet().iterator();

        while(it2.hasNext()) {
            Object obj2 = it2.next();
            System.out.println(obj2);
        }





    }
}
