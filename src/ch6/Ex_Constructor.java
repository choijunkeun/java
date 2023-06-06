package ch6;


class Car {
    private String color;
    private String gearType;
    private int door;

    Car() {
        System.out.println("나는 조상 생성자라네");
    }

    Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    Car(String color) {
        this(color, "auto", 4);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", gearType='" + gearType + '\'' +
                ", door=" + door +
                '}';
    }

    void engineStart() {
        System.out.println("engineStart Method()");
        Car inCar = new Car("black");
        System.out.println(inCar);

    }


}

class Truck extends Car {
    private int box;

    Truck() {
        super("blue");
    }
    Truck(int box) {
//        super();  // 컴파일러가 첫줄에 조상의 기본생성자를 삽입해준다.
        this.box = box;
    }



}

public class Ex_Constructor {
    public static void main(String[] args) {
//        Car car = new Car("white");
//        System.out.println("car = " + car);
//
//        Car car2 = new Truck(4);
//        Car car3 = new Truck();
//
//        car2.engineStart();
//
//        System.out.println("car3 = " + car3);

        Truck truck = new Truck(8);
        System.out.println(truck);
        

    }
}
