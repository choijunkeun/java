package etc;

import java.util.*;

public class MathTest {

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(new Integer(200));
        list.add(10);

        Integer itx = new Integer(10);
        int x = itx;

        int y = 10;
        Integer intg = y;

        Object obj = (Object)y;


        System.out.println(obj.getClass());

    }
}
