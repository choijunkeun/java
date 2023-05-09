package ch13;

class Ex13_8 {
    public static void main(String[] args) {
        ThreadEx8_1 th1 = new ThreadEx8_1();
        ThreadEx8_2 th2 = new ThreadEx8_2();
        th1.start();
        th2.start();

        delay(2 * 1000);
        System.out.print("<<main 종료>>");
    }   // main

    static void delay(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {}
    }
}

class ThreadEx8_1 extends Thread {
    public void run() {
        for(int i=0; i < 300; i++) System.out.print("-");
        System.out.print("<<th1종료>>");
    }   // run()
}

class ThreadEx8_2 extends Thread {
    public void run() {
        for(int i=0; i < 300; i++) System.out.print("|");
        System.out.print("<<th2종료>>");
    }   // run()
}