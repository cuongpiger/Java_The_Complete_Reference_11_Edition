class OverloadDemo {
    void test() {
        System.out.println("Hàm test: ko tham số");
    }

    void test(int a) {
        System.out.println("a: " + a);
    }

    void test(int a, int b) {
        System.out.println("a và b: " + a + " - " + b);
    }

    double test(double a) {
        System.out.println("double a: " + a);
        return a*a;
    }
}

class Overload {
    public static void main(String args[]) {
        OverloadDemo od = new OverloadDemo();
        double res;

        od.test();
        od.test(10);
        od.test(10, 20);
        res = od.test(123.45);
        System.out.println("Kết quả của od.test(123.45) là: " + res);
    }
}
