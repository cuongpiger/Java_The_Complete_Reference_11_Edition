interface IntStack {
    void push(int item);
    int pop();
}

class FixedStack implements IntStack {
    private int stack[];
    private int tos;

    FixedStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stack.length - 1) {
            System.out.println("Stack is full.");
        } else {
            stack[++tos] = item;
        }
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        }

        return stack[tos--];
    }
}

class IfTest {
    public static void main(String args[]) {
        FixedStack stack1 = new FixedStack(5);
        FixedStack stack2 = new FixedStack(8);

        for (int i = 0; i < 5; ++i) stack1.push(i);
        for (int i = 0; i < 8; ++i) stack2.push(i);

        System.out.println("--> stack1");
        for (int i = 0; i < 5; ++i) {
            System.out.println("    " + stack1.pop());
        }

        System.out.println("\n--> stack2");
        for (int i = 0; i < 8; ++i) {
            System.out.println("    " + stack2.pop());
        }
    }
}
