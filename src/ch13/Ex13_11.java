package ch13;

public class Ex13_11 {
    static long startTime = 0;

    public static void main(String[] args) {
        ThreadEx11_1 th1 = new ThreadEx11_1();
        ThreadEx11_2 th2 = new ThreadEx11_2();
        th1.start();
        th2.start();
        startTime = System.currentTimeMillis();

        try {
            th1.join(); // th1쓰레드가 끝날때까지 기다린다.
            th2.join(); // th2쓰레드가 끝날때까지 기다린다.

        } catch(InterruptedException e) {}

        System.out.print("소요시간 : " + (System.currentTimeMillis() - startTime));
    }
}

class ThreadEx11_1 extends Thread {
    public void run() {
        for (int i = 0; i < 5000; i++) {
            System.out.print(new String("-"));
        }
    }
}

class ThreadEx11_2 extends Thread {
    public void run() {
        for (int i = 0; i < 5000; i++) {
            System.out.print(new String("|"));
        }
    }
}
