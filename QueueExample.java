import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
               queue.add("Rahul");
        queue.add("Anil");
        queue.add("Priya");
        queue.add("Sneha");
        System.out.println("Queue elements:");
        System.out.println(queue);
        System.out.println("First element: " + queue.peek());
        queue.remove();
        System.out.println("After removing first element:");
        System.out.println(queue);
              System.out.println("Queue size: " + queue.size());
    }
}

OUTPUT:
Queue elements:
[Rahul, Anil, Priya, Sneha]
First element: Rahul
After removing first element:
[Anil, Priya, Sneha]
Queue size: 3
