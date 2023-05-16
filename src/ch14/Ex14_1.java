package ch14;

@FunctionalInterface
interface MyFunction {
    void run(); // public abstract생략 된것
}

public class Ex14_1 {
    static void execute(MyFunction f) { // 매개변수의 타입이 MyFunction인 메서드
        f.run();
    }

    static MyFunction getMyFunction() { // 반환 타입이 MyFunction인 메서드
        MyFunction f = () -> System.out.println("f3.run()");
        return f;
    }

    public static void main(String[] args) {
        // 람다식으로 MyFunction의 run()을 구현
        MyFunction f1 = () -> System.out.println("f1.run()");

        MyFunction f2 = new MyFunction() {  // 익명 클래스로 run()을 구현
            public void run() { // public붙여야함. 인터페이스의 run()은 public abstract이라서. 오버라이딩 규칙(접근제어자 더 좁게 불가능)
                System.out.println("f2.run()");
            }
        };

        MyFunction f3 = getMyFunction();

        f1.run();
        f2.run();;
        f3.run();

        execute(f1);
        execute( () -> System.out.println("run()") );
    }
}
