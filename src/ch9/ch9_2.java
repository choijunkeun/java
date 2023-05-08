package ch9;// equals() 메서드는 객체의 주소값을 비교하게 되어있다. 따라서 값을 비교하려면 오버라이딩 해서 내용을 바꿔줘야한다.

public class ch9_2 {
    public static void main(String[] args) {
        Person p1 = new Person(9109221000000L);
        Person p2 = new Person(9109221000000L);

        if(p1.equals(p2)) {
            System.out.println("p1과 p2는 같은 사람입니다.");
        } else {
            System.out.println("p1과 p2는 다른 사람입니다.");
        }
    }
}

class Person {
    long id;

    Person(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        //obj가 ch9.Person 타입이 아니면, 비교할 필요도 없으니 false
        if (!(obj instanceof Person)) {
            return false;
        }

        // p1.id와 obj(p2)의 id가 같으면 true, 다르면 false
        return this.id == ((Person) obj).id;
    }
}
