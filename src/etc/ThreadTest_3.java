package etc;

class Thread_1 extends Thread {
    public void run() {
        for(int i=0; i<300; i++) {
            System.out.print("-");
            for(int x=0; x < 10000000; x++);

        }
    }
}



class Thread_2 extends Thread {
    public void run() {
        for(int i=0; i<300; i++) {
            System.out.print("|");
            for(int x=0; x < 10000000; x++);

        }
    }
}



class ThreadTest_3 {
    public static void main(String[] args) {
        Thread_1 t1 = new Thread_1();
        Thread_2 t2 = new Thread_2();

        t1.setPriority(1);
        t2.setPriority(9);

        System.out.println("Priority of t1(-) : " + t1.getPriority());
        System.out.println("Priority of t2(|) : " + t2.getPriority());

        t1.start();
        t2.start();


    }
}
