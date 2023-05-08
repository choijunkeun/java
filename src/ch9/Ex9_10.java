package ch9;

public class Ex9_10 {
    public static void main(String[] args) {
        int iVal = 100;

        String strVal = "abc";
        String strVal2 = "bca";

        StringBuffer strBuffer = new StringBuffer(strVal);

        System.out.println(strBuffer);


        char a = strBuffer.charAt(0);

        strBuffer.deleteCharAt(0);

        strBuffer.append(a);

        if(strBuffer.toString().equals(strVal2)) {
            System.out.println("같다");
        }


        System.out.println(strBuffer);








    }
}
