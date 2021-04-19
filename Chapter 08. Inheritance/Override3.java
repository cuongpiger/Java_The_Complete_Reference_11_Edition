class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i & j: " + i + " " + j);
    }
}

class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show(String msg) {
        System.out.println(msg + k);
    }
}

class Override3 {
    public static void main(String args[]) {
        B b = new B(1, 2, 3);

        b.show("Đây là k: "); // gọi hàm B.show()
        b.show(); // gọi hàm A.show()
    }
}