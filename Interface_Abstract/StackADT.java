// StackADT.java
// Example of Interface as an Abstract Data Type

// 1. Define the ADT using an interface
interface StackADT {
    void push(int item);
    int pop();
    boolean isEmpty();
}

// 2. Implementation using Array
class ArrayStack implements StackADT {
    private int[] arr = new int[10];
    private int top = -1;

    public void push(int item) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = item;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

// 3. Implementation using Linked List
class LinkedListStack implements StackADT {
    private Node head = null;

    private static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    public void push(int item) {
        Node newNode = new Node(item);
        newNode.next = head;
        head = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int val = head.data;
        head = head.next;
        return val;
    }

    public boolean isEmpty() {
        return head == null;
    }
}

// 4. Main class to test both implementations
public class Main {
    public static void main(String[] args) {
        // Using ArrayStack
        StackADT stack1 = new ArrayStack();
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        System.out.println("ArrayStack pop: " + stack1.pop());

        // Using LinkedListStack
        StackADT stack2 = new LinkedListStack();
        stack2.push(100);
        stack2.push(200);
        System.out.println("LinkedListStack pop: " + stack2.pop());

        // Notice: We never changed the code that uses the stack
        // This is the power of ADT + Interfaces
    }
}
