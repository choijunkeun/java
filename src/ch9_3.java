// hashCode() - 객체의 해시코드를 반환하는 메서드(정수값)
// Object클래스의 hashCode()는 객체의 주소를 int로 변환해서 반환 (해쉬코드 = 객체의 지문)

// equals()를 오버라이딩하면, hashCode()도 오버라이딩 해야 한다.
// ** equals()의 결과가 true인 두 객체의 해시코드는 같아야 하기 떄문 **

/** System.identityHashCode(Object obj)
 * Object클래스의 hashCode()와 동일 (객체마다 다른 해시코드를 반환하는 메서드)
 *   해시코드를 대부분 오버라이딩하기 떄문에 오버라이딩 하기 이전의 기능이 필요 할 때 사용한다.
 **/

/** toString()
 *  객체를 문자열(String)으로 변환하기 위한 메서드 (객체 => iv집합 // 따라서 객체->문자열은 iv값들 -> 문자열로 바꾼다는 의미)
 *  기존 메서드로는 클래스이름@해시코드값 으로 나오기 떄문에 오버라이딩 해서 사용한다.
 * **/

import java.util.Objects;

class Card {
    String kind;
    int number;

    Card() {
        this("SPADE", 1);
    }
    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }
    // equals()를 오버라이딩하면 hashCode()도 오버라이딩 해야한다.
    public int hashCode() {
        // int hash(Object... values) {...}
        // 매개변수가 가변인자(Object...)라서 호출시 지정하는 값의 개수가 정해져있지 않다.
        return Objects.hash(kind, number);
    }

    // Object클래스의 equals()를 오버라이딩
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Card))
            return false;

        Card c = (Card)obj;
        return this.kind.equals(c.kind) && (this.number == c.number);
    }


    // Object클래스의 toString()을 오버라이딩
    @Override
    public String toString() {
        return "kind : " + kind + ", number : " + number;
    }
}

public class ch9_3 {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println(c1.equals(c2));

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
