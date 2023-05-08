package ch11;

import java.util.LinkedList;

public class CollectionTest {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.offer("1");

        list.push("2");
        list.push("22");
        list.push("222");

        list.add("3");
        list.add("33");
        list.add("333");


        System.out.println(list);



    }
}
