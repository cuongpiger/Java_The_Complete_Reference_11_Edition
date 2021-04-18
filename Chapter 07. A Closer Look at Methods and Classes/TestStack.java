class Stack {
    private int stack[] = new int[10];
    private int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is fulll");
        } else {
            stack[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow");
            return 0;
        }

        return stack[tos--];
    }
}

class TestStack {
    public static void main(String args[]) {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

        for (int i = 0; i < 10; ++i) stack1.push(i);
        for (int i = 10; i < 20; ++i) stack2.push(i);

        System.out.println("--> stack1:");
        for (int i = 0; i < 10; ++i) {
            System.out.println(stack1.pop());
        }

        System.out.println("--> stack2:");
        for (int i = 0; i < 10; ++i) {
            System.out.println(stack2.pop());
        }

        // stack1.tos = -2; // ko dc vì `tos` dc định nghĩa là private
        // stack2.stack[3] = 100; // ko dc vì `stack` dc định nghiã là private
    }
}
