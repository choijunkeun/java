package ch11;

import java.util.*;


class Algorithm_1 {
    public static void main(String[] args) {
        int[] piece = {1,1,2,2,2,8}; // 체스 기본값
        int[] result = new int[6];

        Scanner scan = new Scanner(System.in);

        for(int i=0; i<piece.length; i++) {
            int inputvalue = scan.nextInt();

            if(piece[i] == inputvalue) {
                result[i] = 0;
            } else if(piece[i] > inputvalue) {
                result[i] = piece[i] - inputvalue;
            }
        }


        for(int i : result) {
            System.out.print(i + " ");
        }



    }


}