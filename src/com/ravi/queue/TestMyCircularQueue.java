package com.ravi.queue;

public class TestMyCircularQueue {
    public static void main(String[] args) {
        MyCircularQueue<String> queue = new MyCircularQueue<>(5);
        queue.add("Ravindra");
        queue.add("Ved");
        queue.remove();
        queue.add("Shivay");
        queue.remove();
        queue.add("Ashish");
        queue.remove();
        queue.add("Somnath");
        queue.add("test");
        queue.remove();
        queue.add("afterRemove");
        queue.remove();
        queue.printQueue();

        MyCircularQueue<String> queue2 = new MyCircularQueue<>(3);
        queue2.add("Ravindra");
        queue2.add("Ved");
        queue2.add("Shivay");
        queue2.add("Chittu");
        queue2.remove();
        queue2.add("Ashish");
        queue2.remove();
        queue2.add("Somnath");
        queue2.add("test");
        queue2.remove();
        queue2.add("afterRemove");
        queue2.remove();
        queue2.printQueue();
    }
}
