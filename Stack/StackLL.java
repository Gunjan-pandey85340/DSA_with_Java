public class StackLL {
    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Stack class
    static class Stack {
        static Node head = null;

        // Check if the stack is empty
        public static boolean isEmpty() {
            return head == null;
        }

        // Push operation
        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // Pop operation
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack underflow");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // Peek operation
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }
    }

    // Main method
    public static void main(String[] args) {
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);

        while (!Stack.isEmpty()) {
            System.out.println(Stack.peek());
            Stack.pop();
        }
    }
}
