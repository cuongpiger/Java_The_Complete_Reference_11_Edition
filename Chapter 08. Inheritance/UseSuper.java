class A {
    int i;
}

class B extends A {
    int i; // biến nay sẽ ẩn biến i trong A, tức bây h gọi i thì Java sẽ hiểu là gọi B.i

    B(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("i trong lớp cha A: " + super.i);
        System.out.println("i trong lớp con B: " + i);
    }
}

class UseSuper {
    public static void main(String args[]) {
        B b = new B(1, 2);

        b.show();
    }
}
