import javax.swing.text.SimpleAttributeSet;

class Stack {
    private int stack[];
    private int tos;

    Stack(int size) {
        stack = new int[size];
        tos = -1;
    }

    void push(int item) {
        if (tos == stack.length - 1) {
            System.out.println("Stack is full");
        } else {
            stack[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow");
            return 0;
        }

        return stack[--tos];
    }
}

class TestStack2 {
    int a = 10;

    public static void main(String args[]) {
        Stack stack1 = new Stack(5);
        Stack stack2 = new Stack(8);

        System.out.println("--> Đây là stack1:");
        for (int i = 0; i < 5; ++i) {
            System.out.println(stack1.pop());
        }

        System.out.println("--> Đây là stack2:");
        for (int i = 0; i < 8; ++i) {
            System.out.println(stack2.pop());
        }
    }
}
