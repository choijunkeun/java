package ch11;

public class BinarySearchTest {

    static int binarySearchMethod(int[] arrParam, int searchVal) {
        int mid;  // 찾는 대상 flag (찾는값)
        int left = 0;                   // 왼쪽 끝 flag
        int right = arrParam.length - 1;// 오른쪽 끝 flag

        //  0 1 2 3 4 5 6
        // {1,2,3,4,5,6,7};     legnth 7 ,
        while(left <= right) {
            mid = (left + right) / 2;
            if(arrParam[mid] == searchVal) {    // mid flag가 가르키는 값이 찾는값이면,
                return mid;
            }

            if(arrParam[mid] > searchVal) {
                right = mid - 1;
            } else {
                left = mid + 1;

            }
        }
        return -1;
    }



    public static void main(String args[]) {

        int[] arr = {1,2,3,4,5,6,7};

        int x = binarySearchMethod(arr, 7);

        System.out.println(x);

    }
}
