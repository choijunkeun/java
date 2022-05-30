// String 클래스 = 데이터(char[]) + 메서드(문자열 관련)
// String 클래스는 내용을 변경할 수 없는 불변 클래스이다.
// ex ) String a = "a";     String b = "b";  //
// a가 가르키는 주소값을 (0x100) , b가 가르치는 주소값을 (0x200) 이라고 가정 할 떄,
// a = a + b;  에서 a+b의 값이 a가 가르치는 주소값 (0x100)에 들어가는것이 아니라 완전히 새로운 문자열 (0x300) 이 만들어진다.
// 그리고 a가 가르키는 주소값이 0x300이 되는것이다.  (String은 내용을 변경 할 수 없는 불변의 클래스이기 때문에)

// 문자열 결합을 할 때마다 계속 새로운 문자열이 만들어지니까 덧셈 연산자(+)를 이용한 문자열 결합은 성능이 떨어짐.
// 문자열의 결합이나 변경이 잦다면, 내용을 변경가능한 StringBuffer를 사용하기!!

// 문자열의 비교
// String str = "abc" 와 String str = new String("abc")의 비교

// String str1 = "abc"; String str2 = "abc"; 는 "abc"의 주소가 str1, str2에 저장되어 값을 공유하는 형태가 된다.
// String str3 = new String("abc") 과 String str4 = new String("abc") 는 새로운 String 인스턴스를 생성하기 떄문에 항상 새로운 문자열이 만들어짐
// 스트링은 내용변경이 불가능하기 때문에 굳이 new String으로 만들어 쓸 필요가 없다. (특별한 경우를 제외하곤)

// 문자열 리터럴
// 문자열 리터럴은 하나만 만들어지고 그 내용을 공유한다.
// 문자열 리터럴은 프로그램 실행시 자동으로 생성된다( constant pool[상수저장수]에 저장) -> new String 하지 않아도 만들어진다는것

// 같은내용의 문자열 리터럴은 하나만 만들어진다.
// ex) String s1 = "AAA" , String s2 = "AAA" ,  String s3 = "AAA" , String s4 = "BBB"
// s1,s2,s3(0x100) -> 0x100("AAA")  이런 그림이 나옴.

public class ch9_4 {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";

        System.out.println("a가 참조하는 주소값 = " + System.identityHashCode(a));
        System.out.println("b가 참조하는 주소값 = " + System.identityHashCode(b));

        a = a+b;

        System.out.println("a가 참조하는 주소값 = " + System.identityHashCode(a));
        //a의 주소값이 변경되었다. String 클래스는 내용을 변경할 수 없는 불변의 클래스이기 떄문에 새로운 문자열을 만들고 그 주소값을 참조한다.

        String s1 = "AAA";
        String s2 = "AAA";
        String s3 = "AAA";

        System.out.println("s1가 참조하는 주소값 = " + System.identityHashCode(s1));
        System.out.println("s2가 참조하는 주소값 = " + System.identityHashCode(s2));
        System.out.println("s3가 참조하는 주소값 = " + System.identityHashCode(s3));
        // 같은내용의 문자열 리터럴은 한개만 만들어지기 떄문에 참조하는 주소값이 모두 같다.

        String s4 = new String("ABC");
        String s5 = new String("ABC");
        System.out.println("s4가 참조하는 주소값 = " +System.identityHashCode(s4));
        System.out.println("s5가 참조하는 주소값 = " +System.identityHashCode(s5));
        // new String을 이용하면 항상 새로운 문자열을 만들게 된다. 하지만 String클래스는 내용 변경이 불가하기 때문에 굳이 new String()을 이용해서 쓸 필요가 없다.


    }
}
