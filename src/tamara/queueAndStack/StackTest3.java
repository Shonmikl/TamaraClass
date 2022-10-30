package tamara.queueAndStack;

public class StackTest3 {
    public static void main(String[] args) {
        testStack();
        testQueue();
    }

    private static void testQueue() {
        QueueImpl<Integer> queue = new QueueImpl<>();
        for (int i = 1; i < 10; i++) {
            System.out.print(i);
            queue.add(i);
        }

        System.out.println("\n");

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }

    private static void testStack() {
        StackImpl<Integer> queue = new StackImpl<>();
        for (int i = 1; i < 10; i++) {
            System.out.print(i);
            queue.push(i);
        }

        System.out.println("\n");

        while (!queue.isEmpty()) {
            System.out.println(queue.pop());
        }
    }
}