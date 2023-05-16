package ch14;

public class Ex14_0 {
    public static void main(String[] args) {
//        Object obj = (a,b) -> a > b ? a: b; // 람다식은 익명 객체, 이걸 다루려면 뭔가 필요하다. 그게 함수형 인터페이스

//        MyFunction2 f = new MyFunction2() {
//            public int max(int a, int b) {  // 오버라이딩- 접근제어자는 좁게 못바꾼다라는 규칙이 있음. 따라서 public을 붙여줘야함.
//                return a > b ? a : b;
//            }
//        };

        // 람다식을 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다.
        MyFunction2 f = (a, b) -> a > b ? a: b; // 람다식, 익명객체

        int value = f.max(3,5);
        System.out.println("value = " + value);

    }
}

@FunctionalInterface        // 함수형 인터페이스는 단 하나의 추상 메서드만 가져야 한다는 애너테이션
interface MyFunction2 {
//    public abstract int max(int a, int b);
    int max(int a, int b);  // public, abstract 생략 가능
}
