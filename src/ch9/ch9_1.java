package ch9;// Object 클래스
// 모든 클래스의 최고 조상. 오직 11개의 메서드만을 가지고 있다.
// notify(), wait() 등은 쓰레드와 관련된 메서드이다.


// equals() 메서드는 객체의 주소값을 비교하게 되어있다. 따라서 값을 비교하려면 오버라이딩 해서 내용을 바꿔줘야한다.

public class ch9_1 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if (v1.equals(v2)) {
            System.out.println("v1 == v2");
        } else {
            System.out.println("v1 != v2");
        }
    }
}

class Value {
    int value;

    Value(int value) {
        this.value = value;
    }

    // Object클래스 안의 equals()를 오버라이딩해서 주소가 아닌 값을 비교하게 바꿔야함
    @Override
    public boolean equals(Object obj) {
//            return this==obj; // 기존 메서드 내용은 주소 비교. 서로 다른 객체는 항상 거짓이 나옴. 따라서 메서드 내용을 바꿔줘야 한다.

        // 참조변수의 형 변환 전에는 반드시 instanceof로 확인해야함.
        if (!(obj instanceof Value)) {
            return false;
        }
        Value v = (Value) obj; //obj를 value로 형변환

        return this.value == v.value; // 값을 비교.

    }
}




