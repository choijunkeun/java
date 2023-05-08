package etc;

import javax.swing.*;


class ThreadTemp extends Thread {
    public void run() {
        for(int i=10; i>0; i--) {
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }

    }
}


class ThreadTest_2 {
    public static void main(String[] args) {
        ThreadTemp t1 = new ThreadTemp();

        t1.start();

        String input = JOptionPane.showInputDialog("값 입력 해주세요 ");
        System.out.println("입력하신 값은 " + input +" 입니다.");



    }
}
