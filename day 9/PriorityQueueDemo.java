import java.util.*;

class PriorityQueueDemo {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(5);

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}