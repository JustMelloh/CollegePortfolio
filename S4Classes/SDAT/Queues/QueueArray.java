package Queues;

public class QueueArray {
    private int[] arr;
    private int backOfQueue;
    int beginning;
    int nItems;

    public QueueArray(int size) {
        this.arr = new int[size];
        this.backOfQueue = -1;
        this.beginning = -1;
        this.nItems = 0;
        System.out.println("Queue has been created with size of: " + size);
    }

    /* Check if Queue is full */

    public boolean isFull() {
        if (backOfQueue == arr.length - 1) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isEmpty() {
        if (beginning == -1 || beginning == arr.length) {
            return true;
        } else {
            return false;
        }
    }

    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else if (isEmpty()){
            beginning = 0;
            backOfQueue++;
            arr[backOfQueue] = value;
            System.out.println(value + " has been enqueued");
        } else {
            backOfQueue++;
            nItems++;
            arr[backOfQueue] = value;
            System.out.println(value + " has been enqueued");

        }

    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int result = arr[beginning];
            beginning++;
            if (beginning > backOfQueue) {
                beginning = backOfQueue = -1;
            }
            System.out.println(result + " has been dequeued");
            return result;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            System.out.println("The front of the queue is: " + arr[beginning]);
            return arr[beginning];
        }
    }
}