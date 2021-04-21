interface IntStack {
    void push(int item);
    int pop();
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

class IfTest2 {
    public static void main(String args[]) {
        DynStack stack1 = new DynStack(5);
        DynStack stack2 = new DynStack(8);

        for (int i = 0; i < 12; ++i) stack1.push(i);
        for (int i = 0; i < 20; ++i) stack2.push(i);

        System.out.println("--> stack1");
        for (int i = 0; i < 12; ++i) {
            System.out.println("    " + stack1.pop());
        }

        System.out.println("\n--> stack2");
        for (int i = 0; i < 20; ++i) {
            System.out.println("    " + stack2.pop());
        }
    }
}
