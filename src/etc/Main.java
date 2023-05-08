package etc;

import java.io.*;


// 5
// 1111*1111     5
// 111***111    456
// 11*****11   34567
// 1*******1  2345678
// ********* 123456789
// 1*******1
// 11*****11
// 111***111
// 1111*1111

// 3
// 11*11          i=0; j= 0 x 1 x 2 o 3 x 4 x
// 1***1          i=1; j= 0 x 1 0 2 0 3 0 4 x
// *****
// 1***1
// 11*11

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputValue = Integer.parseInt(br.readLine());

        int hang = 0;
        int yeol = 0;

        for(int i=1; i<inputValue*2; i++) { // 행 반복횟수
            for(int j=1; j<inputValue*2; j++) {   // 열 반복횟수



            }
            System.out.println();
        }




    }
}