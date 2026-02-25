import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class P07_QueueCollection {

    public static void main(String[] args) {
        System.out.println("--- Queue using LinkedList (FIFO) ---");
        Queue<String> queue = new LinkedList<>();
        queue.offer("Task1");
        queue.offer("Task2");
        queue.offer("Task3");
        System.out.println("Queue: " + queue);
        System.out.println("Peek (head): " + queue.peek());
        System.out.println("Poll (remove head): " + queue.poll());
        System.out.println("Queue after poll: " + queue);

        System.out.println("\n--- PriorityQueue (natural ordering) ---");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(40);
        pq.offer(10);
        pq.offer(30);
        pq.offer(20);
        System.out.println("PriorityQueue: " + pq);
        System.out.println("Poll order (min first): ");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println();

        System.out.println("\n--- ArrayDeque (Double-Ended Queue) ---");
        Deque<String> deque = new ArrayDeque<>();
        deque.offerFirst("Middle");
        deque.offerFirst("Front");
        deque.offerLast("Back");
        System.out.println("Deque: " + deque);
        System.out.println("PeekFirst: " + deque.peekFirst());
        System.out.println("PeekLast: " + deque.peekLast());
        deque.pollFirst();
        System.out.println("After pollFirst: " + deque);
        deque.pollLast();
        System.out.println("After pollLast: " + deque);
    }
}
