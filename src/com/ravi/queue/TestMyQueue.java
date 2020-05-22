package com.ravi.queue;

public class TestMyQueue {
    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<>(5);
        queue.add("Ravindra");
        queue.add("Ved");
        queue.remove();
        queue.remove();
        queue.add("Shivay");
        queue.add("Ashish");
        queue.remove();
        queue.remove();
        queue.add("Somnath");
        queue.add("test");
        queue.remove();
        queue.remove();

        queue.add("afterRemove");
        queue.printQueue();
    }
}
