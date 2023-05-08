package ch9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class StringTokenTest {

    public static void main(String args[]) {
        StringTokenizer st = new StringTokenizer("bbxcccxaaaxddxffx", "x");

        ArrayList arr = new ArrayList();
        while(st.hasMoreTokens()) {
            arr.add(st.nextToken());
            Collections.sort(arr);
            System.out.println(arr.toString());

        }

    }
}
