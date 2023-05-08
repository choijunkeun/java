package ch13;

public class Ex13_1 {
    public static void main(String[] args) {
        ThreadEx1_1 t1 = new ThreadEx1_1();
        Thread t2 = new Thread(new ThreadEx1_2());

        t1.start();
        t2.start();
    }
}

class ThreadEx1_1 extends Thread {     // 1. Thread클래스를 상속해서 쓰레드를 구현
    public void run() {
        for (int i = 0; i < 500; i++) {
//            System.out.println(this.getName()); // this 생략 가능, 상속받은 메서드
//            System.out.println(getName());
            System.out.print(0);
        }
    }
}

class ThreadEx1_2 implements Runnable { // 2. Runnable인터페이스를 구현해서 쓰레드를 구현
    @Override
    public void run() { // 쓰레드가 수행할 작업을 작성
        for(int i=0; i<500; i++) {
            // 쓰레드를 상속받은게 아니라 Thread.currentThread()로 접근해야함 >> 현재 실행중인 Thread를 반환.
//            System.out.println(Thread.currentThread().getName());
            System.out.print(1);

        }
    }
}
