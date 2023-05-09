package ch13;

// 동기화 되어 있는 예제
class Ex13_13 {
    public static void main(String[] args) {
        Runnable r = new RunnableEx13();
        new Thread(r).start();  //ThreadGroup에 의해 참조되므로 gc대상이 아님.
        new Thread(r).start();  //ThreadGroup에 의해 참조되므로 gc대상이 아님.
    }
}

class Account2 {
    private int balance = 1000; // private으로 해야 동기화의 의미가 있음.(다른데서 직접 접근해서 값을 변경할 수 있으면 의미없음)

    public synchronized int getBalance() {
        return balance;
    }

    public synchronized void withdraw(int money) {  // synchronized로 메서드를 동기화처리
        if(balance >= money) {
            try { Thread.sleep(1000); } catch(InterruptedException e) {}
            balance -= money;
        }
    }   // withdraw
}

class RunnableEx13 implements Runnable {
    Account2 acc = new Account2();

    public void run() {
        while(acc.getBalance() > 0) {
            // 100, 200, 300중의 한 값을 임의로 선택해서 출금(withdraw)
            int money = (int) (Math.random() * 3 + 1) * 100;
            acc.withdraw(money);
            System.out.println("balance : " + acc.getBalance());
        }
    }
}