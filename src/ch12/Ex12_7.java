package ch12;

class Parent {
    void parentMethod() {
        System.out.println("부모 메서드");
    }
}

class Child extends Parent {
    @Override
    @Deprecated
    void parentMethod() {         // 조상 메서드의 이름을 잘못 적음, @Override 애너테이션 붙일 시 컴파일 에러
        System.out.println("자식 메서드");
    }
}

@FunctionalInterface    // 함수형 인터페이스는 하나의 추상 메서드만 가능
interface Testable {
    void test();    // 추상메서드
//    void check();   // 추상메서드
}


public class Ex12_7 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Child c = new Child();
        c.parentMethod();   // deprecated 사용

    }
}
