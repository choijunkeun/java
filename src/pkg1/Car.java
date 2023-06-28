package pkg1;

// Reflection API Test

import java.lang.reflect.Method;

public class Car {
    private final String name;
    private int position;

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public void move() {
        System.out.println("move() Method");
        this.position++;
    }

    public int getPosition() {
        System.out.println("getPosition() Method");
        return position;
    }


    public static void main(String[] args) throws Exception {
          /* 자바에선 JVM이 실행되면 작성된 자바코드가 컴파일러를 거쳐 바이트 코드로 변환되고
            static area(스태틱 메모리 영역)에 저장된다.
            따라서 클래스 이름만 알고있으면 언제든 static영역에서 정보를 찾아 가져올 수 있다.
         */

        // Ex1
        Object car = new Car("Carnival", 0);
        Class carClass = Car.class;
        Method move = carClass.getMethod("move");

//        move.invoke(car, null);   // move() 실행, invoke(메서드를 실행시킬 객체, 해당메서드에 넘길 인자)
        move.invoke(car);

        Method getPosition = carClass.getMethod("getPosition");
        int position = (int) getPosition.invoke(car);

        System.out.println("position = " + position);


        // Ex2.  클래스의 이름만으로도 해당 클래스의 정보 가져올 수 있음
        Class carClass2 = Class.forName("Car");




        /* ... Reflection API를 직접 활용일은 거의 없다.
             특히 직접 사용할 경우 단점이 있다.
             - 컴파일 시점이 아닌 런타임 시점에 동적으로 타입을 분석하고 정보를 가져오기 때문에
                JVM 을 최적화 할 수 없다.(오버헤드)
             - 직접 접근할 수 없는 private iv, method에 접근 가능하기 떄문에 내부를 노출하면서
                추상화를 깨뜨린다.
         */



    }
}
