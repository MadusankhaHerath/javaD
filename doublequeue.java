import java.util.LinkedList;
import java.util.Queue;

public class doublequeue {
    public static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();

        // Add elements to both queues
        queue1.add(1);
        queue1.add(2);
        queue2.add(10);
        queue2.add(20);

        System.out.println("Queue1: " + queue1);
        System.out.println("Queue2: " + queue2);

        // Remove from both queues
        System.out.println("Removed from Queue1: " + queue1.poll());
        System.out.println("Removed from Queue2: " + queue2.poll());

        System.out.println("Queue1 now: " + queue1);
        System.out.println("Queue2 now: " + queue2);
    }
}
