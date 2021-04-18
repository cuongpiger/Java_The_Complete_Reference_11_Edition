class Stack {
    int stack[] = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    // Thêm một item vào `this.stack`
    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is full");
        } else {
            stack[++tos] = item;
        }
    }

    // Lấy + xóa phần tử đầu tiên ra khỏi `this.stack`
    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow");

            return 0;
        } else {
            return stack[tos--];
        }
    }
}

class TestStack {
    public static void main(String args[]) {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

        for (int i = 0; i < 10; ++i) {
            stack1.push(i);
        }

        for (int i = 10; i < 20; ++i) {
            stack2.push(i);
        }

        System.out.println("This is stack1");
        for (int i = 0; i < 10; ++i) {
            System.out.println(stack1.pop());
        }

        System.out.println("This is stack2");
        for (int i = 0; i < 10; ++i) {
            System.out.println(stack2.pop());
        }
    }
}