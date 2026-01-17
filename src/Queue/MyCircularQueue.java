package Queue;

public class MyCircularQueue {

    int[] arr;
    int front, rear, size, capacity;

    public MyCircularQueue(int k) {
        capacity = k;
        arr = new int[k];
        front = 0;
        rear = 0;
        size = 0;
    }

    public boolean enQueue(int value) {
        if (isFull()) return false;
        arr[rear] = value;
        rear = (rear + 1) % capacity;
        size++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) return false;
        front = (front + 1) % capacity;
        size--;
        return true;
    }

    public int Front() {
        if (isEmpty()) return -1;
        return arr[front];
    }

    public int Rear() {
        if (isEmpty()) return -1;
        return arr[(rear - 1 + capacity) % capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }


    public static void main(String[] args) {
        MyCircularQueue ob = new MyCircularQueue(5);
        ob.enQueue(4);
        ob.enQueue(5);
        ob.enQueue(9);
        System.out.println(ob.Front());
        System.out.println(ob.Rear());
        System.out.println(ob.deQueue());
        System.out.println(ob.isFull());
        System.out.println(ob.isEmpty());

    }
}
