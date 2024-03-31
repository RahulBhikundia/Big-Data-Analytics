public class Stack {
    private int arr[];
    private int capacity;
    private int top;

    Stack(int size) {
        capacity = size;
        arr = new int[size];
        top = -1;
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    public Boolean isFull() {
        return top == capacity-1;
    }

    public int getSize() {
        return top+1;
    }

    public void push(int data) {
        if(isFull()) {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
        System.out.println("Inserting "+data);
        arr[++top] = data;
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack Empty");
            System.exit(1);
        }
        
        return arr[top--];
    }

    public void printStack() {
        for(int i=0; i<=top; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }

    public static void main(String []args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.print("Stack:");
        stack.printStack();
        stack.pop();
        System.out.print("After popping an element:");
        stack.printStack();
    }
} 