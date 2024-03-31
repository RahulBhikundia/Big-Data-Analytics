public class Queue {
    private int arr[];
    private int capacity;
    private int front, rear;

    Queue(int size) {
        capacity = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    public Boolean isFull() {
        return (front == 0 && rear == capacity - 1);
    }

    public Boolean isEmpty() {
        return front == -1;
    }

    public void enque(int e) {
        if(isFull()) {
            System.out.println("Queue is full");
        }
        else {
            if(front==-1)
                front = 0;
            arr[++rear] = e;
            System.out.println("Inserted"+e);
        }
    }

    public int deque() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        else {
            int e = arr[front];
            if(front>=rear){
                front = -1;
                rear = -1;
            }
            else {
                front++;
            }
            System.out.println("Deleted -> "+e);
            return e;
        }
    }

    public void printQueue() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
        }
        else {
            System.out.print("Queue: ");
            for(int i=front; i<=rear; i++) {
                System.out.print(arr[i]+", ");
            }
            System.out.println();
        }
    }

    public static void main(String []args) {
        Queue q = new Queue(5);
        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.enque(4);
        q.enque(5);
        q.enque(6);
        q.printQueue();
        q.deque();
        q.printQueue();
    }
}
