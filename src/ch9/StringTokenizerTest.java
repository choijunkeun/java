package ch9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class StringTokenizerTest{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] piece = {1,1,2,2,2,8};
        int[] inputPiece = new int[6];
        int idx = 0;
        while(st.hasMoreTokens()) {
            inputPiece[idx] = Integer.parseInt(st.nextToken());

            piece[idx] = piece[idx] == inputPiece[idx] ? 0 : piece[idx] - inputPiece[idx];
            idx++;
        }

        for(int i=0; i<piece.length; i++) {
            System.out.print(piece[i] + " ");
        }
    }
}