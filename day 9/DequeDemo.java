import java.util.*;

class DequeDemo  {
    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(10);
        dq.addLast(20);
        dq.addFirst(5);

        System.out.println(dq);

        System.out.println(dq.removeFirst());

        System.out.println(dq.removeLast());

        System.out.println(dq);
    }
}