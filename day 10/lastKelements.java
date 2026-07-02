import java.util.*;

public class lastKelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<Integer> q = new ArrayDeque<>();
        Stack<Integer> st = new Stack<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            q.offer(sc.nextInt());
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        if (k > n || k <= 0) {
            System.out.println("Invalid k");
            return;
        }

        ArrayDeque<Integer> temp = new ArrayDeque<>();

        for (int i = 0; i < n - k; i++) {
            temp.offer(q.poll());
        }

   
        while (!q.isEmpty()) {
            st.push(q.poll());
        }

     
        while (!temp.isEmpty()) {
            q.offer(temp.poll());
        }

    
        while (!st.isEmpty()) {
            q.offer(st.pop());
        }

        System.out.println("Queue after reversing last " + k + " elements:");
        System.out.println(q);
    }
}