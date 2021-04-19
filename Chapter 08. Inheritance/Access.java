class A {
    int i;
    private int j;

    void setij(int x, int y) {
        i = x; j = y;
    }
}

class B extends A {
    int total; // default khi biến dc khai báo Java sẽ assign nó bằng 0

    void sum() {
        // total = i + j; // dòng này lỗi, do biến j chỉ dc định nghĩa là private, nên
                // các lớp khác dù có kế thừa cũng ko thể sử dụng biến này
        System.out.println("Đây là B.sum()");
    }
}

class Access {
    public static void main(String args[]) {
        B b = new B();
        b.setij(10, 12);
        b.sum();

        System.out.println("B.total = " + b.total);
    }
}