package etc;

class ThreadEx1_1 extends Thread {  // Thread class 상속 받아 쓰레드 구현
    public void run() { // 쓰레드가 수행할 작업
        for (int i=0; i<5000; i++){
//            System.out.println(this.getName());
            System.out.print(new String("-"));
        }
    }
}


class ThreadEx2_1 extends Thread {  // Thread class 상속 받아 쓰레드 구현
    public void run() { // 쓰레드가 수행할 작업
        for (int i=0; i<5000; i++){
//            System.out.println(this.getName());
            System.out.print(new String("|"));
        }
    }
}

class ThreadTest_1 {
    static long startTime = 0;

    public static void main(String[] args) {
        ThreadEx1_1 t1 = new ThreadEx1_1();
        ThreadEx2_1 t2 = new ThreadEx2_1();
        t1.start(); // 쓰레드의 실행 start()
        t2.start();
        startTime = System.currentTimeMillis();

        try {
            t1.join();
            t2.join();
        } catch(InterruptedException e) {}

        System.out.print("소요시간은 : " + (System.currentTimeMillis() - startTime));
    }
}
