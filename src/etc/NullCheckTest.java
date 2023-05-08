package etc;

public class NullCheckTest {
    public static void main(String[] args) {

        String strNull = null;
        String strHoll = "";

        if("".equals(strNull)) {
            System.out.println("널체크");
        }

        if("".equals(strHoll)) {
            System.out.println("공백체크222");
        }

    }
}
