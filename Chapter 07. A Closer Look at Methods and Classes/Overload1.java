class OverloadDemo {
    void test() {
        System.out.println("Hàm test: ko tham số");
    }

    void test(int a, int b) {
        System.out.println("a và b: " + a + " - " + b);
    }

    void test(double a) {
        System.out.println("double a: " + a);
    }
}

class Overload1 {
    public static void main(String args[]) {
        OverloadDemo od = new OverloadDemo();
        int integer = 69;

        od.test();
        od.test(10, 20);

        od.test(integer); // gọi đến `test(double a)` do cơ chế thăng kiểu dữ liệu
        od.test(123.45);
    }
}
