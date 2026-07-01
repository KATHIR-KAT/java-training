import java.util.*;

class PriorityQueueDemo1 {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(5);

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}