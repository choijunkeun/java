package etc;

import java.util.*;

public class StringTest {

    /**
     * 배열에서 가장 많이 등장하는 숫자 반환
     * 만약 두가지 이상이 있을 경우 아무것이나 반환
     * */
    static int majority1(int[] a) {
        int aSize = a.length;

        int majority = -1, majorityCount = 0;

        for(int i=0; i<aSize; i++) {
            int v = a[i];
            int count = 0;

            for(int j=0; j<aSize; j++) {
                if(a[j] == v) {
                    ++count;
                }
            }

            if(count > majorityCount) {
                majorityCount = count;
                majority = v;
            }
        }
        return majority;

    }


    public static void main(String args[]){
        int[] x = {1, 1, 2, 2, 3, 4, 5, 6, 7, 7, 7, 8, 8, 8};
        System.out.println(majority1(x));






    }
}
