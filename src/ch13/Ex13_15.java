package ch13;

import java.util.ArrayList;

// wait(), notify()
// 아래 코드는 동기화가 되어있지만 wait()과 notify()를 할 때 손님을 위한건지, 요리사를 위한건지 구별이 안되서 비효율이 존재한다.
// 그런것을 위해 lock & condition이 존재한다.

class Customer2 implements Runnable {
    private Table2 table;
    private String food;

    Customer2(Table2 table, String food) {
        this.table = table;
        this.food = food;
    }

    public void run() {
        while (true) {
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            String name = Thread.currentThread().getName();

            table.remove(food);
            System.out.println(name + " ate a " + food);
        }
    }
}

class Cook2 implements Runnable {
    private Table2 table;

    Cook2(Table2 table) { this.table = table; }

    public void run() {
        while(true) {
            int idx = (int)(Math.random() * table.dishNum());
            table.add(table.dishNames[idx]);
            try { Thread.sleep(10); } catch(InterruptedException e) {}
        }
    }
}

class Table2 {
    String[] dishNames = { "donut", "donut", "burger" };
    final int MAX_FOOD = 6;
    private ArrayList<String> dishes = new ArrayList<>();

    public synchronized void add(String dish) {
        while(dishes.size() >= MAX_FOOD) {
            String name = Thread.currentThread().getName();
            System.out.println(name + " is waiting.");
            try {
                wait(); // COOK 쓰레드를 기다리게한다.
                Thread.sleep(500);
            } catch(InterruptedException e) {}
        }
        dishes.add(dish);
        notify();   // 기다리고 있는 CUST를 꺠우기 위한 코드
        System.out.println("Dishes: " + dishes.toString());
    }

    public void remove(String dishName) {
        synchronized (this) {
            String name = Thread.currentThread().getName();

            while(dishes.size()==0) {
                System.out.println(name+ " is waiting");
                try {
                    wait();
                    Thread.sleep(500);
                } catch(InterruptedException e) {}
            }

            while(true) {
                for(int i=0; i<dishes.size(); i++) {
                    if(dishName.equals((dishes.get(i)))) {
                        dishes.remove(i);
                        notify();   // 잠자고 있는 COOK을 꺠우기 위한 코드
                        return;
                    }
                }

                try {
                    System.out.println(name + " is waiting.");
                    wait(); // 원하는 음식이 없는 CUST쓰레드를 기다리게 함
                    Thread.sleep(500);
                } catch(InterruptedException e) {}
            }
        }
    }
    public int dishNum() { return dishNames.length; }
}

public class Ex13_15 {
    public static void main(String[] args) throws Exception {
        Table2 table = new Table2();

        new Thread(new Cook2(table), "COOK").start();
        new Thread(new Customer2(table, "donut"), "CUST1").start();
        new Thread(new Customer2(table, "burger"), "CUST2").start();
        Thread.sleep(2000);
        System.exit(0);
    }
}
