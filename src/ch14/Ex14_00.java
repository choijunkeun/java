package ch14;

import java.util.function.Function;
import java.util.function.Supplier;

class MyClass {
    int iv;

    public MyClass() {}

    public MyClass(int iv) {
        this.iv = iv;
    }
}

public class Ex14_00 {
    public static void main(String[] args) {
//        Function<String, Integer> f = (String s) -> Integer.parseInt(s);  // 람다식
//        Function<String, Integer> f = Integer::parseInt;                    // 메서드 참조
        Function<String, Integer> f = (String s) -> Integer.parseInt(s);
        System.out.println(f.apply("100") + 200);

        /* 생성자의 메서드 참조 */
        // Supplier는 입력 X, 출력 O
        Supplier<MyClass> s1 = () -> new MyClass();             // 람다식(생성자 호출)
        Supplier<MyClass> s2 = MyClass::new;                    // 메서드 참조(생성자 호출)

        Function<Integer, MyClass> s3 = (i) -> new MyClass(i);  // 람다식(생성자에 매개변수 있는거)
        Function<Integer, MyClass> s4 = MyClass::new;           // 메서드 참조(생성자에 매개변수 있는거)

        MyClass mc1 = s1.get();
        MyClass mc2 = s2.get();
        MyClass mc3 = s3.apply(100);
        MyClass mc4 = s4.apply(200);

        System.out.println("mc1 = " + mc1);
        System.out.println("mc2 = " + mc2);
        System.out.println("mc3 = " + mc3.iv);
        System.out.println("mc4 = " + mc4.iv);

        // 배열
        Function<Integer, int[]> f2 = (i) -> new int[i];
        Function<Integer, int[]> f3 = int[]::new;

        int[] arr = f2.apply(100);
        int[] arr2 = f2.apply(300);

        System.out.println("arr.length = " + arr.length);
        System.out.println("arr2.length = " + arr2.length);

    }
}
