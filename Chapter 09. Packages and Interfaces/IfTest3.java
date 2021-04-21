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

class DynStack implements IntStack {
    private int stack[];
    private int tos;

    DynStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stack.length - 1) {
            int tmp[] = new int[stack.length * 2];
            for (int i = 0; i < stack.length; ++i) tmp[i] = stack[i];
            stack = tmp;
        }

        stack[++tos] = item;
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else {
            return stack[tos--];
        }
    }
}

class IfTest3 {
    public static void main(String args[]) {
        IntStack stack;
        DynStack stack1 = new DynStack(5);
        FixedStack stack2 = new FixedStack(8);

        stack = stack1;
        for (int i = 0; i < 12; ++i) stack.push(i);

        stack = stack2;
        for (int i = 0; i < 8; ++i) stack.push(i);

        stack = stack1;
        System.out.println("--> stack1 - Dynamic");
        for (int i = 0; i < 12; ++i) {
            System.out.println("    " + stack.pop());
        }

        stack = stack2;
        System.out.println("\n--> stack2 - Fixed");
        for (int i = 0; i < 8; ++i) {
            System.out.println("    " + stack.pop());
        }
    }
}