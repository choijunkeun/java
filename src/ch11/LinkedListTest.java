package ch11;

class LinkedListed {
    private Node head;      //  제일 첫번째 노드의 주소 저장
    private Node tail;      //  제일 마지막 노드의 주소 저장
    private int size = 0;   // 총 사이즈



    private class Node{ // 내부클래스 선언
        private Object data;
        private Node next;  // 누가 다음 노드인지를 저장하는 변수

        public Node(Object input) {
            this.data = input;
            this.next = null;
        }
        public String toString() {
            return String.valueOf(this.data);
        }
    }

    public void addFirst(Object input) {    // 앞에 데이터추가
        Node newNode = new Node(input);
        newNode.next = head;
        head = newNode;
        size++;
        if(head.next == null) {
            tail = head;
        }
    }

    public void addLast(Object input) {
        Node newNode = new Node(input);
        if(size == 0) {
            addFirst(input);
        } else {
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    Node node(int index) {
        Node x = head;
        for(int i=0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public void add(int k, Object input) {
        if(k == 0) {
            addFirst(input);
        } else {
            Node temp1 = node(k-1); // k idx의 이전 idx노드
            Node temp2 = temp1.next;      // temp1의 다음 노드,
            Node newNode = new Node(input);
            temp1.next = newNode;
            newNode.next = temp2;
            size++;
            if(newNode.next == null) {
                tail = newNode;
            }
        }
    }
    public String toString() {
        if(head == null) {
            return "[]";
        }
        Node temp = head;
        String str = "[";

        while(temp.next != null) {
            str += temp.data + ", ";
            temp = temp.next;
        }
        str += temp.data;

        return str + "]";
    }

    public Object removeFirst() {
        Node temp = head;
        head = head.next;
        Object returnData = temp.data;
        temp = null;
        size--;
        return returnData;
    }

}

public class LinkedListTest {
    public static void main(String[] args) {

        LinkedListed numbers = new LinkedListed();
        numbers.addLast(30);
        numbers.addLast(20);
        numbers.addLast(10);
        numbers.add(2, 25);


        System.out.println(numbers.removeFirst());

    }
}
