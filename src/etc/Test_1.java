package etc;

import java.util.*;


public class Test_1 {
    public static void main(String[] args) {
        long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기

        Solution s = new Solution();
        int[] nums = {1,3,4,5};

        int target = 4;

        s.twoSum(nums, target);

        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime)/1000;
        System.out.println("시간차이(m) : "+secDiffTime);


    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {


        // i = 0    j = 1,2,3
        // i = 1    j = 2,3
        // i = 2    j = 3
        ArrayList<Integer> idxList = new ArrayList<>();

        for(int i=0; i<nums.length; i++) {
            for(int j=nums.length -1; j>=i+1; j--) {
                if(nums[i] + nums[j] == target) {
                    idxList.add(i);
                    idxList.add(j);
                }
            }
        }


//         idxArr = new int[idxList.size()];

        int[] idxArr = idxList.stream().mapToInt(i -> i).toArray();

        System.out.println(Arrays.toString(idxArr));



        return idxArr;

    }
}
